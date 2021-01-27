package Test; //7월 2째주

import java.util.*;

public class Test3 {
	private static Scanner input = new Scanner(System.in); // 클래스 전체에 적용됨
	
	
	public static void main(String[] args) {
	
		//testBoolean();
		//calculateLightYear();
		//testExpression();
		//checkLeapYear();
		//testIncreaseDecreaseOperator();
		//testComparisonOperator();
		//testLogicalOperator();
		//testBitWiseOperator();
		//testTypeConversion();
		
		//quadraticEquation(1.0 -3.0 2.0); //수를 넣어 직접적으로 대입 가능
		//quadraticEquation();
		
		//testString();
		//drawRular();
		
		//add();
		//calculateCercle();
		//rectangleArea();
		
		//isLeapYear(); // 문제
		
		//testIfElse();
		//testIfElse2();
		//testIfElse3();
		//bones();
	
		//grade();
		//greeting();
		
		//testSwitch();
		//gradeSwitch();
		//calendarSwitch();
		
		//displayDaysOfMonth();
		
		//testWhile();
		
		//gugudan();
		
		//testWhile2();
		
		//testDoWhile();
		//testDoWhile2();
		
		//gongYakSu();
		//testForLoop();
		
		//factorial();
		
		//findAllDivisorsofN();
		
		//addRandomNumbers();
		
		//printStars(); //별만들기
		
		//testBreak();
		//testContinue();
		
		
		
	}		
	private static void testBoolean() {
		boolean b = true;
		
		int index = 0;
		index = index +1;
		
		System.out.println(index);
		
		System.out.println(b);
		
		b = (1>2);
		
		System.out.println(b);
	}
	
	private static void calculateLightYear() {
		// 태양 다음으로 지구에ㅓ 가까운 별은 프락시마 센타루리
		// 프락시마 별까지의 거리 40e12km, 4e13km, 400e11km
		// LightSpeed = 300000km, 3e5km, 30e4km
		// 프락시마 별까지는 몇광년인지를 계산하라.
		
		// From Centauri / Light speed ==> 광속으로 센타우리까지 몇초 .disttnceInSeconds
		// 1년은 몇초 ==> 60*60*24*365 ==> secondsInAYear
		// DIS / SIY ==> 답
		
		
		double secondsInAYear = 60*60*24*365;
		
		double distanceToCentauri = 40e12; // 40,000,000,000,000
		
		double ligghtSpeed = 30e4; // final double LIGHT_SPEED = 30e4; ==> 상수전환
		
		double lightYear = 40e12/30e4/secondsInAYear;
		
		System.out.println(lightYear);
	}
	
	private static void testExpression() {
		
		int x = 12; //수식 입
		int y = 5;
		int sum = 0;
		
		/*
		System.out.println(x = 5);
		
		System.out.println(x);
		
		System.out.println(x+y);
		
		System.out.println(sum = x+y);
		
		System.out.println(x*y);
		*/
		
		System.out.println(x/y);
		System.out.println(12/5);
		
		System.out.println(12.0/5);
		System.out.println(12.0/5.0);
		
		System.out.println((double)x/(double)y); // 강제로 변환
		
		//System.out.println(12/0); // 0으로 나누면 그 아래로 부터는 진행되지 않음 에러메세지 확
		
		System.out.println("?????????");
	}
	private static void checkLeapYear() {
		boolean isLeapYear = false;
		
		/*
		 * 윤년은 400으로 나누어 떨어지거나, 4로 나누어 떨어지면서 100으로는 나누어 떨어지지 않는 년도 
		 * -윤년의 알고리즘-
		 */
		
		int year = 2020;
		
		isLeapYear = year%400 == 0; //() 로 순서 표현
		
		System.out.println(isLeapYear);
		System.out.println(year%400 == 0);
	}
	
	private static void testIncreaseDecreaseOperator() {
		
		int x = 3;
		int y = 4;
		
		int result = x++ + y; //++x ==> r=8
		
		System.out.println("result: " + result); //8
		System.out.println("x: " + x); //4
	}
	
	private static void testComparisonOperator() {
		int x = 3;
		int y = 4;
		
		System.out.println((x==y) + " ");	
		System.out.println((x!=y) + " ");
		System.out.println((x>y) + " ");
		System.out.println((x<y) + " ");
		System.out.println((x>=y) + " ");
		System.out.println((x<=y) + " ");
		
	}
	
	private static void testLogicalOperator() {
		int x = 3;
		int y = 4;
		
		System.out.println((x==3) && (--y==7));
		System.out.println((x==5) || (y==4));
		
		System.out.println("x:" + x);
		System.out.println("y:" + y);
		
	}
	
	private static void testBitWiseOperator() { // 비트와이즈 (어려움)
		int x = 0x0fff;
		int y = 0xfff0;
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.println(Integer.toBinaryString(4095)); // 0xfff
		System.out.println(Integer.toBinaryString(65520)); // 0xfff0
		
		System.out.printf("(x&y : %x\n", x&y); // printf = Set formet, %x\n ==>16진수
		System.out.printf("(x|y : %x\n", x|y);
		System.out.printf("(x^y : %x\n", x^y);
		System.out.printf("(~x : %x\n", ~x);
		System.out.printf("(x<<4 : %x\n", x<<4);
		System.out.printf("(x>>4 : %x\n", x>>4);
		
		System.out.println("-------------------------------------");
		
		System.out.printf("(x&y : %d\n", x&y); // %d\n ==> 10진수
		System.out.printf("(x|y : %d\n", x|y);
		System.out.printf("(x^y : %d\n", x^y);
		System.out.printf("(~x : %d\n", ~x);
		System.out.printf("(x<<4 : %d\n", x<<4);
		System.out.printf("(x>>4 : %d\n", x>>4);
		
	}
	
	private static void testTypeConversion() {
		int n = 123456789;
		
		//float f = n; //float 6자리-7자리
		double f = n;
		
		System.out.println(f);
		
		n = (int)3.0;
		
		int i;
		
		f = 5/4; // int == 1.0
		
		System.out.println("f : " + f);
		
		f = (double)5/4;
		
		System.out.println("f : " + f);
		
		n = (int) (1.3 + 1.8);
		
		System.out.println("n : " + n);
	}
	
	private static void quadraticEquation() {
		/*
		 * 이차방정식의 근을 구하는 프로그램
		 * ax^2+2+bx+c
		 * (-b+squareRoot(b^2-4ac))/2a, (-b-squareRoot(b^2-4ac))/2a == 근
		 * 
		 */
		
		double a = 1.0;
		double b = -3.0;
		double c = 2.0;
		
		double r1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a); // Math,sqrt = 수학의 루트 기호 
		double r2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
		
		System.out.println(r1);
		System.out.println(r2);
		
	}
	
	private static void testString() {
		String s1;
		String s2;
		
		s1 = "Hello World";
		s2 = "I'm New java Programer XD ";
		
		
		System.out.println(s1 + "\n" + s2);
	}

	private static void drawRular() {
		String s1;
		String s2;
		String s3;
		
		s1 = "..........";
		s2 = s1 + "|" + s1;
		s3 = s2 + "|" + s2;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}
	
	private static void add() {
		
		int n1;
		int n2;
		
		int sum;
		
		// n1 -user input
		// n2 - same
		
		Scanner input = new Scanner(System.in); //Console 따로 쓸시 지금 칸만 가능
		
		System.out.print("n1 : ");
		n1 = input.nextInt();
		System.out.print("n2 : ");
		n2 = input.nextInt();
		
		sum = n1+n2;
		
		System.out.println("A : " + sum);
	}
	
	private static void calculateCercle() {
				
		System.out.print("input r : ");
		double r = input.nextDouble();
		double area = r*r*3.14;
		
		System.out.println("Area : " + area);
				
	}
	
	private static void rectangleArea() {
		
		System.out.println("input wieght : ");
		int r1 = input.nextInt();
		System.out.println("input high : ");
		int r2 = input.nextInt();
		
		int area = r1*r2;
		int perimeter = (r1+r2)*2;
		
		System.out.println("rectangle Area : " + area);
		System.out.println("rectangle perimeter :" + perimeter);
		
		if (r1 == r2) {
			System.out.println("This is Squre.");
		}		
		if (r1 != r2) {
			System.out.println("This is't Sqare.");
		}
	}
	
	private static boolean isLeapYear() {
		/*System.out.println("년도를 입력하세요. 윤년 여부를 확인해줍니다. : ");
		
		int year = input.nextInt();
		*/
		
		
		Calendar calendar = Calendar.getInstance();
		
		int year = calendar.get(Calendar.YEAR);
		
		boolean isLeapYear = (year%400==0) || (year%4==0 && year%100!=0);
		
		
		System.out.println(year + " 년은 윤년입니까? " + "\n" + isLeapYear);
		
					
		return isLeapYear();
	
	}
	
	private static void testIfElse() {
		System.out.println("수를 입력하세요.");
		
		int number = input.nextInt();
				
		if (number > 0) {   // {} 안써도 상관없음. 다만, 2개 이상이면 묶어써야됨.
			System.out.println("양수입니다.");
			System.out.println("Bigger then 0.");
		}else {
			System.out.println("0이거나 음수입니다.");
			System.out.println("......."); // 이와같이 두개일때 {} 사용안하면 위에껏만 처리
		}
		
		/*
		 * if 와 else 는 같이 와야됨.
		 */
		
	}
	
	private static void testIfElse2() {
		System.out.println("수를 입력하시오 : ");
		
		int number = input.nextInt();
		
		if (number%2==0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}		
	}
	
	private static void testIfElse3() {
		
		System.out.println("1번째 정수 : ");
		int n1 = input.nextInt();

		System.out.println("2번째 정수 : ");
		int n2 = input.nextInt();
		
		if(n1 > n2) {
			System.out.println("큰수는  " + n1);
		}else {
			System.out.println("큰수는  " + n2);
		}
	}
		private static void bones() {
			
			final int TARGET = 1000;
			
			System.out.println("실적을 입력하시오(단위 만원) : ");
			int n1 = input.nextInt();
			
			if (n1 >= TARGET) {
				int over = n1 - TARGET;
				System.out.println("실적 달성");
				System.out.println("성과금" + (over/10));
			}else {
				System.out.println("달성 실패...");
				System.out.println("성과금이 없습니다.");
			}
			
		}
		
		private static void grade() {
			int jumsu;
			
			char grade = 'f';
			
			System.out.print("성적을 입력");
			jumsu = input.nextInt();
			
			/*
			 * 90~ A
			 * 80~89 b
			 * 70~79 c
			 * 60~69 d
			 * ~59 f
			 */
			
			if (jumsu >= 90) {
				grade = 'A';
				
			}else if (jumsu >= 80) {
				grade = 'B';
			}else if (jumsu >= 70) {
				grade = 'C';
			}else if (jumsu >= 60) {
				grade = 'D';
			}else {
				grade = 'F';
			}
			
			System.out.print("Grade : " + grade);
						
			
		}
		
		private static void greeting() {
			int hour;
			
			/*
			 * 11전 굿모닝
			 * 15전 굿애프터눈
			 * 20전 굿이브닝
			 * 24전 굿나잇
			 * 출력
			 */
			
			
			Date date = new Date(); //현재의 시각정보를 나타냄
			//hour = date.getHours(); // 현재 시각정보를 가져옴 줄- deprecated 안쓰는게 바람직 유실가
			
			Calendar calendar = Calendar.getInstance();
			hour = calendar.get(Calendar.HOUR_OF_DAY); //날짜 시간 등등을 표시가능
			
			
			if (hour < 11) {
				System.out.print("Good Morning!!");
			}else if (hour < 15) {
				System.out.print("Good Afternoon!");
			}else if (hour < 20) {
				System.out.print("Good Evening");
			}else {
				System.out.print("Good Night");
			}
			
		}
		
		private static void testSwitch() {
			
			System.out.print("정수 입력");
			int n = input.nextInt();
			
			switch(n) {
			case 0:
				System.out.println("없음");
				break;
			case 1:
				System.out.println("하나");
				break;
			case 2:
				System.out.println("둘");
				break;
			case 3:
				System.out.println("셋");
				break;
			default:	
				System.out.println("많음");
			}
			
			
		}
		private static void gradeSwitch() {
			
			System.out.print("성적을 입력하시오");
			int n = input.nextInt();
			
			switch(n/10) {
			case 10:
			case 9 :
				System.out.println("A");
				break;
			case 8 :
				System.out.println("B");
				break;
			case 7 :
				System.out.println("C");
				break;
			case 6 :
				System.out.println("D");
				break;
			default:
				System.out.println("F");
			}
			
		}
		
		private static void calendarSwitch() {
			
			System.out.println("달의 이름을 영어 입력");
			String month = input.nextLine();
			int monthNumber = 0;
			
			/*switch(month.toLowerCase()) {
			case "jaunary":
				monthNumber = 1;
				break;
			case "febuary":
				monthNumber = 2;
				break;
			case "march":
				monthNumber = 3;
				break;
			case "april":
				monthNumber = 4;
				break;
			case "may":
				monthNumber = 5;
				break;
			case "june":
				monthNumber = 6;
				break;
			case "july":
				monthNumber = 7;
				break;
			case "august":
				monthNumber = 8;
				break;
			case "september":
				monthNumber = 9;
				break;
			case "october":
				monthNumber = 10;
				break;
			case "november":
				monthNumber = 11;
				break;
			case "december":
				monthNumber = 12;
				break;
			default: 
			} */
			//System.out.println(monthNumber);
			
			
			
			/*
			 * 기초형 변수: 값 자체가 저장됨
			 * 참조형 변수: 값의 주소값이 저장됨
			 */
			
			
			if (month.equals("january")) {
				System.out.println(1);
			}else if (month.equals("febrauary")) {
				System.out.println(2);
			}
		}
		
		
		private static void displayDaysOfMonth() {
			
			
			
			
			
			System.out.print("일수를 알고싶은 달 입력");
			int month = input.nextInt();
			
			/*
			 * 4,6,9,11 - 30일까지
			 * 1,3,5,7,8,10,12 - 31일까지
			 * 2 - 28,29일까지
			 */
			
			while(month < 1 || month > 12) {
				System.out.println("1에서 12월 사이의 달만 입력하세요!");
				System.out.print("일수를 알고싶은 달 입력");
				month = input.nextInt();
			}
			
			
			int days = 31;
			
			switch(month) {
				case 4:
				case 6:
				case 9:
				case 11:	
					days=30;
					break;
				case 2:
					boolean leap = isLeapYear();
					if(leap) days = 29;
					else days =28;
				default:
			}
			System.out.println(month + "월의 날수는 " + days);		
		}
		
		private static void testWhile() {
			
			/*
			 * 다섯번 반복 {
			 * "환영합니다." 출력
			 * int i =0;
			 * while(i<5) { ==>  // 그냥 돌리면 무한루프
			 *  i = i+1; // i += 1; , i++ , ++i // 이걸 추가해야 돌아감
			 *  }
			 */
			
			//0,1,2,3,4 ,5부터는 찍지 않
			
			int i = 0;
			while (i < 5) {
				System.out.println(i + " 환영합니다.");
				
				i++;
			}
			
			System.out.println("i" + i);
			
		}
		
		private static void gugudan() {
			
			
			/*
			 * 2~9단사이 반복
			 * while(dan > 1 && dan < 10)
			 */
																		
			System.out.println("출력하고 싶은 구구단의 단");
			
			//int dan = input.nextInt();
			
			/*
			while(dan < 1 || dan > 10) {
				System.out.println("2단에서 9단까지만 입력하세요!");
				System.out.print("출력하고싶은 구구단의 단");
				dan = input.nextInt();
			}
			*/
			
			int dan =0;
			do {
				System.out.println("2단에서 9단까지만 입력하세요!");
				System.out.print("출력하고싶은 구구단의 단");
				dan = input.nextInt();
			}while(dan < 2 || dan > 9);
			
			
			int i = 1;
			
			
			while (i < 10) {
				//System.out.println(dan + "*" + i + "=" + dan*i);
				System.out.printf("%d * %d = %2d\n", dan, i , dan*i); // 정렬
				i++;
			}
		}
		
		private static void testWhile2() {
			int i =1;
			int sum=0;
			
			while(i < 11) {
				sum =sum+i;
				i++;
			}
			System.out.println("합계 : " + sum);
			
		}
		
		private static void testDoWhile() {
			int i = 10; //i,j,k,l,m,n - 사용가능
			
			do {
				System.out.println("i 의 값 : " + i);
				i++;
			}while( i < 3 );
			System.out.println("종료합니다...");
			
		}
		
		private static void testDoWhile2() {
			int month;
			
			do {
				System.out.println("올바른 월을 입력하세요(1~12) : ");
	
				month = input.nextInt();
				
				
			}while (month < 1 || month >12);
			System.out.println("사용자가 입력한 월은 : " + month);
			
		}
		
		private static void gongYakSu() {
			
			System.out.println("두개의 정수를 입력하시오:");
			int x = input.nextInt();
			
			int y = input.nextInt();
			
			System.out.println(" x : " + x + "\n" + " y : " + y);
			
			
			int r =0;
			while(y!=0) {
				r = x%y;
				x = y;
				y = r;
						
			}
			System.out.println("최대공약수는 : " + x);
			
		}
		
		private static void testForLoop() {
			/*
			int i =0;
			
			
			while(i < 5) {
				System.out.println("i의 값은 : " + i);
				i++;
			}
			*/
			
			/*
			for (int i = 0; i< 5; i++) {
				System.out.println("i의 값은 :" + i);
			}		
			System.out.println("종료합니다....");
			*/
			
			
			/*
			int sum =0;
			int i =1;
			while (i <= 10) {
				sum += i;
				i++;
			}
			*/
			
			
			/*
			int sum =0;
			for(int i = 0; i <= 10; i++) {   // for (int i =0; i < 10; i += 2) => 2개씩 올라감
				sum += i;
			}
			
			
			System.out.println("1부터 10까지의 합은 " + sum + "입니다.");

			for (; ; ) {
				System.out.println("Infinity Loop");
			}
			*/
			
			
			long start = System.currentTimeMillis(); //for문 도는 시간 측정
			for (int i=0; i<100000; i++) {
				;
			}
			long end = System.currentTimeMillis();
			System.out.println("elapsed time: " + (end-start)+ "ms");
			
			
		}
		
		private static void factorial() {
			/*
			 * 5! => 5*4*3*2*1
			 * 3! => 3*2*1
			 */
			
			
			long factorial = 1; //안전하게 long으로 변환
			
			System.out.println("정수를 입력하세요.");
			int n = input.nextInt();
			
			for (int i =2; i<=n; i++) { // (i =n; i >=2; i--) 
				factorial *= i;  //factorial = factorial * i;
			}
			
			
			/*
			System.out.printf("%d! %d입니다.", n , factorial); // 무한루프
			if(n < 0) break;
			* int i =1, mySum =0; => 2개 동시실행 (for문) => 빈도 낮음, 초기식
			* int i =1;
			* int mySum = 0; 
			* i++, j++ +> 증감식 여러게 사용가능
			*/
		
		
		}
		
		private static void findAllDivisorsofN() {
			System.out.println("양의 정수를 입력하세요.");
			int n = input.nextInt();
			
			System.out.println(n + " 의 약수는 다음과 같습니다.");
			
			for (int i = 1; i <= n; i++) {
				if(n % i ==0) {
					System.out.print(i + " ");
				}
			}
		}
		
		private static void addRandomNumbers() {
			System.out.print("난수의 개수");
			int n =input.nextInt();
			
			Random random = new Random();
			
			int sum=0;
			for (int i=0; i<n; i++) {
				int randomNumber = random.nextInt(100); // 0~99 사이의 무작위 정수값
				sum += randomNumber;
			}
			
			System.out.println("(0~99)난수" + n + "개의 합" +"\n"+ sum);
			
		}
		
		private static void printStars() {
			
			/*
			for (int i=0; i<5; i++) {				
				for (int j=0; j < 10; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			*/
			
			
			/*
			 *  *
			 *  **
			 *  ***
			 *  ****
			 *  *****
			 */
			
			/*
			 *  i = 0~4 5번 반복 {	==>for 문으로
			 * 		별표를i+1개 찍는다.  ==> for 문으로  (j=0 ==> i+1 까지 반복)
			 * 		줄바꾼다.	
			 * 
			 * }
			 */
			
			
			/*
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < (i+1); j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			*/
			
			
			/* input = 4
			 * 
			 *  ****
			 *  ***
			 *  **
			 *  *
			 */
		
			
			/*
			System.out.println("양의 정수 입력."); 
			int n = input.nextInt();
			
			for (int i = 0; i < n; i++) {
				for (int j = i; j < n; j++) {
					System.out.print("*");
			}
			System.out.println();
			}
			*/
			
			/* -----------------------------
			 *  int n
			 *  
			 *  n=6
			 *     0 1 2 3 4 5 6 7 8 9 10
			 *   0	         *
			 *   1	       * * *	
			 *   2       * * * * *  
			 *   3     * * * * * * *
			 *   4   * * * * * * * * *
			 *   5 * * * * * * * * * * *
			 *   6       
			 *   7
			 *   8
			 *   9
			 *  10
			 *   
			 * ------------------------------  
			 *   
			 *   
			 *   0 1 2 3 4 （j）
			 * 0     *
			 * 1   * * *
			 * 2 * * * * *
			 * (i)  
			 *   
			 * ------------------------------
			 *   
			 *   i = 0, 1, 2, 3, ..
			 *   별표를 1,3,5,7,.. 으로 찍음
			 *   
			 *   입력한 값 n
			 *   별표 : 1, 3, 5, ..., 2n-1개까지 각 행에 찍는다.
			 *   (2n-1)개를 2로 나누면 n-1
			 *   
			 */
			
			
			/*
			System.out.print("양의 정수 입력");
			
			int n = input.nextInt();
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < 2*n-1; j++) { 
					// 만약에 j 가 중앙점 (n-1) - i 에서 (n-1) + i 사이라면
					if (j >= n-1-i && j <= n-1+i)
					System.out.print("*");
					// 그렇지 않다면
					else
					System.out.print(" ");
				}
				System.out.println();
			}
			*/
		
			
			/*
			 *      0 1 2 3 4 (j)
			 *    0         *
			 *    1       * *  
			 *    2     * * *
			 *    3   * * * * 
			 *    4 * * * * *
			 *   (i)
			 *   
			 *   i=0 ==> j = n-1
			 *   1 ==> j = n-2
			 */
						
			/*
			System.out.print("양의 정수 입력");
			
			int n = input.nextInt();	
			
			for ( int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if (j >= i) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			  */
	
	
			/*    (j >= i)
			 *     * * * *
			 *       * * *
			 *         * *
			 *           * 
 			 * 
			 */
			
			
			
			/*
			while (true) {
				System.out.print("정수 입력:");

				int n = input.nextInt();
				
				if (n < 0) break;
				
				for (int i =0; i < n; i++) {
					for (int j = 0; j < 2*n-1; j++) {
						if (j>= (n-1-i) && j <= (n-1+i)) System.out.print("*");
						else System.out.print(" ");
					}
				  System.out.println();
				}
				
				
			}
			*/
			
			
		/*
		 *                  *         
		 				   ***        
        				  *****       
       					 *******      
      					*********     
 
		 */
		
			
			
			
			/*   (n = 7)
			 * 
			 *   0 1 2 3 4 5 6 (j)
			 * 0 	   *
			 * 1     * * *
			 * 2   * * * * *
			 * 3 * * * * * * *
			 * 4   * * * * * 
			 * 5     * * *
			 * 6   	   *	
			 *(i) 
			 *
			 *	0 ~ n/2 까지는 삼각형을 출
			 *	n/2 ~ n-1 까지의 행은 역삼각형을 출력
			 *	i = 0 : j의 범위가 (중앙점 -0) ~ (중앙점 +0) 일 떄 *   ==> 중앙점은 n/2
			 *	i = 1 : j의 벙위가 (중앙점 -1) ~ (중앙점 +1) 일 떄 * 	
			 *  i = 2 : j의 벙위가 (중앙점 -2) ~ (중앙점 +2) 일 떄 * 
			 * 	...
			 *  i = n/2 일 때까지 ...    ==> j = (n/2 -i) ~ (n/2 + i) == "*"
			 *  
			 *	------------------------------
			 *  
			 * 	i = n/2 ~ n-1 까지의 행은 역삼각형을 출력
			 * 	i = n/2 + 1 : j의 법위가 0 + 1 ~ (n-1)-1
			 *  i = n/2 + 2 : j의 법위가 0 + 2 ~ (n-1)-2
			 *  i = n/2 + 3 : j의 법위가 0 + 3 ~ (n-1)-3
			 *  
			 *  ...
			 *  i = n-1 일 때까지 ...    ==> j = (i - n/2) ~ (n-1) - (i-n/2) == "*"
			 *  										==> 	3n/2-i-1
			 *  	
			 * 
			 *	한 행에 출력해야 하는 * 의 최대수는 n
			 *
			 */
			
			
			for( ; ; ) {
			
				System.out.print("정수 입력:");

				int n = input.nextInt();
				
				if (n <= 0) break;
				
				if (n % 2 ==0) {
					System.out.println("홀수만 입력하세요.");
					continue;
				}
				
				for (int i = 0; i < n; i++) {
					System.out.printf("%2d", i);
					for (int j = 0; j < n; j++) {
						if ( i <= n/2 ) {  // 삼각형 모양의 별표를 출력하는 로직이 와야하
							if (j >= (n/2 - i) && j <= (n/2 + i)) {
							System.out.print("*");
							}else {
								System.out.print(" ");
							}
						}else { // 역삼각형 모양의 별표를 출력하는 로직이 필요
							if (j >= (i - n/2) && j <= 3*n/2-i-1) {
								System.out.print("*");
							}else {
								System.out.print(" ");
							}
						}
					}
						System.out.println();
						
				   }
						System.out.println("0 - Shutdown.");
				}
			System.out.println("Shuting Down...");
		
		}
		
		private static void testBreak() {
			
			/*
			 * 	다음을 무한 반복합니다 ( )
			 * 	정수를 입력받아 변수 grade에 저장;
			 * 	만약 grade의 값에 음수가 들어가면 반복 중단;
			 *  입력받은 정수를 변수 total에 누적;
			 *  입력받은 정수의 수는 변수 count를 이용해 계산
			 *  
			 *  
			 *  누적된 함수 total을 이용해 입력된 정수들의 평슌을 출력;
			 *  
			 */
			
			int total=0, count=0, grade=0;
			
			while(true) {	
				
			System.out.print("점수를 입력하세요. (종료는 -1)");
			grade = input.nextInt();
			
			if(grade > 100 ) {
				System.out.print("0~100 사이의 값만 입력하세요.");
				continue;
				}	
			
			if (grade < 0) break;
			total += grade;
			count++;
				}
			System.out.println("평균은 : " + total/count +"점 " + "\n" + "종료합니다...");
			if (total/count ==100) {
				System.out.println("100점 축하드려요!!!");
						}
		
			}	
		
		private static void testContinue() {
			String s = "no news is good news.";
			int n=0;
			/*
			 * i=0 ~ (문자열의 길이-1)만큼 다음을 반복한다. {
			 * 	만약 문자열의 i번째 문자가 'n'이 아니면 다음 반복으로 넘어감;
			 * 	n++;
			 * }
			 * 
			 */
			System.out.println("문자열의 길이는 :" + s.length());
			for (int i =0; i < s.length(); i++ ) {
				
				/*
				if (s.charAt(i) != 'n') continue;
				n++;
				*/
				
				if (s.charAt(i) == 'n') n++; // continue문
				
			}
			System.out.println("문장에서 발견된 n 의 갯수 :" + n);
			
			
		}
		
		
}
