import java.text.ParseException;
import java.time.DateTimeException;
import java.util.Scanner;

public class VaccineApplication {

	private static Scanner scan;

	public static void main(String[] args) throws ParseException {
		int option = 0;
		do {
			System.out.println("\r\nVaccineApp Main Menu");
			System.out.println("1. Add a Person\r\n" + "2. Assign a slot to a Person\r\n"
					+ "3. Enter Vaccination information\r\n" + "4. Exit Application");
			System.out.println("Please Enter Your Option:");
			scan = new Scanner(System.in);
			option = scan.nextInt();
			switch (option) {
			case 1:
				AddPerson addPerson = new AddPerson();
				try{
				addPerson.add();
				}catch(DateTimeException ex){
					System.out.println("Enter Date or Time in proper format");
				}
				break;
			case 2:
				AssignSlot assignSlot = new AssignSlot();
				try{
				assignSlot.assign();
				}catch(DateTimeException ex){
					System.out.println("Enter Date or Time in proper format");
				}
				break;
			case 3:
				UpdateVaccinationInfo vaccinationInfo = new UpdateVaccinationInfo();
				try{
				vaccinationInfo.updateInfo();
				}catch(DateTimeException ex){
					System.out.println("Enter Date or Time in proper format");
				}
				break;
			case 4:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Please Enter Your Option:");
			}
		} while (option < 4);
		scan.close();
		
	}
}
