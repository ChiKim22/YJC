package CH7;

public class Ractangle extends Shape {

	private int width, height;
	
	public Ractangle() {
		System.out.println("Ractangle 생성자...");
	}
	
	int area() {
		return width*height;
	}
	
	void draw() {
		System.out.println("( "+ getX() +", "+ getY() +" ) 위치에 가로 : " + width + " 세로 : "+height); // 부모가 private면 엑세스가 안된다.
	}
	
}
