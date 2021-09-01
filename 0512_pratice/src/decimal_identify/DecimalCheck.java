package decimal_identify;

import java.util.Scanner;

public class DecimalCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("1. 입력한 n의 소수 판별하기");
		System.out.println("2. 1 ~ n까지 소수 찾기");
		System.out.print("◆ 보기를 선택하시오 : ");
		int choose = input.nextInt();
		if(choose == 1) {
			
			System.out.print("\n▷ n 입력 : ");
			int n = input.nextInt();
			
			boolean res = true;
			
			for ( int i = 2 ; i < n ; i ++ ) {
				if (n % i == 0) res = false;
			}
			System.out.println("▶ 소수가 "+ ((res)? "맞습니다" : "아닙니다 " ));
			
//			for ( int i = 2 ; i <= (int)Math.sqrt(n) ; i ++ ) 에라토스테네스의 체

		}
		else if ( choose == 2) {
			
			System.out.print("\n▷n 입력 : ");
			int n = input.nextInt();
			
			int [] nums = new int [n];
			int [] prime = new int [nums.length] ;
			
			boolean res = true;
			int cnt = 0;
			int primenumber = 0;
			
			// 숫자 넣기
			for ( int i = 0 ; i < n ; i ++) {
				if ( i == 0 ) nums[i] = 2;
				else if (i == n-1) nums[i] = 0;
				else nums[i] =  i + 1;
			}

			
			// 소수 갯수
			for ( int i = 0 ; i < nums.length ; i ++) {
				for ( int j = 2 ; j < nums[i] ; j ++ ) {
					if (nums[i] % j == 0) {
						res = false;
						break;
					}
				}
				
			}

			for ( int i = 0 ; i < nums.length ; i ++) {
				for ( int j = 2 ; j < nums[i] ; j ++ ) {
					if (nums[i] % j == 0) break;
				}
				prime[primenumber] = nums[i];
				primenumber ++;
			}
		}
	}

}
