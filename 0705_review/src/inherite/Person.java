package inherite;

import java.util.Calendar;

public class Person implements Comparable <Person>{
	protected String name;
	protected String regNum;
	
	protected String gender;
	protected int age;
	
	public Person() {}
	public Person(String name, String regNum) {
		this.name = name;
		this.regNum = regNum;
		initGender(this.regNum);
		initAge(this.regNum);
	}
	@Override
	public String toString () {
		return "[이름] " + name + " [주민번호] " + regNum + " [나이] " + age + " [성별] " + gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegNum() {
		return regNum;
	}
	public void setRegNum(String regNum) {
		this.regNum = regNum;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void initGender(String regNum) {
		if (regNum.charAt(7)== '1' || regNum.charAt(7)=='3') gender = "Male";
		else if (regNum.charAt(7)== '2' || regNum.charAt(7)=='4') gender = "Female"; 
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void initAge(String regNum) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		
		int age = year - Integer.parseInt("19" + regNum.substring(0,2)) + 1;
		if (age >= 100) age = age -100;
		this.age = age;
	}
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Person)) return false;
		if (this.regNum.equals(((Person)o).regNum)) return true;
		else return false;
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	
}
