package schoolScoreReport;
import java.util.Arrays;
import java.util.Scanner;

public class ScoreReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����ǥ (5��)
		// 1. ���� ���
		// 2. ���� �߿� �ִ�, �ּڰ��� ���ϴ� ���α׷�
		// 3. ���� �߿� top 3�� ���ϴ� ���α׷� (�л��� ���� �߿� ������ ������ ���ٰ� ����)
		// 4. �������� ���� ���ϱ� 90�� �̻�(A) + �л� ��, 80�� �̻�(B), 70�� �̻�(C), 60�� �̻�(D),�̿� ����(F)
		// 5. A ~ F ������ ���� �л��� ���� �� ������ ����Ͻÿ�.
		Scanner input = new Scanner(System.in);

		int numOfS = 5;
		int[] sOfScores;
		int sum = 0;
		double ave = 0;
		int cntA = 0, cntB = 0, cntC = 0, cntD = 0, cntF = 0;
		// 1 ���� ��� 
		sOfScores = new int[numOfS];

		for (int i = 0; i < numOfS; i++) {
			System.out.printf("�� �л��� ������ �Է��Ͻÿ� : ");
			sOfScores[i] = input.nextInt();
			sum += sOfScores[i];
		}
		
		ave = (double) sum / numOfS;
		
		System.out.println();
		System.out.println("[ ��ǥ : ���� ž 3�� �б��� ���� ! ]");
		System.out.printf("�� %d���� �л����� ��� : %.2f", sOfScores.length, ave); // ���� + ���� = ���� (����ȯ !!)

		Arrays.sort(sOfScores);
		
		// 2
		System.out.println();
		System.out.println("�� �ִ� : " + sOfScores[sOfScores.length - 1]);
		System.out.println("�� �ּڰ� : " + sOfScores[0]);
		// numOfS[0] = min, numOfS[0] = max
		// for (){ if (numOfS[i] < min) min = numOfS[i]; 
		// 		   if (numOfS[i] > max) max = numOfS[i];}
		System.out.println();
		
		System.out.println("[ ��� �л� ���� ]");
		System.out.println("�� ���� 1�� ���� : " + sOfScores[numOfS-1]);
		System.out.println("�� ���� 2�� ���� : " + sOfScores[numOfS-2]);
		System.out.println("�� ���� 3�� ���� : " + sOfScores[numOfS-3]);
		// for ( 1 ~ 3 ) 
		// { for ( 1 ~ ��ü���� ) if (topMax < ��ü����[j]) topMax = ��ü����[j]; topIndex = j;}
		// to3[i] = topMax;
		// ��ü����[topIndex] = -1
		System.out.println();
		System.out.println("[ ��ü �л� ���� ���� ] ");
		System.out.println("�� ��� �л� �� ���� �л�");
		
		for (int i = 0; i < numOfS; i++) {
			if (sOfScores[i] >= 90) System.out.print('��');
			else if (sOfScores[i] >= 80) System.out.print('��');
			else if (sOfScores[i] >= 70) System.out.print('��');
			else if (sOfScores[i] >= 60) System.out.print('��');
			else System.out.print('��');
			
			System.out.printf(" %d�� ���� : ", sOfScores[i]);
			if (sOfScores[i] >= 90) {
				cntA++;
				System.out.print("A\n");
			} else if (sOfScores[i] >= 80) {
				cntB++;
				System.out.print("B\n");
			} else if (sOfScores[i] >= 70) {
				cntC++;
				System.out.print("C\n");
			} else if (sOfScores[i] >= 60) {
				cntD++;
				System.out.print("D\n");
			} else {
				cntF++;
				System.out.print("F\n");
			}
		}
		
		System.out.println("[ ��ü �л� ��� ���� ]");
		System.out.println("�� A ������ �л��� : " + cntA);
		System.out.println("�� B ������ �л��� : " + cntB);
		System.out.println("�� C ������ �л��� : " + cntC);
		System.out.println("�� D ������ �л��� : " + cntD);
		System.out.println("�� F ������ �л��� : " + cntF);

	}
}
