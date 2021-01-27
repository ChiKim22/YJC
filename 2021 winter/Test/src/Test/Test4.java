package Test;

import java.util.*;

public class Test4 {
	private static Scanner input = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		 //guessNumber(); // 숫자 맟추기 게
		 //getLottery(); // 로또 1등 확율 구하
		 //getLottery2(); // "
		 getPi();
		 
		 
		 
	}
	
	private static void guessNumber() {
			
			Random rand = new Random(System.currentTimeMillis()); // 랜덤 수 제공.
		
			int answer = rand.nextInt(1000);
			int guess =0;
			int tryCount=0;
			
			/*
			 * 무한반복
			 * 정수값
			 * tryCount++;
			 * 값이 크면 "그 수는 커요"
			 * 작으면 " 그 수는 작아요 "
			 * 같으면 반복을 빠져나감
			 * 
			 * "축하합니다 시도횟수는 + tryCount + 입니다.
			 * 
			 */		
			
			
			while(true) {
				System.out.print("정답을 추측하여 보세요!!(1~1000): ");
				guess = input.nextInt();
				tryCount++;
				if(guess < answer) {
					System.out.print("그 수보다는 더 커야해요.");
				}else if(guess > answer) {
					System.out.print("그 수보다는 더 작아야해요.");
				}else {
					break;
				}
			}
			System.out.println("축하합니다!!! 정답은 "+answer+ " 이고 "+"시도횟수는 "+ tryCount+" 번 입니다.");
			
			
		}
		private static void getLottery() {
			
			long odd = (45L*44*43*42*41*40)/(6*5*4*3*2*1);  // 45L ==> 롱으로 취급됨.
			System.out.println("로또 1등 확률은 : 1/"+odd);
			
			/*
			 *  dividend = n 
			 *  divisioe = 1
			 *  n/1*(n-1)/2*...(n-k+1)/k
			 *  
			 *  long n = 45;
			 *  long k = 6;
			 *  long odds = 1;
			 *  for(int i = 1; i <= k; i++){
			 *  odds = odds*(n+1-i)/i;
			 *  }
			 */
			
		}
		private static void getLottery2() {
			long n =45;
			long k =6;
			long odds=1;
			for(int i =1; i<=k; i++) {
				odds = odds*(n+1-i)/i;
			}
			System.out.println("로또 1등 확률은 : 1/"+odds);
		}
		
		private static void getPi() {
			
			double dividend = 4.0;
			double divisor = 1.0;
			
			int loopCount =200000000;
			double pi=0;
			
			for(int i =0; i< loopCount; i++) {
		
				pi += (dividend/divisor);
			
				dividend *= -1;
				divisor += 2;
			}
			System.out.println("Pi: "+pi);
			}
	}

