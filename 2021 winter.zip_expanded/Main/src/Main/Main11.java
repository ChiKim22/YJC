package Main;

import java.util.*;

/**
 * @author jinhokim
 *
 */
public class Main11 {
	
	
	public static Scanner sc = new Scanner(System.in);
	public static Random rand = new Random();
	
	public static void main(String[] args) {
		
		
		ticTacToe();
		
	}
	
	public static void ticTacToe() {
		
		char[][] board= new char[3][3];	
		
//		board[0][0]=' ';
//		System.out.println("["+board[0][0]+"]");
		
		initialize(board);
		
		boolean isOver=false;
		
		int count=0;
		
		while(true) {
			/*
			 * 1. 현재 보드의 상태를 디스플레이
			 * 2. 좌표를 입력받는다. (row, col) <= 1 1 은 board[0][0]을 의미.
			 * 							   <= 1 2 는 board[0][1]을 의미.
			 * 
			 * 3. 입력받은 좌표의 값이 빈공간인지 체크.
			 * if(board[row-1][col-1] == ' ') { // 빈 공간이면
			 * board[row-1][col-1] = 'x';
			 * }else{ // 빈 공간이 아니면...
			 * 잘못된 위치입니다를 출력...
			 * continue;
			 * }
			 * 
			 * 4. 컴퓨터가 빈 공간에 'O'를 놓는다. 위치 i,j 를 찾는다.
			 * board[i][j]='O';
			 */
			
			//step 1
			display(board);
			if(isOver(board) == true)break;
			
			//step 2
			System.out.println("다음에 놓을 좌표를 입력하세요...(1 1 ~ 3 3)");
			int row =sc.nextInt();
			int col =sc.nextInt();
			
			//step 3
			if(board[row-1][col-1]==' ') { //빈 공간이면
				board[row-1][col-1]='X';
				
				//끝났는지 확인후 끝나면 isOver == true;		
				count++;
			
			
			}else {
				System.out.println("잘못된 위치입니다.");
				continue;
			}
			
			//computerPlay(board);
			
			if(count<=4) {
			computerPlayV2(board);
			}
			if(count>4) {
				System.out.println("Draw!");
				isOver=true;
			}
			//끝났는지 확인하고 끝났으면 isOver == true;
			
			
		}
		
				System.out.println("Game Over!!");
	} 

		public static boolean isOver(char[][] board) {
						
			while(true) {
			if(board[0][0]==board[0][1] && board[0][1]==board[0][2]&& (board[0][0]=='X'|| board[0][0]=='O')) {
				if(board[0][0]=='X') {
					System.out.println("Player Win!!!");
				}else {
					System.out.println("Computer Win...");
				}
				return true;
			}else if(board[1][0]==board[1][1] && board[1][1]==board[1][2] && (board[1][0]=='X'|| board[1][0]=='O')) {
				if(board[1][0]=='X') {
					System.out.println("Player Win!!!");
				}else {
					System.out.println("Computer Win...");
				}
				return true;
			}else if(board[2][0]==board[2][1] && board[2][1]==board[2][2] && (board[2][0]=='X'|| board[2][0]=='O')) {
				if(board[2][0]=='X') {
					System.out.println("Player Win!!!");
				}else {
					System.out.println("Computer Win...");
				}
				return true;
			}else if(board[0][0]==board[1][0] && board[1][0]==board[2][0] && (board[0][0]=='X'|| board[0][0]=='O')) {
				if(board[0][0]=='X') {
					System.out.println("Player Win!!!");
				}else {
					System.out.println("Computer Win...");
				}
				return true;
			}else if(board[0][1]==board[1][1] && board[1][1]==board[2][1] && (board[0][1]=='X'|| board[0][1]=='O')) {
				if(board[0][1]=='X') {
					System.out.println("Player Win!!!");
				}else {
					System.out.println("Computer Win...");
				}
				return true;
			}else if(board[0][2]==board[1][2] && board[1][2]==board[2][2] && (board[0][2]=='X'|| board[0][2]=='O')) {
				if(board[0][2]=='X') {
					System.out.println("Player Win!!!");
				}else {
					System.out.println("Computer Win...");
				}
				return true;
			}else if(board[0][0]==board[1][1] && board[1][1]==board[2][2] && (board[0][0]=='X'|| board[0][0]=='O')) {
				if(board[0][0]=='X') {
					System.out.println("Player Win!!!");
				}else {
					System.out.println("Computer Win...");
				}
				return true;
			}else if(board[0][2]==board[1][1] && board[1][1]==board[2][0] && (board[0][2]=='X'|| board[0][2]=='O')) {
				if(board[0][2]=='X') {
					System.out.println("Player Win!!!");
				}else {
					System.out.println("Computer Win...");
				}
				return true;
			}else {
				return false;
			}
			
		}
	}
	
		public static void computerPlayV2(char[][] board) {
			while(true) {
				//row 값을 1~3의 무작위 값으로 발생시키고
				//col 값을 1~3의 무작위 값으로 발생시킨다.
				
				int row =rand.nextInt(3)+1;
				int col =rand.nextInt(3)+1;
				
				if(board[row-1][col-1]==' ') {
					board[row-1][col-1]='O';
					break;
				}
			}
		}
	
	
		public static void initialize(char[][] board) {
			for(int i=0; i<board.length; i++) {
				for(int j=0; j<board[i].length; j++) {
					board[i][j]=' ';
				}
			}
		}
		
		public static void computerPlay(char[][] board) {
			/*
			 * 일단, 단순하게 구현한다.
			 * => 가장 처음에 발견되는 빈자이레 'O'를 놓는다
			 */
			for(int i=0; i<board.length; i++) { // 각행
				// 각 행을 반복할 때마다 그 행에서 빈공간이 발견되어 'O' 를 놓았는지
				// 체크하기 위한 변수 found 를 false 로 초기화하자
				// 혹시나 발견되면 found 를 true 로 변경하자.
				
				boolean found = false;
				
				for(int j=0; j<board[i].length; j++) { // 각열
					if(board[i][j]==' ') {// i행, j열이 빈 공간이면 'O' 를 놓는다.
						board[i][j]='O';
						found =true;
						break;
					}
				}
				// i행의 특정 열에 'O'를 놓았으면 break;
				if(found) break;
			}
		}
		public static void display(char[][] board) {
		 	for(int i=0; i<board.length; i++) { //각 행에 대해서
		 		for(int j=0; j<board[i].length; j++) { // 각 열에 대해서
		 			if(j<board[i].length-1) //마지막 열 바로전까지는 아래처럼 찍고
		 				System.out.print(board[i][j]+" | "); // i번째 행에 j번째 열 값을 출력.
		 			else //마지막 열이면 아래처럼 찍고
		 				System.out.print(board[i][j]);
		 			
		 	}
		 		System.out.println();
		 		System.out.println("__|___|___");
		}
			
			
	}
		
}
	
