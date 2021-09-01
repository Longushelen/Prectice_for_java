
public class EmployeeTest {

	static Employee [] empGroup = new Employee [10];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0 ; i < empGroup.length ; i++) empGroup[i] = new Employee();
		// 5. Main Ŭ������ displayEmployee �Լ��� ���� empGroup�� ���� ���
		
		displayEmployee();
		for (int i = 0 ; i < searchEmpbyDepart("������").length ; i ++) {
			System.out.println(searchEmpbyDepart("������")[i]);
		}
		for (int i = 0 ; i < searchEmpbyPosition("������").length ; i ++) {
			System.out.println(searchEmpbyPosition("������")[i]);
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
