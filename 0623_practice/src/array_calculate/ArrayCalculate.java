package array_calculate;

import java.util.Scanner;

public class ArrayCalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
			      
	      // 1. �迭�� ���빰���� �� vs �� �迭�� �������� ��
	      // 2. �� �迭�� ���� (addArray), ���� (subArray)�� �� ��� ����	      
	      // 3. �� �迭�� ���� (mulArray)�� ��� ���� (**)
		final int arrSize = 5; 
		int [] arr = new int [arrSize*arrSize];
		int [][] arr1 = new int [arrSize][arrSize];
		int [][] arr2 = new int [arrSize][arrSize];
		// �迭�� �� �ֱ�
		for (int i = 0 ; i < arr.length ; i++) arr[i] = i;
		
		for ( int i = 0 ; i < arr1.length ; i++) {
			for ( int j = 0 ; j < arr1[i].length ; j++) {
				arr1[i][j] = arr[i*arrSize + j];
				arr2[i][j] = arr[i*arrSize + j];
			}
		}
		// 1.
		System.out.println("�� �迭�� ���빰�� " + (compare(arr1,arr2)? "�����ϴ�" : "�ٸ��ϴ�"));
		// 2.		
		for ( int i = 0 ; i < addArray(arr1, arr2).length ; i ++) {
			for ( int j = 0 ; j < addArray(arr1, arr2)[0].length ; j++) {
				System.out.printf("%3s",addArray(arr1, arr2)[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		// 3.
		for ( int i = 0 ; i < addArray(arr1, arr2).length ; i ++) {
			for ( int j = 0 ; j < addArray(arr1, arr2)[0].length ; j++) {
				System.out.printf("%3s",subArray(arr1, arr2)[i][j]);
			}
			System.out.println();
		}
		
	}
	public static boolean compare (int [][] arr1, int [][] arr2) {
		
		if (arr1.length != arr2.length || arr1[0].length != arr2[0].length) return false;
	
		for ( int i = 0 ; i < arr1.length ; i ++) {
			for ( int j = 0 ; j < arr1[i].length ; j++) {
				if (arr1[i][j] != arr2[i][j]) return false;
			}
		}
		return true;
		
	}
	public static int [][] addArray (int [][] arr1, int [][] arr2) {
		
		if (arr1.length != arr2.length ||  arr1[0].length != arr2[0].length) return null;
		
		int [][] arr = new int [arr1.length][arr1[0].length];
		
		for ( int i = 0 ; i < arr1.length ; i ++) {
			for ( int j = 0 ; j < arr1[i].length ; j++) {
				arr[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		return arr;
		
	}
	public static int [][] subArray (int [][] arr1, int [][] arr2) {
		
		if (arr1.length != arr2.length ||  arr1[0].length != arr2[0].length) return null;
		
		int [][] arr = new int [arr1.length][arr1[0].length];
		
		for ( int i = 0 ; i < arr1.length ; i ++) {
			for ( int j = 0 ; j < arr1[i].length ; j++) {
				arr[i][j] = arr1[i][j] - arr2[i][j];
			}
		}
		
		return arr;
	}
}
