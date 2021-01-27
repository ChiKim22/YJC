package CH8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // awt 안에있는 클래스들만 임포트가 됨.

public class Calculator extends JFrame implements ActionListener {

	private JTextField textField;
	private JPanel panel;
	private JButton[] numberButtons;
	private JButton addButton, subButton, mulButton, divButton, decButton, equButton, delButton, clrButton, negButton;
	private Font myFont = new Font(Font.SANS_SERIF, Font.BOLD, 30);
	
	private double num1, num2, result;
	private String operator;
	
	public Calculator() {
		this.setTitle("Calculator");
		this.setSize(420, 550);
		this.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(50, 25, 300, 50);
		textField.setFont(myFont);
		textField.setEditable(false);
		
		panel = new JPanel();
		panel.setBounds(50, 100, 300, 300);
		panel.setLayout(new GridLayout(4, 4, 10, 10));
		
		numberButtons = new JButton[10];
		for(int i = 0; i < numberButtons.length; i++) {
			numberButtons[i] = new JButton(String.valueOf(i)); // String.valueOf(i) => 숫자를 문자열로 변경하는 기능.
			numberButtons[i].setFont(myFont);
			numberButtons[i].setFocusable(false); // 클릭 이펙트 제거.
			numberButtons[i].addActionListener(this);
		}
		
		addButton = new JButton("+");
		addButton.setFocusable(false);
		addButton.setFont(myFont);
		addButton.addActionListener(this);
		
		subButton = new JButton("-");
		subButton.setFocusable(false);
		subButton.setFont(myFont);
		subButton.addActionListener(this);
		
		mulButton = new JButton("*");
		mulButton.setFocusable(false);
		mulButton.setFont(myFont);
		mulButton.addActionListener(this);
		
		divButton = new JButton("/");
		divButton.setFocusable(false);
		divButton.setFont(myFont);
		divButton.addActionListener(this);
		
		decButton = new JButton(".");
		decButton.setFocusable(false);
		decButton.setFont(myFont);
		decButton.addActionListener(this);
		
		equButton = new JButton("=");
		equButton.setFocusable(false);
		equButton.setFont(myFont);
		equButton.addActionListener(this);
		
		delButton = new JButton("Delete");
		delButton.setFocusable(false);
		delButton.setBounds(150, 430, 100, 50);
		delButton.addActionListener(this);
		
		clrButton = new JButton("Clear");
		clrButton.setFocusable(false);
		clrButton.setBounds(250, 430, 100, 50);
		clrButton.addActionListener(this);
		
		negButton = new JButton("(-)");
		negButton.setFocusable(false);
		negButton.setBounds(50, 430, 100, 50);
		negButton.addActionListener(this);
		
		
		panel.add(numberButtons[1]);
		panel.add(numberButtons[2]);
		panel.add(numberButtons[3]);
		panel.add(addButton);
		
		panel.add(numberButtons[4]);
		panel.add(numberButtons[5]);
		panel.add(numberButtons[6]);
		panel.add(subButton);
		
		panel.add(numberButtons[7]);
		panel.add(numberButtons[8]);
		panel.add(numberButtons[9]);
		panel.add(mulButton);
		
		panel.add(decButton);
		panel.add(numberButtons[0]);
		panel.add(equButton);
		panel.add(divButton);
		
		
		this.add(negButton);
		this.add(delButton);
		this.add(clrButton);
		
		this.add(textField);
		this.add(panel);
		
		this.setResizable(false);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null); // frame가 화면 중앙에 가기위해 필요.
		this.setVisible(true);		
	}
	public static void main(String[] args) {
		JFrame frame = new Calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for (int i=0; i < numberButtons.length; i++) {
			if(e.getSource() == numberButtons[i]) {
				System.out.println(i + " Button Clicked");
				
				String str = textField.getText();
				textField.setText(str.concat(String.valueOf(i)));
				
				break;
			}
		}
		if (e.getSource() == decButton) {
			String str = textField.getText();
			textField.setText(str.concat("."));
			System.out.println("decimal Button Clicked");
			
		}else if (e.getSource() == addButton || e.getSource() == subButton ||
					e.getSource() == mulButton || e.getSource() == divButton) {
						System.out.println(((JButton)(e.getSource())).getText() + " Button Clicked");
						String str = textField.getText();
						num1 = Double.parseDouble(str);
						operator = ((JButton)(e.getSource())).getText();
						textField.setText("");
						
		}else if (e.getSource() == equButton) {
			System.out.println("= Button Clicked.");
			String str = textField.getText();
			num2 = Double.parseDouble(str);
			switch(operator) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				result = num1 / num2;
				break;
			default:
			}
			textField.setText(String.valueOf(result));
			
		}else if (e.getSource() == clrButton) {
			textField.setText("");
			System.out.println("Clear Button Clicked");
			
		}else if (e.getSource() == delButton) {
			String str = textField.getText();
			textField.setText(str.substring(0, str.length()-1)); // 마지막 글자 제거.
			System.out.println("Delete Button clicked");
			
		}else if (e.getSource() == negButton){
			String str = textField.getText();
			double temp = Double.parseDouble(str);
			temp = temp*(-1);
			textField.setText(String.valueOf(temp));
			System.out.println("마이너스 전환 Button Clicked");
		}
		
	}
}
