import java.time.LocalDate;
import java.time.LocalTime;


public class VaccSlot {

	private String locname;
	private LocalTime vtime;
	private String vslot;
	private LocalDate vdate;
	private String licensenum;
	private String vialid;
	private String hinsurnum;
	private LocalDate asgndate;
	private String vname;
	private String batchno;
	public VaccSlot( String locname, LocalTime vtime, String vslot, LocalDate vdate, String licensenum,
			String vialid, String hinsurnum, LocalDate asgndate, String vname, String batchno) {
		super();
		this.locname = locname;
		this.vtime = vtime;
		this.vslot = vslot;
		this.vdate = vdate;
		this.licensenum = licensenum;
		this.vialid = vialid;
		this.hinsurnum = hinsurnum;
		this.asgndate = asgndate;
		this.vname = vname;
		this.batchno = batchno;
	}
	
	

	public String getLocname() {
		return locname;
	}
	public void setLocname(String locname) {
		this.locname = locname;
	}
	public LocalTime getVtime() {
		return vtime;
	}
	public void setVtime(LocalTime vtime) {
		this.vtime = vtime;
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
	public String getLicensenum() {
		return licensenum;
	}
	public void setLicensenum(String licensenum) {
		this.licensenum = licensenum;
	}
	public String getVialid() {
		return vialid;
	}
	public void setVialid(String vialid) {
		this.vialid = vialid;
	}
	public String getHinsurnum() {
		return hinsurnum;
	}
	public void setHinsurnum(String hinsurnum) {
		this.hinsurnum = hinsurnum;
	}
	public LocalDate getAsgndate() {
		return asgndate;
	}
	public void setAsgndate(LocalDate asgndate) {
		this.asgndate = asgndate;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public String getBatchno() {
		return batchno;
	}
	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}
	
	public void addAssignSlotDetails() {
		String sql = "insert into  vaccslot(loc_name, vtime,vslot,vdate,licensenum,vial_id ,hinsurnum,asgndate,vname,batchno) "
				+ "values('" + locname + "','" + vtime + "','" + vslot + "' ,'" + vdate + "','"
				+ licensenum + "','" + vialid + "','" + hinsurnum + "','" + asgndate + "','" + vname + "','" + batchno + "')";
		boolean add = Data.MangmentQueries(sql);
		if (add) {
			System.out.println(" Vaccine Slot Assigned Successfull ");

		} else {
			System.out.println(" Error during slot assignment ");
		}
	}
	public void updateSlotDetails(String hinsurnum) {
	       
		String sql = "update vaccslot set loc_name = '" + locname + "' , vtime = '" + vtime + "', vslot = '" + vslot
				+ "' , vdate = '" + vdate + "' , licensenum = '" + licensenum + "' , vial_id = '" + vialid + "' , hinsurnum = '" + hinsurnum
				+ "' , asgndate = '" + asgndate + "' , vname = '" + vname + "' , batchno = '" + batchno
				+ "' where hinsurnum = '" + hinsurnum + "'";
		boolean update = Data.MangmentQueries(sql);
		
		if (update) {
			System.out.println(" Vaccine Slot updated Successufully..");
		} else {
			System.out.println("Error Durring update");
		}
	}
}
