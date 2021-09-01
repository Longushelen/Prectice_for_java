package nestedStar;

import java.util.Scanner;

public class NestedStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int choose;
		
		while (true) {
			printMenu();
			System.out.print("◆ 어떤 모양을 출력하시겠습니까? : ");
			choose = input.nextInt();
			
			if (choose == 1) {
				System.out.println();
				for ( int i = 0 ; i < 5 ; i ++ ) {
					for ( int j = 0 ; j < 5 ; j++ ) {
						System.out.print("*");
					}
					System.out.println();
				}
				
			}
			else if (choose == 2) {
				System.out.println();
				for ( int i = 0 ; i < 5 ; i ++ ) {
					for ( int j = 0 ; j < 5 ; j++ ) {
						if(i >= j) System.out.print("*");
					}
					System.out.println();
				}
				
			}
			else if (choose == 3) {
				System.out.println();		
				for ( int i = 0 ; i < 5 ; i ++ ) {
					for ( int j = 0 ; j < 5 ; j++ ) {
						if(i + j > 3) System.out.print("*");
						else System.out.print(" ");
					}
					System.out.println();
				}
				
			}
			else if (choose == 4) {
				System.out.println();
				for ( int i = 0 ; i < 5 ; i ++ ) {
					for ( int j = 0 ; j < 5 ; j++ ) {
						if(i <= j) System.out.print("*");
					}
					System.out.println();
				}
				
			}
			else if (choose == 5) {
				System.out.println();
				for ( int i = 0 ; i < 5 ; i ++ ) {
					for ( int j = 0 ; j < 5 ; j++ ) {
						if(i > j )System.out.print(" ");
						else System.out.print("*");
					}
					System.out.println();
				}
				
			} else break;
		}
	}
public static void printMenu() {
	System.out.println("------------------------------");
	System.out.println("[ Nested Star ]");
	System.out.println("1. 네모 만들기");
	System.out.println("2. 왼쪽 트리 만들기");
	System.out.println("3. 오른쪽 트리 만들기");
	System.out.println("4. 역 왼쪽 트리 만들기");
	System.out.println("5. 역 오른쪽 트리 만들기");
	System.out.println("6. 종료");
	System.out.println("------------------------------");
}
}
