package receptOfKimbab;

import java.util.Scanner;

public class Recept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����� ������
		Scanner input = new Scanner(System.in);
		
		int yourmoney, charge = 0, menu;
		int sumcharge = 0, leftmoney = 0, summoney = 0;
		final int mincharge = 2500;

		System.out.println(" ��� ** �޴��� \n 1. ��� (2500) \n 2. ��� (3000) \n 3. ������ (4000) \n 4. ��� (5000) \n 5. ����");

		System.out.print("����� �� ���� �Է��Ͻÿ� : ");
		yourmoney = input.nextInt();

		while (yourmoney >= mincharge) {

			System.out.print("�޴��� ��ȣ�� �Է����ּ��� : ");
			menu = input.nextInt();

			switch (menu) {
			case 1:
				charge = 2500;
				System.out.println("����� �����ϼ̽��ϴ�");
				break;
			case 2:
				charge = 3000;
				System.out.println("����� �����ϼ̽��ϴ�");
				break;
			case 3:
				charge = 4000;
				System.out.println("�����̸� �����ϼ̽��ϴ�");
				break;
			case 4:
				charge = 5000;
				System.out.println("����� �����ϼ̽��ϴ�");
				break;
			case 5:
				break;
			}

			sumcharge += charge; // 1 : 2500
			leftmoney = yourmoney - sumcharge; // 10000 : 7500

			if (leftmoney > yourmoney || leftmoney < 0) { // 7500 < 10000
				System.out.println("���� �� ���� ������");
				continue;
			}

			if (yourmoney == 5 || menu == 5) {
				System.out.println("���� !");
				break;
			}

			if (leftmoney == yourmoney || leftmoney == 0) {
				System.out.println("�ֹ��� �Ϸ� �Ǿ����ϴ�");
				break;
			}

			System.out.printf("�ܵ��� %d���Դϴ� \n", leftmoney);

		}
		if (yourmoney < mincharge || yourmoney == 5)
			System.out.println("������ �� ������ !");

		// 1. ���� 2500 -> 3�� ����� ������ -> �޴� ���ÿ��� 1���� �����ϸ� -> "���� �� ���� ������" ����
		// �� �����帰 �ּ��� �� �Ӹ��δ� �� �׷��� �Ǵ��� �� �𸣰ڽ��ϴ� �ϴ� ��������� �Ф�
	}

}
