package CH6;

public class Ractangle {

	private int width;
	private int height;
	
	
	public boolean isSameRactangle(Ractangle ractangle) {
		boolean result = false;
		
		if(this.width == ractangle.width && this.height == ractangle.height) {
			result=true;
		}
		
		return result;
	}
	
	
	
	public Ractangle() {
		this(10, 10);
	}
	
	
	public Ractangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Ractangle [width = " + width + ", height = " + height + "]";
	}
	
	/*
	  	Ractangle r1 = new Ractangle(20, 30);
	  	Ractangle r2 = new Ractangle(); // 이 경우, width, height ==10
	  	
	  	두 객체가 같은 크기인지 검사하는 메소드 구현 : isSame
	  	toString 메소드 override : width:20, length : 30 리턴.
	  	
	  	
	  	
	  	main 메소드에서 두새의 rectangle 객체 생성하고,
	  	같은 크기인지 비교 출력.
	  	두 객체 정보 출력.
	 */
	
}
