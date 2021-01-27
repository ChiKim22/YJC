package CH6;


public class Box {

	// instance member variable
	private int width;
	private int length;
	private int height;
	private int volume;
	
	private static int count; // 생성된 Box 객체의 수를 유지하는 변수. => 1.
	//static => 3
	
	
	
	
	public Box(){
		
		this(2, 2, 2); //사용자가 아무런 값도 입력하지 않을때, 그 값을 지정.
//		Box(2, 2 ,2); //불가능
		
	}
	
	public static int getCount() {
		// int tmp = wid*leng; => 인스턴스 멤버는 정적 메소드에 접근할 수 없음. 반대로는 가능.
		return count;
	}
	
	public Box(int wid, int leng, int hi) {
		width = wid;
		length = leng;
		height = hi;
		volume = wid*hi*leng;
		count++;
		
	}
	
	
	// instance member method
	public boolean isSameBox(Box box) {
		boolean result = false;
		
		if(this.width == box.width && this.length == box.length && this.height == box.height) {
			result=true;
		}
		
		return result;
	}

	public int getVolume() {
		return volume;
	}
	
	@Override
	public String toString() {
		return "width : "+width+" height : "+height+" length : "+length+" volume : "+volume;
	}
	
}
