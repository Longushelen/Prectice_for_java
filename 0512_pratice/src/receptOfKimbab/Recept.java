package receptOfKimbab;

import java.util.Scanner;

public class Recept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 김밥집 영수증
		Scanner input = new Scanner(System.in);
		
		int yourmoney, charge = 0, menu;
		int sumcharge = 0, leftmoney = 0, summoney = 0;
		final int mincharge = 2500;

		System.out.println(" 김밥 ** 메뉴판 \n 1. 김밥 (2500) \n 2. 라면 (3000) \n 3. 떡볶이 (4000) \n 4. 돈까스 (5000) \n 5. 종료");

		System.out.print("당신이 쓸 돈을 입력하시오 : ");
		yourmoney = input.nextInt();

		while (yourmoney >= mincharge) {

			System.out.print("메뉴의 번호를 입력해주세요 : ");
			menu = input.nextInt();

			switch (menu) {
			case 1:
				charge = 2500;
				System.out.println("김밥을 선택하셨습니다");
				break;
			case 2:
				charge = 3000;
				System.out.println("라면을 선택하셨습니다");
				break;
			case 3:
				charge = 4000;
				System.out.println("떡볶이를 선택하셨습니다");
				break;
			case 4:
				charge = 5000;
				System.out.println("돈까스를 선택하셨습니다");
				break;
			case 5:
				break;
			}

			sumcharge += charge; // 1 : 2500
			leftmoney = yourmoney - sumcharge; // 10000 : 7500

			if (leftmoney > yourmoney || leftmoney < 0) { // 7500 < 10000
				System.out.println("돈을 더 가져 오세요");
				continue;
			}

			if (yourmoney == 5 || menu == 5) {
				System.out.println("종료 !");
				break;
			}

			if (leftmoney == yourmoney || leftmoney == 0) {
				System.out.println("주문이 완료 되었습니다");
				break;
			}

			System.out.printf("잔돈은 %d원입니다 \n", leftmoney);

		}
		if (yourmoney < mincharge || yourmoney == 5)
			System.out.println("다음에 또 만나요 !");

		// 1. 쓸돈 2500 -> 3번 라면을 선택후 -> 메뉴 선택에서 1번을 선택하면 -> "돈을 더 가져 오세요" 오류
		// 위 말씀드린 주석은 제 머리로는 왜 그렇게 되는지 잘 모르겠습니다 일단 보내드려요 ㅠㅠ
	}

}
