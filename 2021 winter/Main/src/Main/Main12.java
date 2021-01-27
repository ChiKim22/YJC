package Main;

import java.util.*;

public class Main12 {
	
	public static Scanner sc = new Scanner(System.in);
	public static Random rand = new Random();

	public static void main(String[] args) {
		
		
		//mineSweeper();
		//randomWalk();
		//marathone();
		
		
		
		//{1,2,2,1,3,4,4,3,4}==같은거 제거한뒤 =>총 8개 없어졌습니다. 출력
	}
	public static void marathone() {
		
		
		
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		/*
		 *  partcipant의 각 원소에 대해서
		 *  Completion 의 모든 원소와 각각 비교해본다.
		 *  다 비교했는데도 자기이름이 없으면 그 놈이 완주못한놈이다.
		 *  비교하다가 자기이름이 발견되면 .. break
		 */
		
		
		
		int idx=-1;
		
	for(int i=0; i<participant.length; i++) {
		boolean found= false;
		for(int j=0; j<completion.length; j++) {
			if (participant[i].equals(completion[j])) {
				completion[j]=" "; // 동명이인
				found =true;
				break;
			}
		}
		if(found==false) {
			idx=i;
			break;
		}
		String answer=participant[idx];
		System.out.println(answer);
	}
	
		
	}
	
	public static void randomWalk() {
		boolean[][] tiles =new boolean[10][10];
		
		tiles[5][5]=true;
		
		int steps=10, row=5, col=5;
		
		for (int i=0; i<steps; i++) {
			/*
			 *  1. 무작위로 0~3 사이의 값을 발생시키고
			 *  2. 그 값이 0이면 위로, 1이면 오른쪽, 2면 아래, 3이면 왼쪽으로 움직이자.
			 *  위로 이동  row--
			 *  오른쪽 이동 col++
			 *  아래로 이동 row++
			 *  왼쪽 이동  col--
			 *  tiles[row][col]=true;
			 *  현재 tiles의 사태를 출력.
			 */
			
			//step 1
			int direction = (int)(Math.random()*4);
			
			if (direction ==0) { // Up
				if(row-1>=0) row--;
			}else if(direction ==1) { // Right
				if(col+1 <tiles.length)col++;
			}else if(direction ==2) { // Down
				if(row+1<tiles.length)row++;
			}else { // Left
				if(col-1>=0)col--;
			}
			
			//if(tiles[row][col]==true)continue;
			tiles[row][col]=true;
			
			//step 3
			for (int k=0; k<tiles.length; k++ ) {
			for(int j=0; j<tiles[k].length; j++) {
				if(tiles[k][j]==true) {
					System.out.print(" # ");
				}else {
					System.out.print(" . ");
				}
			}
			System.out.println();
		}
			System.out.println("\n\n");
		}
		
		
	}
	
	public static void mineSweeper() {
		
		boolean[][] board = new boolean[10][10];
		
//		for (int i=0; i<board.length; i++) {
//			System.out.println(Arrays.toString(board[i]));
//		}
		
		
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[i].length; j++) {
				double v = Math.random();
				if(v<0.3) {
					board[i][j]=true;
				}
			}
		}
		for(int i=0; i< board.length; i++) {
			for(int j=0; j<board[i].length; j++) {
				if(board[i][j]==true) {
					System.out.print(" # ");
				}else {
					System.out.print(" . ");
				}
			}
			System.out.println();
		}
		
	}
}
