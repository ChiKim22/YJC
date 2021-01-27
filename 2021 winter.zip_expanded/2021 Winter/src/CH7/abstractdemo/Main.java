package CH7.abstractdemo;

import CH7.Bus;

public class Main {

		public static void main(String[] args) {
			//Shape s = new Shape(); // 추상 클래스의 객체는 만들 수 없음.
			//다형성(Polymorphism) : 하나의 참조변수가 다양한 타입의 객체를 참조할 수 있음, 동일한 메세지로 다양한 기능을 수행할 수 있음.
			
//			Shape s = new Ractangle();
//			s.draw(); // Dynamic binding
//			
//			s= new Circle();
//			s.draw(); //동적 바인딩
			
			Circle c = new Circle();
//			executeDraw(c);
			
			Ractangle r = new Ractangle();
//			executeDraw(r);
			
			Triangle t = new Triangle();
//			executeDraw(t);
			
			Shape[] arr = new Shape[3];
			arr[0]=c;
			arr[1]=r;
			arr[2]=t;
			
			executeDraw(arr);
			
			Object obj = c;
			System.out.println(obj.getClass().getName());
			obj = r;
			System.out.println(obj.getClass().getName());
			obj = t;
			System.out.println(obj.getClass().getName());
			obj = new Bus();
			System.out.println(obj.getClass().getName());
			
			//객체는 자신의 타입 정보를 가지고 있다. 어떤 클래스의 객체인지... 어떤 메소드를 가지고 있는디, 그 메소드의 리턴 타입은 무엇인지.
			//그 메소드의 매개변수는 어떤 타입을 가지고 있는지.
			//Java reflection
			
			String s1 = new String("Hello?");
			String s2 = new String("Hello?");
			
			if(s1.equals(s2)) {
				System.out.println("Same");
			}else {
				System.out.println("Not Same");
			}
			
			
			
			r.setXY(10, 10);
			t.setXY(10, 10);
			
			Bus b = new Bus();
			
//			if(r.equals(b)) {
//				sSystem.out.println("Same");
//			}else {
//				System.out.println("Not same");
//			}			
//			if(r.equals(t)) {
//				System.out.println("Same");
//			}else {
//				System.out.println("Not same");
//			}
			
//			Object o = new Circle();
//			if(o instanceof Shape) { // is a 관계
//				System.out.println("Shape 의 인스턴스 입니다.");
//			}else {
//				System.out.println("Shape 의 인스턴스가 아닙니다.");
//			}
			
			System.out.println("******");
			System.out.println(r);
			
			
			MyRandom mr = new MyRandom();
			
			int[] values = new int[10];
			for(int i=0; i<values.length; i++)
				values[i]=mr.nextInt(100)+1;
			
			
		}
		public static void executeDraw(Shape[] arr) {
			for(int i=0; i<arr.length; i++) {
				arr[i].draw(); //다형성의 가장 큰 특징.
			}
		}
		
		public static void executeDraw(Shape s) {
			s.draw();
		}
		
//		public static void executeDraw(Circle c) {
//			System.out.println("executeDraw(Circle) called...");
//			c.draw();
//		}
//		public static void executeDraw(Ractangle r) {
//			System.out.println("executeDraw(Ractangle) called...");
//			r.draw();
//		}
//		public static void executeDraw(Triangle t) {
//			System.out.println("executeDraw(Triangle) called...");
//			t.draw();
//		}
}
