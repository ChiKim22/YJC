package CH9;

public class MyClass implements MyInterface {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("test called");
		
	}

	@Override
	public int test2() {
		// TODO Auto-generated method stub
		System.out.println("test2 called");
		
		return 0;
	}

	@Override
	public double test3() {
		// TODO Auto-generated method stub
		System.out.println("test3 called");
		
		return 0;
	}
	public static void main(String[] args) {
		Main m = new Main();
		MyClass mc = new MyClass();
		mc.test();
		mc.test2();
		mc.test3();
		
	}

}
