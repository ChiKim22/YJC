package Tetris;

import java.awt.*;
import static Tetris.Board.*;


public class Shape {

private int x = 4, y = 0;
	
	private int normal = 700, down = 50;
	private int delayTimeForMovement;
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
		delayTimeForMovement = normal;
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
		delayTimeForMovement = normal;
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
			checkLine();
			// 다음 도형 생성.
			board.setCurrentShape();
			
			//점수.
			board.addScore();
			
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
					for(int col = 0; col < block[row].length; col++) {
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
	
	private void checkLine() { // 줄 꽉 차면 지우기.
		int bottomLine = board.getBoard().length - 1;
		for(int topLine = board.getBoard().length - 1; topLine > 0; topLine--) { // topLine
			int count = 0;
			for(int col = 0; col < board.getBoard()[0].length; col++) {
				if(board.getBoard()[topLine][col] != null) {
				count++;
			}
			board.getBoard()[bottomLine][col] = board.getBoard()[topLine][col];
			}
			if(count < board.getBoard()[0].length) {
				bottomLine--; // 맨 아랫줄 제거.
			}
		}
	}
	
	
	// 도형 돌리기.
	public void rotateShape() {
		int[][] rotatedShape = transposeMatrix(block);
		reverseRows(rotatedShape);
		
		// 도형을 벽에서 돌릴떄 벽이나 바닥에 끼는 현상 완화.
		if((x + rotatedShape[0].length > Board.boardWidth) || (y + rotatedShape.length > 20)) {
			return;
		}
		
		// 도형과 도형사이에서 회전할 떄 끼는 현상 완화.
		for(int row = 0; row < rotatedShape.length; row++) {
			for(int col = 0; col < rotatedShape[row].length; col++) {
				if(rotatedShape[row][col] != 0) {
					if(board.getBoard()[y + row][x + col] != null) {
						return;
					}
				}
			}
		}
		
		block = rotatedShape;
 	}
	
	private int[][] transposeMatrix(int[][] matrix) {
		int[][] temp = new int[matrix[0].length][matrix.length];
		
		for(int row = 0; row < matrix[0].length; row++) {
			for(int col = 0; col < matrix.length; col++) {
				temp[row][col] = matrix[col][row]; 
			}
		}
		return temp;
	}
	
	private void reverseRows(int[][] matrix) {
		int middle = matrix.length / 2;
		for(int row = 0; row < middle; row++) {
			int[] temp = matrix[row];
			matrix[row] = matrix[matrix.length - row - 1];
			matrix[matrix.length - row - 1] = temp;
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
	public int[][] getBlock() {
		return block;
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
	public int getY() {
		return y;
	}
	public int getX() {
		return x;
	}
	
}

