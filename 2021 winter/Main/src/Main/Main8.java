package Main;

import java.util.Scanner;

public class Main8 {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		//getPie();
		//testCh04();
		//testArray();
		
		testStringArray();
		
		
	}
	
	public static void getPie() {
		/*
		 * 원주율을 구하는 프로그램 (파이)
		 * 정수형 x 실수형
		 */
		
		int n= input.nextInt();
		double divident;
		double odds =-4;
		double pie = 0.0;
		
		for(int i =1; i<=n; i++) {
			divident = (i-1)*2+1;
			odds= odds*-1;
			pie = pie+odds/divident;
			
		}
		System.out.println("파이는 : "+pie);
		
	}
	
	public static void testCh04() {
		/*
		 * 배열, Array 
		 * 변수를 여러개 저장하고 싶다.
		 */
	
		/*
		int score1, score2, score3, score4, score5;
		
		score1= input.nextInt();
		score2= input.nextInt();
		...
		*/ // 이 번거러운 작업을 해소하기 위하여 배열을 사용.
		
		// 배열선언 - int[] scores; 저 배열 안에는 int만 들어감 - 참조형.
		
		//배열의 index 는 0부터 시작. 원소들 간의 순서가 있음. 원소 하나하나는 int형임.
		
		//int[] scores = new int[5]; //만들때 항상 크기를 지정해줘야함.
		int scores[]=new int[5]; // 뒤에 붙여도 가능.
		// int[] scores=null; 가르키는 주소가 없다. => 에러
		
		//int[] arr= {3,4,5,6,7}; //자동으로 변수 저장. -초기화 할때만 선언 가능.
		//선언 다음 값 바꾸려면 arr[0]=7; 이런식으로 변경가능.
		
		//int[5] arr = new int[]; => 문법 오류.
		
		/*  //배열 크기 지정.
		System.out.println("배열의 크기를 입력 하세요.");
		int size=input.nextInt();
		int[] arr= new int[size];
		*/
		
		int averge = 1;
		int sum = 1;
		
		for(int i=0; i<scores.length; i++) {  // (<=) 하면 범위 밖이라 에러가남.
			
			System.out.println("점수 입력.");
			scores[i] = input.nextInt();
			
		}
		
		System.out.println("-------------------------");
		for(int i=0; i<scores.length; i++) {
			int value=scores[i];
			System.out.println(i+1+"번째 원소 : " + value);
		}
		
		
		/*
		for(int i=1; i<scores.length; i++) {
			System.out.println("점수를 임력하세요.");
			scores[i]= input.nextInt(); // 한번에 여러게 입력 가능.
			sum= sum+scores[i];
			averge = sum/5;
			
		}
		System.out.println("평균 : "+ averge);
		*/
	
	}
	/*
	 * 사용자로부터 몇개의 점수를 입력할지 그 크기를 입력받는다.
	 * 그 크기의 배열변수를 생성한다.
	 * 
	 * 배열의 크기만큼 다음을 반복한다. 
	 * 		사용자로부터 입력받아 배열에 순서대로 저장한다.
	 * 
	 * 배열의 첫번째 원소부터 마지막 원소까지 출력한다.
	 * 그 점수들의 평균을 출력한다.
	 * 입력된 점수 중 최대점수를 출력한다.
	 */
	public static void testArray() {
		
		
		
		System.out.println("몇개의 점수를 입력할지 정해주세요.");
		int size = input.nextInt();
		int[] arr = new int[size];
		
		int sum=1;
		int avage=1;
		int max=0;
		
		
		for(int i=0; i<size; i++) {
			System.out.println(i+1+"번째 점수를 입력하세요.");
			arr[i]=input.nextInt();
			
			sum=sum+arr[i];
			avage=sum/size;
			if(arr[i]>max) {
				max=arr[i];
			}

		}		
		
				
			System.out.println("평균 : "+avage);
			System.out.println("최댓값 : "+max);
			
	
 }
	
	public static void testStringArray() {
		String s ="동해물과 백두산이 마르고 닳도록.";
		System.out.println(s);
		String[] strArr= {"동해","서해","남해","백두산"};
		
		System.out.println("strArr 배열의 값입니다.");
		for (int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		String[] strArr2= new String[5];
		
		strArr2[0]= "한국";
		strArr2[1]= "일본";
		strArr2[2]= "바이든";
		strArr2[3]= "트럼프";
		strArr2[4]= "미국";
		
		System.out.println("*******************************");
		System.out.println("strArr2 배열의 값입니다.");
		for (int i=0; i<strArr2.length; i++) {
			System.out.println(strArr2[i]);
		}
		
		String[] hobbies=new String[5];
		System.out.println("자신의 취미를 반드시 입력하세요.");
		
		for(int i=0; i<hobbies.length; i++) {
			System.out.println("취미를 입력하세요.");
			hobbies[i]=input.nextLine();
		}
		System.out.println("당신의 취미는 다음과 같습니다.");
		for(int i=0; i<hobbies.length; i++) {
			System.out.println(hobbies[i]);
		}
		
	}
	
}
