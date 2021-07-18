public class Hospital {

	private int hospitalId;
	private String locname;
	
	public Hospital(int hospitalId, String locname) {
		super();
		this.hospitalId = hospitalId;
		this.locname = locname;
	}
	public int getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}
	public String getLocname() {
		return locname;
	}
	public void setLocname(String locname) {
		this.locname = locname;
	}	
}
