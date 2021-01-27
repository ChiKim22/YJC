package Test;

public class Test2 {
	public static void main(String[] args) {
	
	
	
		
		//testIntLiteral(); // 1번
		//calculateLightMovingDistance();  // 2번
		//calculateCircleArea(); //3번
		//testFloatingPointNumber(); //4번
		//testChar();//5
		
	}
	private static void testIntLiteral() { //노란줄- 정의는 되었지만 한번도 사용되지 않음 
		
		System.out.println(14);
		System.out.println(016);
		System.out.println(0xE);
		System.out.println(0b1100);
		
		System.out.println(123_456); //_가 있어도 기능으로 인식 가능 
		
		System.out.println("Byte.MAX_VALUE : " + Byte.MIN_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
	
	private static void calculateLightMovingDistance() {
		
		/*
		 * 1.빛의 1년동안 이동거리 계산 30만키 = lightSpeed
		 * 2. lightSpeed * 60 * 60 *24 * 365
		 */
		
		//int,short,byte lightSpeed = 300000; 불가능 오버플로
		
		long lightSpeed = 300000;
		
		long distance = lightSpeed * 60 * 60 *24 *365; // 내부적으로 인트형으로 되기 때문에 결과가 나오지 않음 - 큰쪽으로 맟춰
		
		System.out.println("Moving Distance : " + distance); 
		
		// int로 할시 오버플로우로 인해 최대치를 초과하여 계산 불가능
		// 연산의 자료유형이 다르면 그에따라 값도 틀려지고 서로 맟춰주려고 함
	}
	
	private static void calculateCircleArea() {
		
		/*
		 * 반지름 5인 원의 넓이 계산
		 * 원넓이= 반지름*반지름*3141592
		 */
		
		int r = 9;
		
		float area = r*r*3.141592F; // double 8바이트짜리 float =2 bit 
		//F- 플로트 타입으 강제로 변경
		
		System.out.println("원의 넓이 : " + area + "입니다.");
		
		//int area = r*r*3.141592; //매카니즘이 틀림 큰쪽으로 자료유형 변경
		
	}
	
	private static void testFloatingPointNumber() {
		double num1 = 146.91; // 내부적으로 더블 플로트로 변경시 f 추가
		double num2 = 1.4691E+2; //E+2 = 10의 2승 (지수표기법)
		double num3 = 0.14691E+3;
		double num4 = 14691E-2;
		
		System.out.println("num : " + num1);
		System.out.println("num : " + num2);
		System.out.println("num : " + num3);
		System.out.println("num : " + num4);
		
	}
	
	private static void testChar() {
		
		char ch1 = '가';
		char ch2 = '\uac00';
		
		System.out.print(ch1+"\n"); // println 줄까지 빠꿔줌
		System.out.print(ch2); // "/n" = println
	}
  }