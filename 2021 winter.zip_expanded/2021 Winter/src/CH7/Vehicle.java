package CH7;

public class Vehicle {
	private int speed;
	private String direction;
	
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	public int getSpeed() {
		return speed;
	}
	public void trun(String direction) {
		this.direction = direction;
	}
	public String getDirection() {
		return direction;
	}
}
