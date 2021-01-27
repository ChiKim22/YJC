package Pratice;

public class Pratice {

	public static void main(String[] args) {
		if(args.length >0) {
			
			int n1, n2;
			//wrapper class: int -> Integer, short -> Short, long -> Long
			
			if(args.length !=2) {
				System.out.println("사용법 => java Pratice num1 num2");
				return; // 리턴문을 만나면 종료.
			}
			
			n1 = Integer.parseInt(args[0]);
			n2 = Integer.parseInt(args[1]);
			
			System.out.println(n1+"과 "+n2+"의 합:"+(n1+n2));
			
//			System.out.println("메인 메소드로 전달된 인자");
//			for(int i=0; i< args.length; i++) {
//				System.out.println(args[i]);
			}else {
			System.out.println("메인 메소드로 전달된 인자가 없습니다.");
			}
			
		
		
	}
	
}
