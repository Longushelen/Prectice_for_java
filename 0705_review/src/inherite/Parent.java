package inherite;

public class Parent extends Person {

	private String job;
	private String isMarry;
	
	public Parent() {}
	
	public Parent(String name, String regNum) {
		super(name, regNum);
	}
	public Parent(String name, String regNum, String job, String isMarry) {
		this.job = job;
		this.isMarry = isMarry;
	}
	@Override
	public String toString() {
		return super.toString();
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}

	public String getIsMarry() {
		return isMarry;
	}

	public void setIsMarry(String isMarry) {
		this.isMarry = isMarry;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Parent)) return false;
		if (this.job == ((Parent)o).job && this.isMarry == ((Parent)o).isMarry) return true;
		else return false;
	}
}
