package si_fact_sosu_multiple;
import java.util.Scanner;

public class Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n;
		int sig = 0, pac = 1;
		boolean istrue = true;
		
		System.out.print("n�� ���� �Է��Ͻÿ� : ");
		n = input.nextInt();
		
		// �ñ׸� -------------------------------------
		
		for (int i = 1; i <= n ; i++) sig += i;
		System.out.println("�� �ý��� : " + sig);
		
		// �����̾� -----------------------------------
		
		for (int i = 1; i <= n; i++) pac *= i;
		System.out.println("�� ���丮�� : " + pac);
		
		// �Ҽ� �Ǻ��� --------------------------------
		
		for (int i = 2 ; i < n; i ++) {
			if (n == 0) {
				istrue = false; 
				break;
			}
			if (n % i != 0) istrue = false;

		}
		System.out.println((istrue == true)? "�� �Ҽ��Դϴ�" : "�� �Ҽ��� �ƴմϴ�");
		
		// ------------------------------------------
		
		//���� ������ n�� ����� ����ϱ�
		
		int scope, n_1;
		
		System.out.print("��� ���� ���� �Է��Ͻÿ� : ");
		scope = input.nextInt();
		
		System.out.print("����� �Է��Ͻÿ� : ");
		n_1 = input.nextInt();
		
		System.out.print("�������� ����� �ش��ϴ� �� : ");
		for (int i = 1; i <= scope; i++) {
			if (i % n_1 == 0) System.out.printf("%d,", i );
		}
		
		System.out.println();
		
	}

}
