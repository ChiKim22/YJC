package Tetris;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;


public class Tetris{
		
	
		private Board board;
		private JFrame tetris;
		
		public Tetris() {
			tetris = new JFrame("Tetris");
			tetris.setSize(445, 629);
			tetris.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			tetris.setResizable(false);
			tetris.setLocationRelativeTo(null); // 화면을 가운데로 출력.
			
			board = new Board();
			tetris.add(board);
			tetris.addKeyListener(board);
			
			
			tetris.setVisible(true);
		}
		
		
		public static void main(String[] args) {
			new Tetris();
		}
}

