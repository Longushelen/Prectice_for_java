package pibonachi;
import java.util.Scanner;

public class PibonachiMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		// 피보나치
		int a = 0, b = 1, c = 0;
		int n;
		
		System.out.print("n의 값을 입력하시오 : ");
		n = input.nextInt();
		
		if (n == 0) {
			c = 0;
		}
		else if (n == 1) {
			c = 1;
		}
		else {
			for (int i = 2 ; i <= n ; i ++ ) {
				c = a + b;
				a = b;
				b = c;
			}
		}
		System.out.println("피보나치 결과 : " + c);
		
		// 원하는 횟수 만큼 파이 값 계산하기
		// ... 식을 잃어 버려서...
		
		// 1. 1 ~ 100 소수구하기 : 5/17
		
		// 2. 피타고라스 삼각형 조건을 충족하는 삼각형 구하기
		// 100 > 변 + a * a + b * b == c * c 만족하기
		
		// 3. 최소값, 최대값 / n개의 수를 입력받아 / n 개의 수 중에 가장 큰 값과 가장 작은 값 / 판별
		
	}

}
