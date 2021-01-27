package CH8;

import java.awt.*;

import javax.swing.*;

public class MyFrame extends JFrame{

	public MyFrame() {
		this.setSize(420, 420);
		this.setTitle("My Frame");
		
		JButton button = new JButton("Button");
		this.add(button);
		
		/*	
		 * 배치관리자
		 * LayoutManager : BorderLayout, FlowLayout, BoxLayout, CardLayout, GroupLayout, GridLayout
		 * JFrame의 경우 : LayoutManager를 명시적으로 지정하지 않으면 기본으로 BorderLayout를 사용한다.
		 */
		
		this.setLayout(new FlowLayout());
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);

	}
		public static void main(String[] args) {
			MyFrame frame = new MyFrame();
		}
	
}
