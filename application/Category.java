public class Category {
	private String cname;
	private Long prioritynum;
	public Category(String cname, Long prioritynum) {
		super();
		this.cname = cname;
		this.prioritynum = prioritynum;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Long getPrioritynum() {
		return prioritynum;
	}
	public void setPrioritynum(Long prioritynum) {
		this.prioritynum = prioritynum;
	}
	
}
