package si_fact_sosu_multiple;
import java.util.Scanner;

public class Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n;
		int sig = 0, pac = 1;
		boolean istrue = true;
		
		System.out.print("n의 값을 입력하시오 : ");
		n = input.nextInt();
		
		// 시그마 -------------------------------------
		
		for (int i = 1; i <= n ; i++) sig += i;
		System.out.println("▶ 시스마 : " + sig);
		
		// 팩토이얼 -----------------------------------
		
		for (int i = 1; i <= n; i++) pac *= i;
		System.out.println("▶ 팩토리얼 : " + pac);
		
		// 소수 판별기 --------------------------------
		
		for (int i = 2 ; i < n; i ++) {
			if (n == 0) {
				istrue = false; 
				break;
			}
			if (n % i != 0) istrue = false;

		}
		System.out.println((istrue == true)? "▶ 소수입니다" : "▶ 소수가 아닙니다");
		
		// ------------------------------------------
		
		//범위 값에서 n의 배수만 출력하기
		
		int scope, n_1;
		
		System.out.print("배수 범위 값을 입력하시오 : ");
		scope = input.nextInt();
		
		System.out.print("배수를 입력하시오 : ");
		n_1 = input.nextInt();
		
		System.out.print("범위값의 배수에 해당하는 값 : ");
		for (int i = 1; i <= scope; i++) {
			if (i % n_1 == 0) System.out.printf("%d,", i );
		}
		
		System.out.println();
		
	}

}
