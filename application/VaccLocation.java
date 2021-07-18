public class VaccLocation {

	private String locname;
	private String lstreetaddr;
	private String lcity;
	private String lpostalcd;
	public VaccLocation(String locname, String lstreetaddr, String lcity, String lpostalcd) {
		super();
		this.locname = locname;
		this.lstreetaddr = lstreetaddr;
		this.lcity = lcity;
		this.lpostalcd = lpostalcd;
	}
	public String getLocname() {
		return locname;
	}
	public void setLocname(String locname) {
		this.locname = locname;
	}
	public String getLstreetaddr() {
		return lstreetaddr;
	}
	public void setLstreetaddr(String lstreetaddr) {
		this.lstreetaddr = lstreetaddr;
	}
	public String getLcity() {
		return lcity;
	}
	public void setLcity(String lcity) {
		this.lcity = lcity;
	}
	public String getLpostalcd() {
		return lpostalcd;
	}
	public void setLpostalcd(String lpostalcd) {
		this.lpostalcd = lpostalcd;
	}

}
