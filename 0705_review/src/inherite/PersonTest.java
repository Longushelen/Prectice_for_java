package inherite;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		System.out.println("[ Person Test ]");
		Person [] p = new Person [5];
		// Person�� �迭�� �����ϱ�
		p[0] = new Parent("��浿", "891234-100000");
		p[1] = new Parent("�̱��", "951234-200000");
		p[2] = new Person("�ڱ��", "051234-300000");
		p[3] = new Child("ȫ���", "201234-400000");
		p[4] = new Child("ȫ���", "201234-400000");
		
		for ( int i = 0 ; i < p.length ; i++) {
			System.out.println(" " + (i+1) + ") " + p[i]);
		}
		System.out.println(" �� 4)�� 5)�� �� ������ " + (p[3].equals(p[4])? "��ġ�մϴ�" : "����ġ�մϴ�"));
		System.out.println();
		// Person�� �迭���� child ��ü������ �߰� ���� �Է��ϱ�
		System.out.println("[ Child Test ]");
		boolean studentQ;
		
		for(int i = 0; i < p.length; i ++) {
			if(p[i] instanceof Child) { // p[3], p[4] �ش�
				System.out.print(" �� " + (i+1)+"�� ������ ���� ���θ� �����ּ��� (true or false) : ");
				((Child)p[i]).setStudent(sc.nextBoolean());
				System.out.println("  " + (i+1) + ") " + p[i] + " [���� ����] "+((Child)p[i]).getStudent());
			}
		}
		System.out.println(" �� 4)�� 5)�� �� ������ " + (p[3].equals(p[4])? "��ġ�մϴ�" : "����ġ�մϴ�"));
		System.out.println();
		System.out.println("[ Parent Test ]");
		for ( int i = 0 ; i < p.length ; i ++) {
			if(p[i] instanceof Parent ) {
				System.out.print(" �� " + (i+1)+"�� ��� ����, ��ȥ ���θ� ���ʷ� �Է����ּ��� : ");
				
				String str = sc.nextLine();
			    String[] str_splited = str.split(" ");
			    ((Parent)p[i]).setJob(str_splited[0]);
			    ((Parent)p[i]).setIsMarry(str_splited[1]);
			    
				System.out.println("  " + (i+1) + ") " + p[i] + " [����] " + ((Parent)p[i]).getJob());
			}
		}
		System.out.println(" �� �� ������ " + (p[0].equals(p[1])? "��ġ�մϴ�" : "����ġ�մϴ�"));
		

		
		
	}

}
