import java.time.LocalDate;

public class VaccineBatch {

	private String batchno;
	private String vialid;
	private String vname;
	private String locname;
	private LocalDate mfgdate;
	private LocalDate exprydate;
	private int numdoses;
	public VaccineBatch(String batchno, String vialid, String vname, String locname, LocalDate mfgdate,
			LocalDate exprydate, int numdoses) {
		super();
		this.batchno = batchno;
		this.vialid = vialid;
		this.vname = vname;
		this.locname = locname;
		this.mfgdate = mfgdate;
		this.exprydate = exprydate;
		this.numdoses = numdoses;
	}
	public String getBatchno() {
		return batchno;
	}
	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}
	public String getVialid() {
		return vialid;
	}
	public void setVialid(String vialid) {
		this.vialid = vialid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public String getLocname() {
		return locname;
	}
	public void setLocname(String locname) {
		this.locname = locname;
	}
	public LocalDate getMfgdate() {
		return mfgdate;
	}
	public void setMfgdate(LocalDate mfgdate) {
		this.mfgdate = mfgdate;
	}
	public LocalDate getExprydate() {
		return exprydate;
	}
	public void setExprydate(LocalDate exprydate) {
		this.exprydate = exprydate;
	}
	public int getNumdoses() {
		return numdoses;
	}
	public void setNumdoses(int numdoses) {
		this.numdoses = numdoses;
	}
	
}
