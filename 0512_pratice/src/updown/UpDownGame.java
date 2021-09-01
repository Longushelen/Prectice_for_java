package updown;
import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		// 업다운 게임
		
		int scope, rand, guess = 0, cnt = 0;
		
		scope = 100;
		rand = (int)(Math.random() * scope) + 1;
		
		while (true) {
			
			cnt++;
			
			System.out.print("추측값을 입력하시오 : ");
			guess = input.nextInt();
			
			if (rand == guess) {
				System.out.println("축하합니다 정답입니다");
				System.out.printf("정답은 %d 였습니다 [시도 횟수 : %d ]", rand, cnt);
				break;
			}
			
			System.out.println((rand > guess)? "up" : "down");
		}
		

		
		
		

	}

}
