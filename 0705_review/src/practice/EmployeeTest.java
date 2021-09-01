package practice;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee [] empGroup = new Employee [10];
		
		for ( int i = 0 ; i < empGroup.length ; i ++ ) {
			empGroup[i] = new Employee();
			
		}
		
		
		
		displayEmployee(empGroup);
		searchEmpbyDepart("¸¶ÄÉÆÃ");
		searchEmpbyPosition();
	}
	public static void displayEmployee (Employee [] emp) {

		
		for (int i = 0 ; i < emp.length ; i ++) {
			System.out.println(emp[i]);
		}
		
	}
	public static void searchEmpbyDepart(String dep) {
		
		
	}
	public static void searchEmpbyPosition() {
		
	}
}
