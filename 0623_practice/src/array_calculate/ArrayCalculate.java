package array_calculate;

import java.util.Scanner;

public class ArrayCalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
			      
	      // 1. 배열의 내용물끼리 비교 vs 두 배열이 동일한지 비교
	      // 2. 두 배열의 덧셈 (addArray), 뺄셈 (subArray)을 한 결과 저장	      
	      // 3. 두 배열의 곱셈 (mulArray)한 결과 저장 (**)
		final int arrSize = 5; 
		int [] arr = new int [arrSize*arrSize];
		int [][] arr1 = new int [arrSize][arrSize];
		int [][] arr2 = new int [arrSize][arrSize];
		// 배열에 값 넣기
		for (int i = 0 ; i < arr.length ; i++) arr[i] = i;
		
		for ( int i = 0 ; i < arr1.length ; i++) {
			for ( int j = 0 ; j < arr1[i].length ; j++) {
				arr1[i][j] = arr[i*arrSize + j];
				arr2[i][j] = arr[i*arrSize + j];
			}
		}
		// 1.
		System.out.println("두 배열의 내용물은 " + (compare(arr1,arr2)? "같습니다" : "다릅니다"));
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
