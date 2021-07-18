import java.time.LocalDate;


public class VaccinationInfo {
	private String licensenum;
	private String hinsurnum;
	private String vialid;
	private String vslot;
	private LocalDate vdate;
	private int numdoses;
	private String locname;
	public VaccinationInfo(String licensenum, String hinsurnum, String vialid, String vslot, LocalDate vdate,
			 int numdoses, String locname) {
		super();
		this.licensenum = licensenum;
		this.hinsurnum = hinsurnum;
		this.vialid = vialid;
		this.vslot = vslot;
		this.vdate = vdate;
		this.numdoses = numdoses;
		this.locname = locname;
	}
	public String getLicensenum() {
		return licensenum;
	}
	public void setLicensenum(String licensenum) {
		this.licensenum = licensenum;
	}
	public String getHinsurnum() {
		return hinsurnum;
	}
	public void setHinsurnum(String hinsurnum) {
		this.hinsurnum = hinsurnum;
	}
	
	public String getVialid() {
		return vialid;
	}
	public void setVialid(String vialid) {
		this.vialid = vialid;
	}
	public String getVslot() {
		return vslot;
	}
	public void setVslot(String vslot) {
		this.vslot = vslot;
	}
	public LocalDate getVdate() {
		return vdate;
	}
	public void setVdate(LocalDate vdate) {
		this.vdate = vdate;
	}
	public int getNumdoses() {
		return numdoses;
	}
	public void setNumdoses(int numdoses) {
		this.numdoses = numdoses;
	}
	public String getLocname() {
		return locname;
	}
	public void setLocname(String locname) {
		this.locname = locname;
	}
	
	public void addVaccinationInfo() {
		String sql = "insert into  vaccination_info(licensenum, hinsurnum,vial_id,vslot,vdate,numdoses ,loc_name) "
				+ "values('" + licensenum + "','" + hinsurnum + "','" + vialid + "' ,'" + vslot + "','"
				+ vdate + "','" + numdoses + "','" + locname + "')";
		boolean add = Data.MangmentQueries(sql);
		if (add) {
			System.out.println(" Vaccination Info Added Successfull ");

		} else {
			System.out.println("Error in adding");
		}
	}
	public void updateVaccinationInfo(String hinsurnum) {
	       
		String sql = "update vaccination_info set licensenum = '" + licensenum + "' , hinsurnum = '" + hinsurnum + "', vial_id = '" + vialid
				+ "' , vslot = '" + vslot + "' , vdate = '" + vdate + "' , numdoses = '" + numdoses
				+ "' , loc_name = '" + locname + "'  where hinsurnum = '" + hinsurnum + "'";
		boolean update = Data.MangmentQueries(sql);
		if (update) {
			System.out.println("Vaccination Information updated Successufully..");
		} else {
			System.out.println("Error Durring update");
		}
	}
}
