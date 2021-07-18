import java.time.LocalDate;

public class VaccDates {

	private LocalDate vdate;
	private String locname;
	public VaccDates(LocalDate vdate, String locname) {
		super();
		this.vdate = vdate;
		this.locname = locname;
	}
	public LocalDate getVdate() {
		return vdate;
	}
	public void setVdate(LocalDate vdate) {
		this.vdate = vdate;
	}
	public String getLocname() {
		return locname;
	}
	public void setLocname(String locname) {
		this.locname = locname;
	}
	
}
