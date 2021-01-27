package Main;


import java.util.*;

public class Main6 {
	public static Scanner input = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		//testDivisor();
		//testRandomSum();
		//testNestedLoop();
		//testNestedLoop2();
		//testNestedLoop3();
		//testNestedLoop4();
		//testNestedLoop5();
		
		
		//getPrimeNumber();
		
		//testNestedLoop6();
		testNestedLoop7();
		
		
		
	}
	public static void testDivisor() {
		
		System.out.println("양의 정수를 입력하세요 : ");
		int n =input.nextInt();
		
		/*
		 *  n의 약수를 수해서 출력하자.
		 *  1부터 n까지 변수를 i 번 증가시켜가면서 다음을 반북하자.
		 *   만약 n 을 i로 나눴더니 나머지가 0이면 약수이므로.
		 *   i를 출력.
		 */
		input.close();
	
		System.out.println(n+" 의 약수는 다음과 같습니다.");
		
		for(int i = 1; i<n; i++) {
			if(n%i==0) {
				System.out.print(i+ ", "); //한칸 띄어라.
				
				// if (i != n ) System.out.print(", ");
				
			}
		}
		System.out.print(n);
		System.out.print("\n 끝!!");
	}
	
	public static void testRandomSum() {
		
		System.out.println("난수의 개수 : ");
		int n = input.nextInt();
		
		/*
		 * n 개의 난수를 발생시켜서 총합을 더하자.
		 * 1~n 까지 아래를 반복.
		 * 난수발시킨다, 그 난수를 변수 sum에 더한다.
		 */
		
		Random r = new Random();
		

		int sum=0;
		int tmp=0;
		
		for(int i=0; i<n; i++) {
			//System.out.println(r.nextInt(100)+1); //바로 출력, 랜덤의 범위 지정.
			
			tmp=r.nextInt(100);
			System.out.print(tmp+" ");
			sum= sum+tmp;
		}
		System.out.println("난수의 합 : "+"\n"+sum);
		input.close();
	}
	
	public static void testNestedLoop() { //중첩 반복문 원리
		
		for(int i=0; i<5; i++) {
		System.out.println("i: "+i);
		System.out.print("\t"); //줄바꾸기
		for(int j=0; j<5; j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
		
  }
	
	
	public static void testNestedLoop2() {
		/*
		 * for 문을 이용해서 "*****" 출력. 5 line
		 */
		
		for(int i=0;i<5;i++) {
			for(int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public static void testNestedLoop3() {
		
		/*
		 *  *
		 *  * *
		 *  * * *
		 *   ...
		 */
		
		/*
		 * 별표를 찍어야 하는 행 수만큼 반복.
		 */
		
		for(int i=0; i<5; i++) {
			//행의 번호 (i+1) 만큼 별표 찍어라
			System.out.print("*");
			for(int j=0; j<i; j++) {	
			System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void testNestedLoop4() {
		/*
		 * 정수를 입력받아 변수 n에 저장
		 * n개의 행에 다음과 같이 출력한다.
		 * 1 -> n   *****
		 * 2 -> n-1 ****
		 * ...
		 * n -> 1   *
		 */
		
		int n = input.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			//for(int j = 0; j < n-i; j++) {
			for(int j=i; j<n-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public static void testNestedLoop5() {
		/*
		 * 1->      *    blank 4 + * 1
		 * 2->     **	 blank 3 + * 2
		 * ...
		 * 5->  *****    blank 0 + * 5
		 */
		
		int n = input.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				/*
				 * i=0
				 * 	j=0, 1, 2, 3, 4 -> j => 0~3 () , 4 = *
				 * ...
				 * i=4
				 * 	j=0,1,2,3,4 -> 0~4 = *
				 */
				
				if(j<=i) {
					System.out.print(" ");
				
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
	}
	public static void getPrimeNumber() {
		/*
		 * 소수 - 약수가 1과 자기 자신만 있는 수.
		 * n을 입력 받으면, n까지의 소수를 찾는다.
		 * for (int i=2; i<=n; i++) {
		 * 	 i가 소수이면 그 i를 출력.
		 * 
		 */
		System.out.println("정수를 입력하세요 : ");
		int n = input.nextInt();
		
		long start=System.currentTimeMillis();
		
		for(int i=2; i<=n; i++) {
				/*
				 * 각 반복마다 i가 소수인지 판단해서
				 * 소수이면 그 i값을 출력한다.
				 * 
				 * 2부터 i-1 까지의 정수중에 i를 나눌수 있는
				 * 정수가 존재하면 소수가 아닌 것으로 판단.
				 */
				
				boolean isprime=true;
				for(int j=2; j<i; j++) {
				if(i % j ==0) {
					isprime = false;
					break;
				}
			}
				if(isprime) {
					System.out.print(i + " ");
				}
		}
		long end = System.currentTimeMillis();
		System.out.println("\n 경과시간 : "+ (end-start)+"ms");
	}
	public static void testNestedLoop6() {
		
		int n = input.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<2*n-1; j++) {
				if(j >= n-1-i && j <= n-1+i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	public static void testNestedLoop7(){
		
		while(true) {
			int n=input.nextInt();
			if(n <= 0) 
				break;
			if(n%2==0) {
				System.out.println("홀수만 입력하세요.");
				continue;
			}
			for(int i=0;i< n;i++) {
				for(int j=0; j<n; j++) {
					if(i <= n/2) {
						if(j >= (n/2-i) && j<= (n/2+i)) {
							System.out.print("* ");
						}else {
							System.out.print("  ");
						}
					}else {
						if(j >= (i - n/2) && j<= 3*n/2-i-1) {
							System.out.print("* ");
						}else {
							System.out.print("  ");
						}
					}
				}
				System.out.println();
			}
			
		}
		System.out.println("Shutdown....");
	}
}
