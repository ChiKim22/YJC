package CH6;

import java.util.*;

public class ArrayProc {
	Scanner in = new Scanner(System.in);
	
	public void getValues(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.println("성적을 입력하세요.");
			array[i]=in.nextInt();
		}
	}
	
	public double getAverage(int[] array) {
		double total=0;
		for(int i=0; i<array.length; i++) {
			total += array[i];
		}
		return total/array.length;
	}
	
	public static void main(String[] args) { //static => 객체 생성없이도 호출가능함.
		int[] scores = new int[5];
		
		ArrayProc ap = new ArrayProc();
		
		ap.getValues(scores);
		ap.getAverage(scores);
		
		System.out.println("AVG : "+ap.getAverage(scores));
		
	}
	
}
