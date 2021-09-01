package calculator2;
import java.util.Scanner;
public class Calculator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		/*
		 * 1. 입력값 넣기
		 * 2. 종료 표시 넣기
		 * 3. 구분자 넣기
		 * 
		 * .................중복 제거는 성공?
		 */
		int x, y, res = 0;
		char op;
		double res_double = 0;
		
		while(true) {		
			System.out.println("[ 계산기 2 ]");
			System.out.print("▷ x 값을 입력하시오 : ");
			x = input.nextInt();
			
			System.out.print("▷ 연산자 (+, -, *, /) 중에 입력하시오 : ");
			op = input.next().charAt(0);
			
			System.out.print("▷ y 값을 입력하시오 : ");
			y = input.nextInt();
			
			if (op == '/') {
				if (y == 0 ) System.out.println("◆ y = 0 이라 나눌 수 없습니다 \n");
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
		if(op == '/') System.out.printf("▶ %d %c %d = %d \n", x, op, y, res_double);
		else System.out.printf("▶ %d %c %d = %d \n", x, op, y, res);
	}

}
