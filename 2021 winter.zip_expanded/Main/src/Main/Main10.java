package Main;

import java.util.Scanner;
import java.util.Random;

public class Main10 {
	
	public static Scanner input= new Scanner(System.in);
	public static Random rand = new Random();
	
	public static void main(String[] args) {
		
		//seqSearch();
	
		//dice();
		theaterReservation();
		
		
		
	}
	public static void theaterReservation() {
		/*	
		 * 	좌석 수는 10개 정수형 배열로 표현.
		 * 	베열 인덱스 0 은 좌석번호 1번
		 * 	....
		 * 	배열 인덱스 9 는 좌석번호 10번.
		 * 	다음을 무한반복한다.
		 * 		현재 극장 좌석 상태를 출력한다.
		 *		사용자로부터 예약 좌석 번호를 입력받아 예약한다(예약된 자리는 1로 표시)
		 *		사용자가 좌석호로 음수를 입력하면 반복을 종료한다.
		 */
		
		final int numOfSeats =10;
		int[] seats = new int[numOfSeats];
		
		while(true) {
			System.out.println("\n############################################");
			
			for(int i=1; i<= seats.length; i++) {
				System.out.printf("%2d " ,i);
			}
			System.out.println();
			//현재 좌석상태.
			for(int i=0; i<seats.length; i++) {
				System.out.printf("%2d " , seats[i]);
			}
			System.out.println("\n############################################\n");
			
			System.out.println("예약할 좌석 번호 : ");
			int seatNumber = input.nextInt();
			if(seatNumber < 0)break;
			
			if(seatNumber > seats.length) {
				System.out.println("좌석 번호는 1번에서 "+ seats.length +"번까지 입니다.");
				continue;
			}
			
			// 이미 예약된 자리인지 체크
			if (seats[seatNumber-1]==1) {
				System.out.println("이미 예약된 좌석입니다.");
			}else {
			seats[seatNumber-1]=1;
			}
		}
		System.out.println("좌석 예약 시스템을 종료합니다...");
		
		
	}
	
	public static void seqSearch() {
		int s[]= new int[10];
		
		for(int i=0; i<s.length; i++) {
			s[i] = rand.nextInt(100)+1;
		}
	
		
		int value;
		
		System.out.println("1~100 사이의 찾고싶은 값은?");
		value = input.nextInt();
		
		int i=0;
		for(; i<s.length; i++) {
			if(s[i] == value) {
				break;
			}
		}
		
		if(i < s.length)
		System.out.println("그 값은 : "+ (i+1)+ "번째 있습니다.");
		else
		System.out.println("찾지 못했어요...");
		
	System.out.println(s);
	for (i=0; i<s.length; i++) {
		System.out.print(s[i]+" ");
		}
	}
	
	public static void dice() {
		/*
		 * 주사위를 만번 던졌을때 1~6면이 몇번 나오는지를 배열에 저장하고 출력하자
		 * 배열 인덱스0은1면....
		 * 배열 인덱스5는6면을 나타낸다고 가정하자.
		 */
		
		final int SIZE =6;
		int[] dice = new int[SIZE];
		
		for(int i=0; i<10000; i++) {
			//System.out.println(dice[i]++); //0000 (++dice[i]) => 1111
			
			//System.out.println((int)(Math.random()*SIZE));
			//int num = (int)(Math.random()*SIZE); // 0~5사이의 값
			//++dice[num]; // dice[num] = dice[num] +1;
			
			++dice[(int)(Math.random()*SIZE)];
		}
		int total =0;
		for(int i =0; i<dice.length; i++) {
			System.out.println(i+1+"면이 나온 수 :"+dice[i]);
			total+=dice[i];
		}
		System.out.println("총 던진 횟수 : "+total);
 	}

}
