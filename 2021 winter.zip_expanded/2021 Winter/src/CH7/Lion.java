package CH7;

public class Lion extends Animal{

	private int leags=4;
	
	public int getLeags() {
		return leags;
	}

	public void setLeags(int leags) {
		this.leags = leags;
	}

	void roar() {
		System.out.println("roar() Called");
	}
	
}
