package Tetris;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;


import javax.swing.*;

public class Board extends JPanel implements KeyListener{
	
	private static int FPS = 60; // 게임 초당 프레임.
	private static int delayTime = FPS / 1000; // ms단위.
	
	
	public static final int boardWidth = 10;
	public static final int boardHeight = 20;
	public static final int blockSize = 30;
	
	private Timer looper;
	
	private Color[][] board = new Color[boardWidth][boardHeight];
	
	private Color[][] shape = {
				{Color.red, Color.red, Color.red},
				{null, Color.red, null}
				};
	
	private int x = 4, y = 0;
	
	private int normal = 700;
	private int down = 50;
	private int delayTimeForMovement = normal;
	private long beginTime;
	
	private int deltaX = 0; // 좌우 이동 x 좌표.
	private boolean collision = false;
	
	public Board() {
		
//		looper = new Timer(700, new ActionListener() { //게임 속도 수동지정.(낮을수록 빠름).
		looper = new Timer(delayTime, new ActionListener() { //게임 속도 (delayTime) 난이도 설정가능.
			
			int n = 0; 
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				update();
				repaint();				
				
			}
			
		});
		
		looper.start();
		
	}
	
		private void update() {  // 도형이 바닥에 고정되고 다음 도형을 준비하게 해주는 메소드.
			
			// 바닥에 다 내려간 도형의 진행을 멈추고 다음도형을 부를 수 있게 해줌.
			if(collision) {
				return;
			}
			
			
			//도형이 보드 밖으로 안튀어나가게끔 잡아주는 코드.
			if(!(x + deltaX + shape[0].length > 10) && ! (x + deltaX < 0)) {
				x+= deltaX; 
			}
			deltaX =0;
			
			if(System.currentTimeMillis() - beginTime > delayTimeForMovement) {
				
//				x+= deltaX;  // 여기에 있으면 옆으로 이동이 자연스럽지 못함.
				
				if(!(y + 1 + shape.length > boardHeight)) {
					y++;
				}else {
					collision = true;
				}
				beginTime = System.currentTimeMillis();
				
			}
		}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		g.setColor(Color.BLACK);

		g.fillRect(0, 0, getWidth(), getHeight()); // 배경 검정색.
		
		
		// 도형 생성.
		for(int row = 0; row < shape.length; row++) { 
			for(int col = 0; col < shape[0].length; col++) {
				if(shape[row][col] != null) {
					g.setColor(shape[row][col]);
					g.fillRect(col * blockSize + x * blockSize, row * blockSize + y * blockSize, blockSize, blockSize);
				}
			}
		}
		
		
		// 보드 생성(줄).
		g.setColor(Color.WHITE); 
		for(int row =0; row < boardHeight; row++) { // 가로줄.
			g.drawLine(0, blockSize * row, blockSize * boardWidth, blockSize * row);
		}
		
		for(int col = 0; col < boardWidth + 1; col++) { // 세로줄.
			g.drawLine(col * blockSize, 0, col * blockSize, blockSize * boardHeight);
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
			// 드롭 다운.
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			delayTimeForMovement = down;
			// 좌우 이동.
		}else if (e.getKeyCode() == KeyEvent.VK_RIGHT) { //우
			deltaX +=1;
		}else if (e.getKeyCode() == KeyEvent.VK_LEFT) { //좌
			deltaX -=1;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		//드롭다운 에서 원래 속도로 변경.
		if(e.getKeyCode() == KeyEvent.VK_DOWN)
			delayTimeForMovement = normal;
	}

}
