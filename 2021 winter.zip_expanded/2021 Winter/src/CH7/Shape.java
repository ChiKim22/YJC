package CH7;

public class Shape {

		private int x,y;
		
		public Shape() {
			System.out.println("Shape 생성자...");
		}
		
		void print() {
			System.out.println("x좌표 : "+x+" y좌표 : "+y);
		}
		
		protected int getX() {
			return x;
		}
		protected int getY() {
			return y;
		}
		
}
