package CH6;

public class Main3 {
	
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		//oc.test();
		
		OuterClass.InnerClass ic = oc.new InnerClass(); //거의 사용할 일이 없음.
		ic.setMyInnerVal(200);
		System.out.println(ic.getMyInnerVal());
		
		
//		OuterClass.InnerClass ic2 = new OuterClass.InnerClass2(); //역시 자주 사용안함.
//		ic2.setMyInnerVal(200);
//		System.out.println(ic2.getMyInnerVal());
		
		//InnerClass ic = new InnerClass(); 
		// OuterClass 안에 있기 때문에 부를 수 없음.
	}
	
}
