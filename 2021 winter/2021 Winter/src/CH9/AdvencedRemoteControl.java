package CH9;

public interface AdvencedRemoteControl extends RemoteControl{ // 인터페이스가 또 다른 인터페이스로 확장할때는 extends를 사용한다.
	
	void volumeUp();
	void volumeDown();
	@Override
	default void turnOn() {
		// TODO Auto-generated method stub
		
	}
	@Override
	default void turnOff() {
		// TODO Auto-generated method stub
		
	}
	
}
