package updown;
import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		// ���ٿ� ����
		
		int scope, rand, guess = 0, cnt = 0;
		
		scope = 100;
		rand = (int)(Math.random() * scope) + 1;
		
		while (true) {
			
			cnt++;
			
			System.out.print("�������� �Է��Ͻÿ� : ");
			guess = input.nextInt();
			
			if (rand == guess) {
				System.out.println("�����մϴ� �����Դϴ�");
				System.out.printf("������ %d �����ϴ� [�õ� Ƚ�� : %d ]", rand, cnt);
				break;
			}
			
			System.out.println((rand > guess)? "up" : "down");
		}
		

		
		
		

	}

}
