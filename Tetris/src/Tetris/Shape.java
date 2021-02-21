ppackage Tetris;

import java.awt.*;
import static Tetris.Board.*;


public class Shape {

private int x = 4, y = 0;
	
	private int normal = 700;
	private int down = 50;
	private int delayTimeForMovement = normal;
	private long beginTime;
	
	private int deltaX = 0; // 좌우 이동 x 좌표.
	private boolean collision = false;
	
	private int[][] block;
	private Board board;
	private Color color;
	
	public Shape(int[][] block, Board board, Color color) {
		this.block = block;
		this.board = board;
		this.color = color;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void reset() {
		this.x = 4;
		this.y = 0;
		collision = false;
	}
	
	public void update() {  // 도형이 바닥에 고정되고 다음 도형을 준비하게 해주는 메소드.
		
		// 바닥에 다 내려간 도형의 진행을 멈추고 다음도형을 부를 수 있게 해줌.
		if(collision) {
			
			// 보드에 색상 부여.
			for(int row = 0; row < block.length; row++) {
				for(int col = 0; col < block[0].length; col++) {
					if(block[row][col] != 0) {
						board.getBoard()[y + row][x + col] = color;
					}
				}
			}
			// 다음 도형 생성.
			board.setCurrentShape();
			return;
		}
		
		
		boolean moveX = true;
		//도형이 보드 밖으로 안튀어나가게끔 잡아주는 코드.
		if(!(x + deltaX + block[0].length > 10) && ! (x + deltaX < 0)) {
			
			// 다음에 나오는 도형의 모양을 변경해주는 로직.
			for(int row = 0; row < block.length; row++) {
				for(int col = 0; col < block[row].length; col++) {
					if(block[row][col] != 0) {
						if(board.getBoard()[y + row][x + deltaX + col] != null){
							moveX = false;
						}
					}	
				}
			}
			if(moveX) {
				x+= deltaX; 
			}
		}
		deltaX =0;
		
		if(System.currentTimeMillis() - beginTime > delayTimeForMovement) {			
//			x+= deltaX;  // 여기에 있으면 옆으로 이동이 자연스럽지 못함.
			
			// 도형을 겹치지 않게 해줌. 
			
			if(!(y + 1 + block.length > boardHeight)) {
				for(int row = 0; row < block.length; row++) {
					for(int col = 0; col < block.length; col++) {
						if(block[row][col] != 0) {
							if(board.getBoard()[y + 1 + row][x + deltaX + col] != null) {
								collision = true;
							}
						}
					}
				}
				if(!collision)
				y++;
			}else {
				collision = true;
			}
			beginTime = System.currentTimeMillis();
			
		}
	}
	
	public void render(Graphics g) {
		// 도형 생성.
		for(int row = 0; row < block.length; row++) { 
			for(int col = 0; col < block[0].length; col++) {
				if(block[row][col] != 0) {
					g.setColor(color);
					g.fillRect(col * blockSize + x * blockSize, row * blockSize + y * blockSize, blockSize, blockSize);
				}
			}
		}
		
	}
	public void dropDown() {
		delayTimeForMovement = down;
	}
	
	public void backNormalSPD() {
		delayTimeForMovement = normal;
	}
	
	public void moveLeft() {
		deltaX = -1;
	}
	
	public void moveRight() {
		deltaX = 1;
	}
}
