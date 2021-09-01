package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x, y, res;
		char op;
		double res_double;
		System.out.println("[ 계산기 ]");
		System.out.print("▷ x의 값을 입력하시오 : ");
		x = input.nextInt();
		
		System.out.print("▷ 연산자를 입력하시오 (+, -, *, /) : ");
		op = input.next().charAt(0);
		
		System.out.print("▷ y의 값을 입력하시오 : ");
		y = input.nextInt();
	
		if(op == '+') {
			res = x + y;
			System.out.printf("▶ %d %c %d = %d \n", x, op, y, res);
		}
		else if(op == '-'){
			res = x - y;
			System.out.printf("▶ %d %c %d = %d \n", x, op, y, res);
		}
		else if(op == '*'){
			res = x * y;
			System.out.printf("▶ %d %c %d = %d \n", x, op, y, res);
		}
		else if(op == '/'){
				
			if (y == 0) {
				System.out.println("y = 0 이라 나눌 수 없습니다 \n");
			}
			else {
				res_double = x / (double) y;
				System.out.printf("▶ %d %c %d = %.2f \n", x, op, y, res_double);
			}
		}
				
		else {
			System.out.print("연산자 없습니다 \n");
		}
	}

}
