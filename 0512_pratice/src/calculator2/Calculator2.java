package calculator2;
import java.util.Scanner;
public class Calculator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		/*
		 * 1. �Է°� �ֱ�
		 * 2. ���� ǥ�� �ֱ�
		 * 3. ������ �ֱ�
		 * 
		 * .................�ߺ� ���Ŵ� ����?
		 */
		int x, y, res = 0;
		char op;
		double res_double = 0;
		
		while(true) {		
			System.out.println("[ ���� 2 ]");
			System.out.print("�� x ���� �Է��Ͻÿ� : ");
			x = input.nextInt();
			
			System.out.print("�� ������ (+, -, *, /) �߿� �Է��Ͻÿ� : ");
			op = input.next().charAt(0);
			
			System.out.print("�� y ���� �Է��Ͻÿ� : ");
			y = input.nextInt();
			
			if (op == '/') {
				if (y == 0 ) System.out.println("�� y = 0 �̶� ���� �� �����ϴ� \n");
				else res_double = x / (double) y; 
				break;
				
			} 
			else if (op == '*') {
				res = x * y; break;
			}
			else if (op == '-') {
				res = x - y; break;
			}
			else if (op == '+') {
				res = x + y; break;
			}
		}
		if(op == '/') System.out.printf("�� %d %c %d = %d \n", x, op, y, res_double);
		else System.out.printf("�� %d %c %d = %d \n", x, op, y, res);
	}

}
