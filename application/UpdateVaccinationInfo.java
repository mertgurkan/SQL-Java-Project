import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class UpdateVaccinationInfo {

	private Scanner scan;

	public void updateInfo() throws DateTimeException{
		scan = new Scanner(System.in);
		System.out.println("Enter nurse Lisence No.(n001, n002, .....)");
		String licensenum = scan.nextLine();
		System.out.println("Enter insurance id (IN001, IN002, .....)");
		String hinsurnum = scan.nextLine();
		System.out.println("Enter vial id (v001, v002, .....)");
		String vialid = scan.nextLine();
		System.out.println("Enter Slot (first, second,....,five)");
		String vslot = scan.nextLine();
		System.out.println("Enter Vaccination Date (YYYY-MM-DD)");
		String date1 = scan.nextLine();
		DateTimeFormatter formatters = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate vdate = LocalDate.parse(date1, formatters);
		System.out.println("Enter Dose number ");
		int numdoses = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter hospital name ");
		String locname = scan.nextLine();

		if (Data.getVialId(hinsurnum).equals(vialid)) {
			VaccinationInfo vaccinationInfo = new VaccinationInfo(licensenum, hinsurnum, vialid, vslot, vdate, numdoses,
					locname);
			vaccinationInfo.updateVaccinationInfo(hinsurnum);
		} else if (Data.getVialId(hinsurnum).equals("")) {
			VaccinationInfo vaccinationInfo = new VaccinationInfo(licensenum, hinsurnum, vialid, vslot, vdate, numdoses,
					locname);
			vaccinationInfo.addVaccinationInfo();
		} else {
			System.out.println("Vaccine is from differenet brand then previous vaccine");
		}
	}
}
