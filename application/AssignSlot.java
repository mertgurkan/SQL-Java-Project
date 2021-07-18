import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class AssignSlot {

	private Scanner scan;

	public void assign() throws DateTimeException {
		scan = new Scanner(System.in);
		System.out.println("Enter nurse Lisence No. (n001, n002, ....)");
		String licensenum = scan.nextLine();
		System.out.println("Enter Insurance id of persons (IN001, IN002, .....)");
		String hinsurnum = scan.nextLine();
		LocalDate asgndate = LocalDate.now();
		DateTimeFormatter formatters = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		System.out.println("Enter Vaccination Date (YYYY-MM-DD)");
		String date1 = scan.nextLine();
		formatters = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate vdate = LocalDate.parse(date1, formatters);
		System.out.println("Enter Slot (first, second,..., five)");
		String vslot = scan.nextLine();
		System.out.println("Enter Time (HH:mm:ss)");
		String time = scan.nextLine();
		DateTimeFormatter convert = DateTimeFormatter.ofPattern("H:mm:ss");
		LocalTime vtime = LocalTime.parse(time, convert);
		System.out.println("Enter Vial id (v001, v002, v003 and v004)");
		String vialid = scan.nextLine();
		System.out.println("Enter hospital name ");
		String locname = scan.nextLine();
		System.out.println("Enter Vaccine Batch No. (b001, b002, ....) ");
		String batchno = scan.nextLine();
		System.out.println("Enter vaccine name");
		String vname = scan.nextLine();
		int numofdoses = Data.checkForVialid(hinsurnum);
		if (numofdoses == -1) {
			boolean assignedStatus = false;
			do {
				if (!Data.checkForVaccineSlot(vslot, vdate, locname)) {
					VaccSlot vaccSlot = new VaccSlot(locname, vtime, vslot, vdate, licensenum, vialid, hinsurnum,
							asgndate, vname, batchno);
					vaccSlot.addAssignSlotDetails();
					assignedStatus = true;
				} else {
					System.out.println("Please alot another slot. This slot is already booked");
					System.out.println("Enter New Vaccine Slot");
					vslot = scan.nextLine();
					System.out.println("Enter new Vaccine Date (yyyy-MM-dd)");
					String date2 = scan.nextLine();
					vdate = LocalDate.parse(date2, formatters);
					System.out.println("Enter new Time (HH:mm:ss)");
					String time1 = scan.nextLine();
					vtime = LocalTime.parse(time1, convert);
				}
			} while (assignedStatus == false);
		} else if (numofdoses > 0 && numofdoses < Data.getRequiredDoses(vname)) {
			boolean assignedStatus = false;
			do {
				if (!Data.checkForVaccineSlot(vslot, vdate, locname)) {
					VaccSlot vaccSlot = new VaccSlot(locname, vtime, vslot, vdate, licensenum, vialid, hinsurnum,
							asgndate, vname, batchno);
					vaccSlot.updateSlotDetails(hinsurnum);
					assignedStatus = true;
				} else {
					System.out.println("Please alot another slot. This slot is already booked");
					System.out.println("Enter New Vaccine Slot");
					vslot = scan.nextLine();
					System.out.println("Enter new Vaccine Date (yyyy-MM-dd)");
					String date2 = scan.nextLine();
					vdate = LocalDate.parse(date2, formatters);
					System.out.println("Enter new Time (HH:mm:ss)");
					String time2 = scan.nextLine();
					vtime = LocalTime.parse(time2, convert);
				}
			} while (assignedStatus == false);
		} else {
			System.out.println("Person Has Already Completed the Requried Amount of Doses");
		}
	}
}
