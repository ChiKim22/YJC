package Main;

import java.util.*;

public class Main5 {
	
	public static void main (String[] args) {
		
		/*
		 * for(초기식;조건식;증갑식){
		 * 반복문;
		 * }
		 */
		
		
		//testFor();
		//testFor2();
		//testFor3();
		//testSum();
		testFactorial();
		
	}
	
	public static void testFor() {
		
		int i=0;
		
		for(; i<=4;) {
			//for( ; ; ) {} - 무한루프

			System.out.println(i);
			//5번 반복.
			i++;
			//증감식도 생략하여 while문처럼 사용가능.
			
		}
		//block
		//System.out.println(i); -> Err.
		//i가 블록안에 선언되면, 윗문장은 에러가 남.
		System.out.println("반복문이 끝난 후 i : "+i);

		
	}
	public static void testFor2() {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 사용자로부터 시작과 끝 숫자를 입력받는다.
		 *  시작~끝 사이의 짝수를 출력하자.
		 */
		
		System.out.println("시작과 끝 숫자를 입력하세요. ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		for(int i=start; i <= end; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
	}
	
	public static void testFor3() {
		for(int i=10;i>=1; i-=2) {
			System.out.println(i);
		}
	}
	
	public static void testSum() {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("시작과 끝 숫자를 입력하세요.");
		int start=sc.nextInt();
		int end=sc.nextInt();
		
		int sum=0;
		
		for(; start <=end; start++) {
			sum += start;
		}
		System.out.println(sum);
	}
	public static void testFactorial() {
		/*
		 * 5!=5*4*3*2*1
		 * n!=1*2*...*n-1*n
		 * input n
		 * int factorial =1;
		 * 
		 * fac=fac*1
		 * ...
		 * fac=fac*n-1;
		 * fac=fac*n;
		 */
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int n=in.nextInt();
		
		long facto=1;
		
		for(int i=1; i<=n; i++) {
			facto*=i;
		}
		System.out.println(n+"!"+" = "+facto);
	}
}
