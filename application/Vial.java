public class Vial {

	private String vialid;
	private String vname;
	private String batchno;
	public Vial(String vialid, String vname, String batchno) {
		super();
		this.vialid = vialid;
		this.vname = vname;
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
	public String getBatchno() {
		return batchno;
	}
	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}

}
