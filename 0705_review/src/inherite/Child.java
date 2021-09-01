package inherite;

public class Child extends Person {
	
	private int grade;
	private boolean student;
	
	Child(){}
	
	Child(String name, String regNum){
		super(name, regNum);
	}
	
	Child(String name, String regNum, int grade, boolean student){
		super(name, regNum);
		this.grade = grade;
		this.student = student;		
	}
	@Override
	public String toString() {
		return super.toString();
	}
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public boolean getStudent() {
		return student;
	}
	public void setStudent(boolean student) {
		this.student = student;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Child)) return false;
		if (this.student == ((Child)o).student) return true;
		else return false;
	}

	
}
