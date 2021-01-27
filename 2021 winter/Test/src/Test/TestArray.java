package Test;

import java.util.*;

public class TestArray {
	
	public static Scanner input = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		
		//test();
		//testArray1();
		
		//average();
		//testArray2();
		//testArray3();
		testMinMax();
		
	}
		public static void test() {
			
			int size =10;
			int[] nums = new int[size];
			
			
			int[] array = new int[5];
			
			
			//nums = 3;
			
			nums[0] = 4;
			
			nums[1] = 5;
			 
			System.out.println(nums[1]);
			nums[10]=30;
			System.out.println("종료합니다.");
			
			
	}
			public static void testArray1() {
				
				int[] s =new int[10];
				
				for(int i=0;i<s.length;i++) {
					s[i]=1;
				}
				for (int i=0;i<s.length;i++) {
					System.out.print(s[i]+" ");
				}
			}
			
			public static void average() {
				
				
				int[] arr = new int[5];
				
				int sum=0;
				
				for (int i=0; i < arr.length; i++) {
					System.out.print("성적 입력:");
					arr[i] = input.nextInt();
					sum+=arr[i];
				}
				System.out.println("성적의 평균:"+sum/arr.length);
			}
		public static void testArray2() {
			int[] scores= {10,20,30,40,50};
			
			/*
			 * int[] scores = new int[5];
			 * scores[0] = 10,scores[1]=20,...., scores[4]=50; 
			 */
			
			//scores = 10,20,30,40,50 == X 자바의 문법상 적용돼지 않음.
			
			for (int i=0; i< scores.length;i++) {
				System.out.print(scores[i]+" ");
				int[] scores2;
				
				scores2 = new int[] {50,70,80,90,100};
				
				int[] scores3=new int[] {110,120,130,140,150};
				
			}
			
		}
		public static void testArray3() {
			
			String[] arr = {"Pepperoni","Mushrooms","onions","Sausage","Bacon"};
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			
		}
		public static void testMinMax() {
			
			/*  
			int n = input.nextInt();  //대입
			int max=-1000000,min=1000000;
			int[] arr = new int[n];
			for (int i=0;i<n;i++) {
				arr[i]=input.nextInt();
				if (min>arr[i]) {
					min=arr[i];
				}if(max<arr[i]) {
					max=arr[i];
				}
			*/
			
			
			//int[] nums= {12,3,19,6,18,12,4,1,19}; //지정
			
			Random random=new Random(System.currentTimeMillis()); //랜덤
			
			int[] nums =new int[10];
			for(int i=0;i<nums.length;i++) {
				nums[i] = random.nextInt();
			}
			
			int min = nums[0],max=nums[0];
			
			for(int i=0;i<nums.length;i++) {
				if(min>nums[i])min=nums[i];
				if(max<nums[i])max=nums[i];
			}
			
			
				System.out.println("Min :"+min+" Max :"+max);
		}
}

