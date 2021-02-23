package Tetris;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Title extends JPanel implements KeyListener {

	private Tetris tetris;
	private Timer timer;
	
	
	public Title(Tetris tetris){
		timer = new Timer(1000/60, new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				repaint();
			}
			
		});
		timer.start();
		this.tetris = tetris;
		
		
		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.setColor(Color.BLACK);
		
		g.fillRect(0, 0, tetris.WIDTH, tetris.HEIGHT);
		
		g.setFont(new Font("Georgia", Font.BOLD, 15));
		g.setColor(Color.WHITE);
		g.drawString("Tetris", 200, 100);
		
		g.setColor(Color.WHITE);
		g.drawString("\'UP\' to Rotate", 150, 250);
		
		g.setColor(Color.WHITE);
		g.drawString("\'Down\' to DropDown", 150, 300);
		
		g.setColor(Color.WHITE);
		g.drawString("\'Right, Left\' to Move Block", 150, 350);

		
        g.setColor(Color.WHITE);
		g.drawString("Press space to play!", 150, tetris.HEIGHT / 2 + 100);
		
		
	}	

    @Override
    public void keyTyped(KeyEvent e) {
        if(e.getKeyChar() == KeyEvent.VK_SPACE) {
           tetris.gameStart();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}
}