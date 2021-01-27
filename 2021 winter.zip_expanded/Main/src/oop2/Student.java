package oop2;

import java.util.Arrays;

public class Student extends Person{
	
	private int sLevel;
	private int[] grades = new int[10];
	private int count=0;
	
	// @Override
	public void print() {
		System.out.println();
	}

	public int getsLevel() {
		return sLevel;
	}

	public void setsLevel(int sLevel) {
		this.sLevel = sLevel;
	}

	public int[] getGrades() {
		return grades;
	}

	public void setGrades(int[] grades) {
		this.grades = grades;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	

}
