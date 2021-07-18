import java.time.LocalDate;

public class Person {
	private String hinsurnum;
	private String cname;
	private String name;
	private LocalDate dob;
	private String gender;
	private long phone;
	private String streetaddr;
	private String city;
	private int postalcd;
	private LocalDate regdate;

	public Person(String hinsurnum, String cname, String name, LocalDate dob, String gender, long phone,
			String streetaddr, String city, int postalcd, LocalDate regdate) {
		super();
		this.hinsurnum = hinsurnum;
		this.cname = cname;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.phone = phone;
		this.streetaddr = streetaddr;
		this.city = city;
		this.postalcd = postalcd;
		this.regdate = regdate;
	}

	public String getHinsurnum() {
		return hinsurnum;
	}

	public void setHinsurnum(String hinsurnum) {
		this.hinsurnum = hinsurnum;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getStreetaddr() {
		return streetaddr;
	}

	public void setStreetaddr(String streetaddr) {
		this.streetaddr = streetaddr;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPostalcd() {
		return postalcd;
	}

	public void setPostalcd(int postalcd) {
		this.postalcd = postalcd;
	}

	public LocalDate getRegdate() {
		return regdate;
	}

	public void setRegdate(LocalDate regdate) {
		this.regdate = regdate;
	}

	public void addPersonDetails() {
		String sql = "INSERT INTO person VALUES ('" + hinsurnum + "','" + cname + "','" + name + "' ,'" + gender + "','"
				+ dob + "','" + String.valueOf(phone) + "','" + city + "','" + postalcd + "','" + streetaddr + "','"
				+ regdate + "')";
		boolean add = Data.MangmentQueries(sql);
		if (add) {
			System.out.println(" Person details added Successufully..");

		} else {
			System.out.println(" Error during adding person ");
		}

	}

	public void updatePersonDetails(String insurnum) {

		String sql = "update person set hinsurnum = '" + insurnum + "' , cname = '" + cname + "', name = '" + name
				+ "' , gender = '" + gender + "' , dob = '" + dob + "' , phone = '" + String.valueOf(phone)
				+ "' , city = '" + city + "' , postalcd = '" + postalcd + "' , streetaddr = '" + streetaddr
				+ "' , regdate = '" + regdate + "' where hinsurnum = '" + insurnum + "'";
		boolean update = Data.MangmentQueries(sql);
		if (update) {
			System.out.println(" Person details updated Successufully..");
		} else {
			System.out.println("Error Durring update");
		}
	}
}
