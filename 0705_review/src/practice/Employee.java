package practice;

public class Employee {
	String name;
	String position;
	String department;
	public static int cnt;
	
	Employee(){
		cnt ++;
	}
	Employee(String name, String position, String department){
		this.name = name;
		this.position = position;
		this.department = department;
		cnt ++;
	}
	
	public String toString () {
		return "이름 : " + name + " 직급 : " + position + " 부서 : " + department;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
