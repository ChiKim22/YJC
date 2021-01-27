package CH8;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutTest extends JFrame{
	
	public BorderLayoutTest() {
		JButton btn1 = new JButton("Button1");
		JButton btn2 = new JButton("Button2");
		JButton btn3 = new JButton("Button3");
		JButton btn4 = new JButton("Long Named Button");
		JButton btn5 = new JButton("5");
		
		this.add(btn1, BorderLayout.NORTH); // public static final String NORTH="North";
		this.add(btn2, BorderLayout.CENTER);
		this.add(btn3, BorderLayout.WEST);
		this.add(btn4, BorderLayout.SOUTH);
		this.add(btn5, BorderLayout.EAST);
		
		//frame의 배치관리자는 명시적으로 지정해주지 않으면, BorderLayout

//		this.setSize(400, 200);
//		this.setResizable(false); // 크기 조정 불가
		this.pack(); // 사이즈를 지정안해도 자동으로 크기 설정.
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	 public static void main(String[] args) {
		JFrame frame = new BorderLayoutTest();
	}
}
