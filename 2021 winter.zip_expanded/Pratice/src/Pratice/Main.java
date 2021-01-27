package Pratice;

import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		
		
		//sortArray();
		//twoDimensinonalArray();
		twoDimensionalArray2();
	
		
	}
	
	public static void twoDimensionalArray2() {
		
		//int[] nums = new int[5];
		//int[] nums = {1,2,3,4,5};
		
//		int[][] table = {{10, 20, 30, 40, 50},
//						{60, 70, 80, 90, 100}, 
//						{110, 120, 130, 140}
//						};
//		
//		for (int i=0 ; i<table.length; i++) {
//			for(int j=0; j<table[i].length; j++) {
//				System.out.print(table[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		int[][] table = new int[3][];
		
		table[0]=new int[5];
		table[1]=new int[5];
		table[2]=new int[4];
		int value=10;
		
		
		for(int i=0; i<table.length; i++) {
			for(int j=0; j<table[i].length; j++) {
				table[i][j]= value;
				value += 10;
				System.out.print(table[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
	
	public static void twoDimensinonalArray() {
		int[][] ja =new int[2][10];
		
		Random random = new Random();
		for(int i=0; i<ja.length; i++) {
			for(int j=0; j<ja[i].length; j++) {
				ja[i][j]= random.nextInt(100)+1;
			}
			/*
			 * i가 0일때 :
			 * j는 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
			 * i가 1일때 :
			 * j는 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
			 */
			
			
		}
		System.out.println("   0  1 2 3 4 5 6 7 8 9");
		for(int i=0; i<ja.length; i++) {
			System.out.print(i+": ");
			for(int j=0; j <ja[i].length; j++) {
				System.out.printf("%3d", ja[i][j]);
			}
		}
	}
	
	
	private static void sortArray() {
		
		Random random = new Random();
		int[] nums= new int[20];
		
		for(int i=0; i< nums.length; i++) {
			nums[i]=random.nextInt(100)+1;
		}
		
		display(nums);
		
		//Arrays.sort(nums);
		
		System.out.println("After Sorting...");
		
		display(nums);
	}
	
	private static void display(int[] arr) {
		for(int n : arr) {
			System.out.print(n +" ");
		}
		System.out.println();
	}
	
	public static void selectionSort(int[] arr) {
		for(int i=0; i< arr.length-1; i++) {
			int minIdx =i;
			/*
			 * 배열의 인덱스응 I+1 부터 마지막 원소의 인덱스까지 증가시키면서
			 * 제일 작은 원소값의 인덱스를 찾아 minIdx에 넣자.
			 */
			
			for(int j= i+1; j< arr.length; j++) {
				if(arr[minIdx]>arr[j]) {
					minIdx=j;
				}
				swap(arr,i,minIdx);
			}
		}
	}	
		private static void swap(int[] arr, int idx1, int idx2) {
		int tmp=arr[idx1];
		arr[idx1]=arr[idx2];
		arr[idx2]=tmp;
	 }
}
