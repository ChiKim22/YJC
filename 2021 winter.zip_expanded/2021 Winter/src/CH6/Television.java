package CH6;

public class Television {

	private int channel;
	private int volume;
	private boolean onOff;
	
	
	public Television() {
		
	}
	public Television(int channel, int vol, boolean isTurnOn) { //아직까지 생성자는 퍼블릭으로.
		this.channel = channel; //생성자와 이름이 같을때
		volume=vol;
		onOff = isTurnOn;
	}
	
	public int getChannel() {
		return channel;
	}


	public void setChannel(int channel) {
		this.channel = channel;
	}


	public int getVolume() {
		return volume;
	}


	public void setVolume(int volume) {
		this.volume = volume;
	}


	public boolean isOnOff() {
		return onOff;
	}


	public void setOnOff(boolean onOff) {
		this.onOff = onOff;
	}


	public static void main(String[] args) {
		Television tv = new Television();
	}
	
	@Override // annotation
	public String toString() { // signature : 메소드의 리턴타입, 메소드명, 메소드의 매개변수들
		return "[channel:" + channel + "[volume:" + volume + "[onOff:"+onOff+"]";
	}
	
	
	
}
