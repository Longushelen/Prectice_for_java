package schoolScoreReport;
import java.util.Arrays;
import java.util.Scanner;

public class ScoreReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 성적표 (5명)
		// 1. 성적 평균
		// 2. 성적 중에 최댓값, 최솟값을 구하는 프로그램
		// 3. 성적 중에 top 3를 구하는 프로그램 (학생의 성적 중에 동일한 성적은 없다고 가정)
		// 4. 성적으로 학점 구하기 90점 이상(A) + 학생 수, 80점 이상(B), 70점 이상(C), 60점 이상(D),이외 성적(F)
		// 5. A ~ F 학점을 받을 학생은 각각 몇 명인지 출력하시오.
		Scanner input = new Scanner(System.in);

		int numOfS = 5;
		int[] sOfScores;
		int sum = 0;
		double ave = 0;
		int cntA = 0, cntB = 0, cntC = 0, cntD = 0, cntF = 0;
		// 1 성적 평균 
		sOfScores = new int[numOfS];

		for (int i = 0; i < numOfS; i++) {
			System.out.printf("▷ 학생의 성적을 입력하시오 : ");
			sOfScores[i] = input.nextInt();
			sum += sOfScores[i];
		}
		
		ave = (double) sum / numOfS;
		
		System.out.println();
		System.out.println("[ 목표 : 전국 탑 3위 학교가 되자 ! ]");
		System.out.printf("▶ %d명의 학생들의 평균 : %.2f", sOfScores.length, ave); // 정수 + 정수 = 정수 (형변환 !!)

		Arrays.sort(sOfScores);
		
		// 2
		System.out.println();
		System.out.println("▶ 최댓값 : " + sOfScores[sOfScores.length - 1]);
		System.out.println("▷ 최솟값 : " + sOfScores[0]);
		// numOfS[0] = min, numOfS[0] = max
		// for (){ if (numOfS[i] < min) min = numOfS[i]; 
		// 		   if (numOfS[i] > max) max = numOfS[i];}
		System.out.println();
		
		System.out.println("[ 우수 학생 관리 ]");
		System.out.println("▶ 전교 1등 점수 : " + sOfScores[numOfS-1]);
		System.out.println("▶ 전교 2등 점수 : " + sOfScores[numOfS-2]);
		System.out.println("▶ 전교 3등 점수 : " + sOfScores[numOfS-3]);
		// for ( 1 ~ 3 ) 
		// { for ( 1 ~ 전체길이 ) if (topMax < 전체길이[j]) topMax = 전체길이[j]; topIndex = j;}
		// to3[i] = topMax;
		// 전체길이[topIndex] = -1
		System.out.println();
		System.out.println("[ 전체 학생 개인 학점 ] ");
		System.out.println("▶ 우수 학생 ▷ 관리 학생");
		
		for (int i = 0; i < numOfS; i++) {
			if (sOfScores[i] >= 90) System.out.print('▶');
			else if (sOfScores[i] >= 80) System.out.print('▶');
			else if (sOfScores[i] >= 70) System.out.print('▷');
			else if (sOfScores[i] >= 60) System.out.print('▷');
			else System.out.print('▷');
			
			System.out.printf(" %d의 학점 : ", sOfScores[i]);
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
		
		System.out.println("[ 전체 학생 통계 학점 ]");
		System.out.println("▶ A 학점의 학생수 : " + cntA);
		System.out.println("▶ B 학점의 학생수 : " + cntB);
		System.out.println("▷ C 학점의 학생수 : " + cntC);
		System.out.println("▷ D 학점의 학생수 : " + cntD);
		System.out.println("▷ F 학점의 학생수 : " + cntF);

	}
}
