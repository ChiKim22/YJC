package CH9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.Timer;

public class Main4 implements ActionListener {
	private int minute=0;
	
	public static void main(String[] args) {
		Main4 listener = new Main4();
		Timer timer = new Timer(1000, listener);
		timer.start();
		//getUserInput();
		
		for(int i=0; i<30; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				System.out.println("Excption가 발생했습니다.");
			}
		}
		
		System.out.println("메인 종료합니다...");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Elapsed : "+ ++minute);
		
	}
	
	public static void getUserInput() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
	}
}
