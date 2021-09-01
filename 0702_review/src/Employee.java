
public class Employee {
	int eno;
	String name;
	String position;
	String department;
	static int cnt;
	
	Employee(){
		cnt++;
	}
	Employee(int eno, String position, String department){
		this.eno = eno;
		this.position = position;
		this.department = department;
		cnt++;
	}
	Employee(int eno, String name, String position, String department){
		this.eno = eno;
		this.name = name;
		this.position = position;
		this.department = department;
		cnt++;
	}
	public String toString () {
		return "사원번호 : " + eno + " 이름 : " + name + " 직책 : " + position + " 부서 : " + department;
	}
	public int getEno() {
		return eno;
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
	public static int getCnt() {
		return cnt;
	}
	
	
}
