package Tetris;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;
import javax.swing.event.*;
import java.util.*;


public class Tetris{
		public static final int WIDTH = 445, HEIGHT = 629;
	
		private Board board;
		private Title title;
		private JFrame tetris;
		
		public Tetris() {
			tetris = new JFrame("Tetris");
			tetris.setSize(WIDTH, HEIGHT);
			tetris.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			tetris.setResizable(false);
			tetris.setLocationRelativeTo(null); // 화면을 가운데로 출력.
			
			title = new Title(this);
			board = new Board();
			
			tetris.addKeyListener(board);
			tetris.addKeyListener(title);
			
			tetris.add(title); 
			
			
			tetris.setVisible(true);
		}
		public void gameStart() {
			tetris.remove(title);
			tetris.add(board);
			tetris.revalidate();
			
		}
		
		
		public static void main(String[] args) {
			new Tetris();
		}
}


