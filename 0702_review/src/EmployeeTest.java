
public class EmployeeTest {

	static Employee [] empGroup = new Employee [10];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0 ; i < empGroup.length ; i++) empGroup[i] = new Employee();
		// 5. Main 클래스에 displayEmployee 함수를 만들어서 empGroup의 정보 출력
		
		displayEmployee();
		for (int i = 0 ; i < searchEmpbyDepart("마케팅").length ; i ++) {
			System.out.println(searchEmpbyDepart("마케팅")[i]);
		}
		for (int i = 0 ; i < searchEmpbyPosition("마케팅").length ; i ++) {
			System.out.println(searchEmpbyPosition("마케팅")[i]);
		}				
	}
	public static void displayEmployee () {
		for (int i = 0 ; i < empGroup.length; i ++) {
			System.out.println(empGroup[i]);
		}
	}
	public static Employee[] searchEmpbyDepart (String depart){
		int cnt = 0;
		for (int i = 0; i < empGroup.length ; i++ ) {
			if (empGroup[i].getDepartment().equals(depart)) cnt ++;
		}
		Employee [] classify = new Employee [cnt];
		for (int i = 0 ; i < classify.length ; i ++)classify[i] = new Employee();
		
		for (int i = 0; i < empGroup.length ; i++ ) {
			if (empGroup[i].getDepartment().equals(depart)) classify[i] = empGroup[i];
		}
		return classify;
		
	}
	public static Employee[] searchEmpbyPosition (String position){
		int cnt = 0;
		for (int i = 0; i < empGroup.length ; i++ ) {
			if (empGroup[i].getDepartment() == position) cnt ++;
		}
		Employee [] classify = new Employee [cnt];
		for (int i = 0 ; i < classify.length ; i ++)classify[i] = new Employee();
		
		for (int i = 0; i < empGroup.length ; i++ ) {
			if (empGroup[i].getDepartment() == position) classify[i] = empGroup[i];
		}
		return classify;
	}
}
