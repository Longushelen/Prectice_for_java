package pibonachi;
import java.util.Scanner;

public class PibonachiMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		// �Ǻ���ġ
		int a = 0, b = 1, c = 0;
		int n;
		
		System.out.print("n�� ���� �Է��Ͻÿ� : ");
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
		System.out.println("�Ǻ���ġ ��� : " + c);
		
		// ���ϴ� Ƚ�� ��ŭ ���� �� ����ϱ�
		// ... ���� �Ҿ� ������...
		
		// 1. 1 ~ 100 �Ҽ����ϱ� : 5/17
		
		// 2. ��Ÿ��� �ﰢ�� ������ �����ϴ� �ﰢ�� ���ϱ�
		// 100 > �� + a * a + b * b == c * c �����ϱ�
		
		// 3. �ּҰ�, �ִ밪 / n���� ���� �Է¹޾� / n ���� �� �߿� ���� ū ���� ���� ���� �� / �Ǻ�
		
	}

}
