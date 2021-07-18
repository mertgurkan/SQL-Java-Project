public class Nurse {

	String licensenum;
	String name;
	String locname;
	public Nurse(String licensenum, String name, String locname) {
		super();
		this.licensenum = licensenum;
		this.name = name;
		this.locname = locname;
	}
	public String getLicensenum() {
		return licensenum;
	}
	public void setLicensenum(String licensenum) {
		this.licensenum = licensenum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocname() {
		return locname;
	}
	public void setLocname(String locname) {
		this.locname = locname;
	}
}
