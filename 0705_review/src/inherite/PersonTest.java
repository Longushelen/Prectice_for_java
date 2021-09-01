package inherite;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		System.out.println("[ Person Test ]");
		Person [] p = new Person [5];
		// Person형 배열로 관리하기
		p[0] = new Parent("김길동", "891234-100000");
		p[1] = new Parent("이길순", "951234-200000");
		p[2] = new Person("박길순", "051234-300000");
		p[3] = new Child("홍길순", "201234-400000");
		p[4] = new Child("홍길순", "201234-400000");
		
		for ( int i = 0 ; i < p.length ; i++) {
			System.out.println(" " + (i+1) + ") " + p[i]);
		}
		System.out.println(" ▷ 4)과 5)의 두 정보는 " + (p[3].equals(p[4])? "일치합니다" : "불일치합니다"));
		System.out.println();
		// Person형 배열에서 child 객체에서만 추가 정보 입력하기
		System.out.println("[ Child Test ]");
		boolean studentQ;
		
		for(int i = 0; i < p.length; i ++) {
			if(p[i] instanceof Child) { // p[3], p[4] 해당
				System.out.print(" ▶ " + (i+1)+"번 아이의 통학 여부를 말해주세요 (true or false) : ");
				((Child)p[i]).setStudent(sc.nextBoolean());
				System.out.println("  " + (i+1) + ") " + p[i] + " [통학 여부] "+((Child)p[i]).getStudent());
			}
		}
		System.out.println(" ▷ 4)과 5)의 두 정보는 " + (p[3].equals(p[4])? "일치합니다" : "불일치합니다"));
		System.out.println();
		System.out.println("[ Parent Test ]");
		for ( int i = 0 ; i < p.length ; i ++) {
			if(p[i] instanceof Parent ) {
				System.out.print(" ▶ " + (i+1)+"번 어른의 직업, 결혼 여부를 차례로 입력해주세요 : ");
				
				String str = sc.nextLine();
			    String[] str_splited = str.split(" ");
			    ((Parent)p[i]).setJob(str_splited[0]);
			    ((Parent)p[i]).setIsMarry(str_splited[1]);
			    
				System.out.println("  " + (i+1) + ") " + p[i] + " [직업] " + ((Parent)p[i]).getJob());
			}
		}
		System.out.println(" ▷ 두 정보는 " + (p[0].equals(p[1])? "일치합니다" : "불일치합니다"));
		

		
		
	}

}
