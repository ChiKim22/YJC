package Main;

import java.util.*;

public class Main4 {
	
	public static void main (String[] args) {
		
		//testDoWhile();
		//testDoWhile2();
		//testGCD();
		testGCM();
		
		
	}
	
	public static void testDoWhile() {
		
		int n = 10;
		
		//while(n < 3) {
		//	System.out.print(n++ + " ");
		//}
	
		do {
			System.out.print(n++ + " ");
		}while(n < 3);
		
		System.out.println("반복 종료합니다...");
		
		
	}
	public static void testDoWhile2() {
		/*
		 * 성적을 입력받는다.
		 * 성적에 따라서
		 * 90~100 : A
		 * 80~89 : B
		 * 70~79 : C
		 * 60~60 : D
		 * 나머지 : F
		 * 
		 */
		
		Scanner input = new Scanner (System.in);
		int score;
		
		do {
			System.out.println("성적을 입력하세요 : ");
			score = input.nextInt();
			
		
			
		}while(score > 101 || score < 0);
		 if(score >= 90) {
			 System.out.println("A");
		
		 }else if(score >79) {
			System.out.println("B");
		
		 }else if (score>69) {
			System.out.println("C");
		
		 }else if (score>59) {
			System.out.println("D");
		
		 }else {
			System.out.println("F");
		}
		
	}
	public static void testGCD() {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("1번째 숫자를 입력하세요 : ");
		int x=input.nextInt();
		System.out.println("1번째 숫자를 입력하세요 : ");
		int y=input.nextInt();
		int r=0;
		
		System.out.println("첫번째 숫자는 : " + x + " 두번째 숫자는 : " + y);
		
		while(y !=0) {
				r=x%y;
				x=y;
				y=r;
		}
		System.out.println("최대 공약수는 : " + x);
		
	}
	
		public static void testGCM() {
			Scanner input = new Scanner (System.in);
			System.out.println("1번째 숫자를 입력하세요 : ");
			int x = input.nextInt();
			System.out.println("2번째 숫자를 입력하세요 : ");
			int y = input.nextInt();
			int z = x*y;
			int r;
			
			System.out.println("첫번째 숫자는 : " + x + " 두번째 숫자는 : " + y);
			
			while(y !=0) {
				r=z%y;
				x=y;
				y=r;
			}
			System.out.println("최소 공배수는 : " + z);
		
	/*
	 * 
	 * int n1=input.nextInt;
	 * int n2-input.nextInt;
	 * 
	 * int orgA=n1;
	 * int orgB=n2;
	 * 
	 * if(n1>n2){
	 * int tmp=n1;
	 * n1=n2;
	 * n2=n1;
	 * }
	 * while(n1!=0){
	 * int r=n2%n1;
	 * n2=n1;
	 * n1=r;
	 * }
	 * System.out.println("GCM:" +(orgA*orgB/n2));
	 */
			
			/*
			 * int gcd=gcd(n1,n2);
			 * int gcm=n1*n2/gcd;
			 * System.out.println(gcd);
			 * System.out.println(gcm);
			 */
		}
		public static int gcd(int n1, int n2) {
			if(n1 > n2) {
				int tmp=n1;
				n1=n2;
				n2=tmp;
				
			}
			while(n1!=0) {
				int r =n2%n1;
				n1=n1;
				n1=r;
			}
			return n2;
		}
}
