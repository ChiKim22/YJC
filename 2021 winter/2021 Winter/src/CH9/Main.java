package CH9;

public class Main {

	
	/*
	 * interface :
	 * 	 		  abstract class 와 유사하다.
	 * 			  => abstract class 는 인스턴스를 만들 수 없다.
	 * 			  => abstract 메소드를 가진다. 모든 메소드가 기본적으로 public abstract
	 */
		
	//3rd party
	
	public void test() {
		System.out.println("Hello ");
	}
	
	public void test2() {
		
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		
		Television tv1 = new Television();
		tv1.turnOn();
		tv1.turnOff();
		
		Test1 t1 = new Test1();
		t1.test1();
	}
	
}
