package CH6;

public class OuterClass {
	
	private int val;
	public void test() {
		System.out.println("test....");
		
		class Localclass { // 사용할 일이 거의 없음.
			public int myLocalVal;
		}
		
		Localclass lc = new Localclass();
		
		test2();
	}
	
	public void test2() {
		System.out.println("test2....");
		

	}	
	
	public class InnerClass {
			private int myInnerVal;
			
			public void setMyInnerVal(int val) {
				myInnerVal = val;
			}
			public int getMyInnerVal() {
				return myInnerVal;
			}
		}
	
	public class InnerClass2 {
		private int myInnerVal;
		
		public void setMyInnerVal(int val) {
			myInnerVal = val;
		}
		public int getMyInnerVal() {
			return myInnerVal;
		}
	}
	
	//p.292 ,272
	
	/*
	 * 	Inner class : 
	 * 				 1. member 로 선언되는 member class
	 * 					instance member class
	 * 					static member class
	 * 				 2. 무명 클래스(Anonymous class) <= 이게 많이 사용됨. GUI 프로그램, Android 등에서.
	 * 				 3. 지역 클래스(local class)
	 */
	
}
