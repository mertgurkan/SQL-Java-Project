import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AddPerson {
	private Scanner scan;

	public void add() throws DateTimeException {
		scan = new Scanner(System.in);
		System.out.println("Enter your insurance id (IN001, IN002, .....)");
		String hinsurnum = scan.nextLine();
		System.out.println("Enter your name ");
		String name = scan.nextLine();
		System.out.print("Enter your dob (yyyy-MM-dd)");
		String date = scan.nextLine();
		DateTimeFormatter formatters = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dob = LocalDate.parse(date, formatters);
		System.out.println("SELECT YOUR CATEGORY NAME: ");
		System.out.println("1. Health Workers\r\n"
				+ "2. Above 50 years\r\n"
				+ "3. Between 18 and 50 years\r\n"
				+ "4. Below 18 years");
		String cname;
		int num = scan.nextInt();
		scan.nextLine();
		switch(num) {
		case 1:
			cname = "Health Workers";
			break;
		case 2:
			cname = "Above 50 years";
			break;
		case 3:
			cname = "Between 18 and 50 years";
			break;
		case 4:
			cname = "Below 18 years";
			break;
		default:
			cname = "You have not selected any category";
		}
		System.out.println("Enter your gender:\r\n"
				+ " 1. Male\r\n "
				+ "2. Female\r\n"
				+ "3. Other");
		String gender;
	    num = scan.nextInt();
		scan.nextLine();
		switch(num) {
		case 1:
			gender = "Male";
			break;
		case 2:
			gender = "Female";
			break;
		case 3:
			gender = "Others";
			break;
		default:
			gender = "You have not selected any gender";
		}
		System.out.println("Enter your phone no.");
		long phone = scan.nextLong();
		scan.nextLine();
		System.out.println("Enter your Street address ");
		String streetaddr = scan.nextLine();
		System.out.println("Enter city ");
		String city = scan.nextLine();
		System.out.println("Enter postal code");
		int postalcd = scan.nextInt();
		scan.nextLine();
		LocalDate regdate = LocalDate.now();
		if (Data.checkPersonExist(hinsurnum)) {
			System.out.println("Insurance id already exist");
			System.out.println("Do you want to update your information");
			System.out.println("1. Update your information\r\n" + "2. Exit");
			int value = scan.nextInt();
			switch (value) {
			case 1:
				Person person = new Person(hinsurnum, cname, name, dob, gender, phone, streetaddr, city, postalcd,
						regdate);
				person.updatePersonDetails(hinsurnum);
				break;
			case 2:
				System.out.println("Redirecting to main menu");
				break;
			}
		} else {
			Person person = new Person(hinsurnum, cname, name, dob, gender, phone, streetaddr, city, postalcd, regdate);
			person.addPersonDetails();
		}
	}

}
