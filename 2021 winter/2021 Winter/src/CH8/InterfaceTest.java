package CH8;

public class InterfaceTest implements MyInterface {

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		InterfaceTest it = new InterfaceTest();
		MyInterface it2 = new InterfaceTest(); // 객체와 객체간의 임플리먼트를 위해서 사용, 협업을 할때 사용.
	}

}
