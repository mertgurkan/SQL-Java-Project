import java.time.LocalDate;

public class NurseAssignenments {

	private int assignid;
	private String licensenum;
	private String locname;
	private LocalDate vdate;
	public NurseAssignenments(int assignid, String licensenum, String locname, LocalDate vdate) {
		super();
		this.assignid = assignid;
		this.licensenum = licensenum;
		this.locname = locname;
		this.vdate = vdate;
	}
	public int getAssignid() {
		return assignid;
	}
	public void setAssignid(int assignid) {
		this.assignid = assignid;
	}
	public String getLicensenum() {
		return licensenum;
	}
	public void setLicensenum(String licensenum) {
		this.licensenum = licensenum;
	}
	public String getLocname() {
		return locname;
	}
	public void setLocname(String locname) {
		this.locname = locname;
	}
	public LocalDate getVdate() {
		return vdate;
	}
	public void setVdate(LocalDate vdate) {
		this.vdate = vdate;
	}
	
}
