package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x, y, res;
		char op;
		double res_double;
		System.out.println("[ ���� ]");
		System.out.print("�� x�� ���� �Է��Ͻÿ� : ");
		x = input.nextInt();
		
		System.out.print("�� �����ڸ� �Է��Ͻÿ� (+, -, *, /) : ");
		op = input.next().charAt(0);
		
		System.out.print("�� y�� ���� �Է��Ͻÿ� : ");
		y = input.nextInt();
	
		if(op == '+') {
			res = x + y;
			System.out.printf("�� %d %c %d = %d \n", x, op, y, res);
		}
		else if(op == '-'){
			res = x - y;
			System.out.printf("�� %d %c %d = %d \n", x, op, y, res);
		}
		else if(op == '*'){
			res = x * y;
			System.out.printf("�� %d %c %d = %d \n", x, op, y, res);
		}
		else if(op == '/'){
				
			if (y == 0) {
				System.out.println("y = 0 �̶� ���� �� �����ϴ� \n");
			}
			else {
				res_double = x / (double) y;
				System.out.printf("�� %d %c %d = %.2f \n", x, op, y, res_double);
			}
		}
				
		else {
			System.out.print("������ �����ϴ� \n");
		}
	}

}
