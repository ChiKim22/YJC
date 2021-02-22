package Tetris;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class Board extends JPanel implements KeyListener, MouseListener, MouseMotionListener{
	
	//게임 상태
	public static int stateGamePlay = 0;
	public static int stateGamePause = 1;
	public static int stateGameOver = 2;
	
	private int state = stateGamePlay;
	
	private static int FPS = 60; // 게임 초당 프레임.
	private static int delayTime = FPS / 1000; // ms단위.
	
	
	public static final int boardWidth = 10;
	public static final int boardHeight = 20;
	public static final int blockSize = 30;
	
	private Timer looper;
	
	private Color[][] board = new Color[boardHeight][boardWidth];
	
	private Random random;
	
	
	// 도형 색상.
	private Color[] colors = {Color.decode("#FF5675"), Color.decode("#3DFF92"), Color.decode("#FFEB5A"), 
								Color.decode("#B2FA5C"), Color.decode("#00D7FF"), Color.decode("#FFA98F"), Color.decode("#00FFFF")};
	
	private Shape[] shapes = new Shape[7];
	private Shape currentShape, nextShape;
	
	private int score = 0;
	
	
	public Board() {
		
		// 랜덤 도형 생성.
		random = new Random();
		//도형 생성.
		
		shapes[0] = new Shape(new int[][] { // I 모양
			{1, 1, 1, 1}
		}, this, colors[0]);
		
		shapes[1] = new Shape(new int[][] { // T 모양
			{1, 1, 1},
			{0, 1, 0}
		}, this, colors[1]);
		
		shapes[2] = new Shape(new int[][] { // L 모양
			{1, 1, 1},
			{1, 0, 0}
		}, this, colors[2]);
		
		shapes[3] = new Shape(new int[][] { // J 모양
			{1, 1, 1},
			{0, 0, 1}
		}, this, colors[3]);
		
		shapes[4] = new Shape(new int[][] { // S 모양
			{0, 1, 1},
			{1, 1, 0}
		}, this, colors[4]);
		
		shapes[5] = new Shape(new int[][] { // Z 모양
			{1, 1, 0},
			{0, 1, 1}
		}, this, colors[5]);
		shapes[6] = new Shape(new int[][] { // ㅁ 모양
			{1, 1},
			{1, 1}
		}, this, colors[6]);
		
		currentShape = shapes[0];
		
		
		
//		looper = new Timer(700, new ActionListener() { //게임 속도 수동지정.(낮을수록 빠름).
		looper = new Timer(delayTime, new ActionListener() { //게임 속도 (delayTime) 난이도 설정가능.
			
//			int n = 0; 
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				update();
				repaint();				
				
			}
			
		});
		
//		looper.start();
		
	}
	
	public void gameStart() {
        gameStop();
        setNextShape();
        setCurrentShape();
        state = stateGamePause;
		looper.start();
	}
	
    public void gameStop() {
        score = 0;

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = null;
            }
        }
        looper.stop();
    }
	
	private void update() {
		if(state == stateGamePlay) {
			currentShape.update();
		}
	}
	
	public Color[][] getBoard(){
		return board;
	}
	
	public void setCurrentShape() {
		currentShape = shapes[random.nextInt(shapes.length)];
		currentShape.reset();
		checkGameOver();
		}
	
	private void checkGameOver() { // 게임오버 체크
		int[][] blocks = currentShape.getBlock();
		for(int row = 0; row < blocks.length; row++) {
			for(int col = 0; col < blocks[0].length; col++) {
				if(blocks[row][col] != 0) {
					if(board[row + currentShape.getY()][col + currentShape.getX()] != null) {
						state = stateGameOver; // 게임오버
						System.out.println("Game Over...");
					}
				}
			}
		}
	}
	

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
//		g.setColor(Color.decode("#DDDDDD")); // 배경색.
		g.setColor(Color.black); // 배경색.

		g.fillRect(0, 0, getWidth(), getHeight());
		currentShape.render(g); // shape 클래스에서 도형 가져옴.
		
		g.setColor(Color.decode("#B2FA5C"));
		g.drawString("SCORE", 350, 30);
		
		
		for(int row = 0; row < board.length; row++) { 
			for(int col = 0; col < board[row].length; col++) {
				if(board[row][col] != null) {
					g.setColor(board[row][col]);
					g.fillRect(col * blockSize, row * blockSize, blockSize, blockSize);
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
		
		if(state == stateGameOver) {
		g.setColor(Color.decode("#FF5675"));
		g.drawString("Game Over...", 330, 200);
		
		g.setColor(Color.white);
		g.drawString("Press Space to restart...", 150, 500);
		}
		
		if(state == stateGamePlay) {
			g.setColor(Color.white);
			g.drawString("Press Space to pause", 150, 500);
		}else if(state == stateGamePause) {
			g.setColor(Color.decode("#00D7FF"));
			g.drawString("Press Space to resume", 150, 500);
		}
		 
	}
    public void setNextShape() {
        int index = random.nextInt(shapes.length);
        int colorIndex = random.nextInt(colors.length);
        nextShape = new Shape(shapes[index].getBlock(), this, colors[colorIndex]);
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
			currentShape.dropDown(); // 하강속도 증가.
			// 좌우 이동.
		}else if (e.getKeyCode() == KeyEvent.VK_LEFT) { //좌로 이동
			currentShape.moveLeft();
		}else if (e.getKeyCode() == KeyEvent.VK_RIGHT) { //우로 이동
			currentShape.moveRight();
		}else if (e.getKeyCode() == KeyEvent.VK_UP) { //블록 회전
			currentShape.rotateShape();
		}
		
		
		//보드 초기화.
		if(state == stateGameOver) {
			if(e.getKeyCode() == KeyEvent.VK_SPACE) {
				for(int row = 0; row < board.length; row++) { 
					for(int col = 0; col < board[row].length; col++) {
						board[row][col] = null;
						
					}
				}
				setCurrentShape();
				state = stateGamePlay;
			}
		}
		//일시정지.
		if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			if(state == stateGamePlay) {
				state = stateGamePause;
			}else if(state == stateGamePause) {
				state = stateGamePlay;
			}
			
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		//드롭다운 에서 원래 속도로 변경.
		if(e.getKeyCode() == KeyEvent.VK_DOWN)
			currentShape.backNormalSPD(); // 원래 하강속도로 복귀.
	}

	class GameLooper implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            update();
            repaint();
        }

    }

    public void addScore() {
        score++;
    }

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


}
