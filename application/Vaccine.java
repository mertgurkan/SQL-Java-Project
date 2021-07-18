public class Vaccine {
	private String vname;
	private String waitperiod;
	private int doses;
	public Vaccine(String vname, String waitperiod, int doses) {
		super();
		this.vname = vname;
		this.waitperiod = waitperiod;
		this.doses = doses;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public String getWaitperiod() {
		return waitperiod;
	}
	public void setWaitperiod(String waitperiod) {
		this.waitperiod = waitperiod;
	}
	public int getDoses() {
		return doses;
	}
	public void setDoses(int doses) {
		this.doses = doses;
	}

}
