package Main;
import java.util.*;
public class Main7 {
	
	public static Random random = new Random();
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		//getPrimeNumber();
		//getAverage();
		//getGuGuDan();
		
		//countChar();
		
		//guessNumber();
		//lotto();
		
		
		
		
	}
	
	public static void lotto(){
		//로또의 확률.
		double result=1;
		double dividend=45;
		
		for(int i=1; i<=6; i++) {
			result=result*(dividend-i+1)/i;
		}
		System.out.println("확률 : 1/"+(int)result);
		
	}
	
	public static void guessNumber() {
		/*
		 * int num = 59; or random
		 * 
		 * int count = 0;
		 * 	사용자 num값을 맞출때까지 다음을 반복
		 *  사용자로부터 정수값을 입력받음.
		 *  count++;
		 *  받은 값이 num과 같으면 반복 중단.
		 *  
		 *  그 값이 num가 같다면 "count 번에 맞추셨습니다" 출력.
		 */
		
		int num = random.nextInt(1000)+1; // 1~1000 값 출력.
		int count=0;
		int ans=0;
		
		do {
			System.out.print("1~1000까지의 랜덤수를 맟춰주세요.");
			ans = input.nextInt();
			count++;
			if(num>ans) {
				System.out.println("Up");
				continue;
			}else if(num<ans){
				System.out.println("down");
				continue;
			}else {
				System.out.println("good!!");
			}
		}while(ans!=num);
		
		System.out.println(count+"번 만에 맟추셨습니다!!!");
		System.out.println("정답은 " + num);
		input.close();
	}
	
	public static void countChar() {
        // String s = new String("no news is good news"); 
		// 자바에서는 굳이 new 까지 할 필요 없음.
		
		String s = "no news is good news";
		// 자바는 무조건 큰따음표로. 참조형은 값이 저장되는게 아니라 값의 주소를 저장함.
		
//		System.out.println(s.length());
//		System.out.println("첫번째 글자 : " + s.charAt(0));
//		System.out.println("두번째 글자 : " + s.charAt(1));
//		System.out.println("마지막 글자 : " + s.charAt(19));
		
		
		/*
		 * s.charAt(0) -> 'n'
		 * s.charAt(1) -> 'o'
		 * s.charAt(2) -> ' ' 공백까지 취급됨.
		 */
		int count =0;
		for(int i=0; i<s.length(); i++) {
			if( s.charAt(i) == 'n') {
				count++;
			}
		}
		System.out.println("문자열 : "+s);
		System.out.println("해당 문자열에 있는 'n'의 개수." + count);
		
		/*
		 * s의 첫번째 문자부터 마지막 문자까지 반복을 한다.
		 * 문자가 'n'이면 count를 1 증가시킨다.
		 * 
		 * count를 출력.
		 */
		
		
	}
	
	public static void getPrimeNumber() {
		
		System.out.println("정수 입력.");
		int n = input.nextInt();
		
		for(int i=2; i<=n; i++) {
			boolean isprime=true;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					isprime= false;
					break;
				}
			}
			if(isprime) {
				System.out.print(i+" ");
			}
		}
		
	}
	
	public static void getAverage() {
		/*
		 * 정수를 입력받아서, 그 정수의 평균을 구하자.
		 * int jumsu=0;
		 * int sum=0;
		 * 
		 * 음수값이 입력될때 까지 다음을 반복한다.
		 * jumsu 사용자가 입력한 값.
		 * count=count+1;
		 * sum=sum+jumsu;
		 * 
		 * 평균: sum/count;
		 */

		int sum=0;
		int count=0;
		int jumsu=0;
		
		while(true) { //무한 루프
			System.out.println("점수를 입력하세요.(종료는 -1) : ");
			jumsu=input.nextInt();
			if(jumsu<0) {
				break;
			}
				sum=sum+jumsu;
				count=count+1;	
		}
		System.out.println("평균은 : "+(double)sum/count);
		input.close();
	}
	public static void getGuGuDan() {
		while(true) {
			System.out.println("구구단중에서 알고싶은 단 입력 (종료는 0) : ");
			int n=input.nextInt();
			if(n<=0) {
				break;
			}
		
			for(int i=1;i<=9;i++) {
				System.out.println(n+" x "+i+" = "+n*i);
			}
		}
	}
}
