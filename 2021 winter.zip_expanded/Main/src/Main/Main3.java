package Main;

import java.util.*;

public class Main3 {
	
	public static void main(String[] args) {
		
		//testIf();
		//testSwitch();
		//testSwitch2();
		//testSwitch3();
		testSwitch4();
		
		
		
	}
	
	public static void testIf() {
		
		/*
		 * 현재 시각에 따라서
		 * 06~12 Good Morning!
		 * 12~17 Good Afternoon!
		 * 17~21 Good Evening!
		 * 21~06 Good Night!
		 */
	
		Date date = new Date();
		int hour = date.getHours();
		
		if(hour >6 && hour <12) {
			System.out.print("Good Morning!");
		}else if (hour >12 && hour <17) {
			System.out.print("Good Afternoon!");
		}else if (hour >17 && hour <21) {
			System.out.print("Good Evening!");
		}else {
			System.out.print("Good Night!");
		}
		
	}
	
	
	public static void testSwitch() {
		
		Scanner input = new Scanner(System.in);
		
		int n = - 0;
		System.out.println("1~5사이의 정수 입력.");
		n=input.nextInt();
		
		switch(n) {   //byte,short,int 사실은 int 만 됨 바이트랑 쇼트는 자동변환으로 가능.
		case 1:
			System.out.println("1을 선택했습니다.");
			break;
		case 2:
			System.out.println("2을 선택했습니다.");
			break;
		case 3:
			System.out.println("3을 선택했습니다.");
			break;
		case 4:
			System.out.println("4를 선택했습니다.");
			break;
		case 5:
			System.out.println("5를 선택했습니다.");
			break;
		default:
			System.out.println("잘못 선택했습니다.");
				
		}
		
		
	}
	public static void testSwitch2() {
		
		/*
		 * 1> 하나
		 * 2> 둘
		 * 3> 
		 * 그외> 잘못입
		 */
		
		Scanner input = new Scanner(System.in);
		
		int n =-0;
		System.out.println("정수 입력: (1~3)");
		n= input.nextInt();
		System.out.println("입력 받았습니다.");
		
		
		switch(n) {
		case 1:
			System.out.println("하나");
			break;
		case 2:
			System.out.println("둘");
			break;
		case 3:
		    System.out.println("삼");
		    break;
		default:
			System.out.println("잘못입력.");
		}
	}
	
	public static void testSwitch3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("하나,둘 또는 셋을 입력.");
		String s = sc.nextLine();
		
		switch(s) {   //관계연산자는 기초형 타입만. 문자X
		case "하나":
			System.out.println(1);
			break;
		case "둘":
			System.out.println(2);
			break;
		case "셋":
			System.out.println(3);
			break;
		default:
			System.out.println("잘못 입력.");
		}
		
		System.out.println("---------------------------");
		
		if(s.equals("하나")) {
			System.out.println(1);
		}else if(s.equals("둘")) {
			System.out.println(2);
		}else if(s.equals("셋")) {
			System.out.println(3);
		}else {
			System.out.println("잘못 입력");
		}
	}
	
	public static void testSwitch4() {
		/*
		 * 점수를 입력.
		 * 90~100 >A
		 * 80~89 >B
		 * 70~79 >C
		 * 60~69 >D
		 * 나머지 >F
		 */
		Scanner sc = new Scanner(System.in);
		int s= -0;
		System.out.println("점수 입력 :");
		s=sc.nextInt();
		
		switch(s/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default :
			System.out.println("F");
		}
		
		
		}
	
}
