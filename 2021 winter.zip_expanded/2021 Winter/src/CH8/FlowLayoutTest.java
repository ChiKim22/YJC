package CH8;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutTest extends JFrame{

	public FlowLayoutTest() {
		JButton btn1 = new JButton("Button1");
		JButton btn2 = new JButton("Button2");
		JButton btn3 = new JButton("Button3");
		JButton btn4 = new JButton("Long Named Button");
		JButton btn5 = new JButton("5");
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);
		this.add(btn5);
		
		//frame의 배치관리자는 명시적으로 지정해주지 않으면, BorderLayout
		this.setLayout(new FlowLayout());

//		this.setSize(400, 200);
//		this.setResizable(false); // 크기 조정 불가
		this.pack(); // 사이즈를 지정안해도 자동으로 크기 설정.
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		
		JFrame frame = new FlowLayoutTest(); // 부모타입에는 자식 개체도 실행할 수 있음.
		//FlowLayoutTest frame = new FlowLayoutTest();
		
	}
}
