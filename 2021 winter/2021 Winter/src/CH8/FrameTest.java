package CH8;

import javax.swing.*;

public class FrameTest {
	// Java Swing에서 대표적인 container(다른 컴포넌트를 포함할 수 있는 컴포넌트다)는 3개 있다.
	// JFrame, JPanel, jApplet - applet 는 보안상의 이유로 잘 사용하지 않음.
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		frame.setSize(300, 200);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫을때 명령창.
		
		
		frame.setVisible(true); // 이걸 해줘야지만 표시가 된다.
		
	} // GUI 는 기본적으로 멀티스레드 프로그램이라 바로 끝나지 않음.

}
