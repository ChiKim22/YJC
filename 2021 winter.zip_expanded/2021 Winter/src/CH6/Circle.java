package CH6;

public class Circle {
	private Point center;
	private int radius;
	
	
	{
			radius = 10;
	}
	
	
	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}
	
	public Circle() {
		
	}

	@Override
	public String toString() {
		return "Circle [center=" + center + ", radius=" + radius + "]";
	}
	
}
