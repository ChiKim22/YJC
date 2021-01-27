package Main;

import java.util.*;

public class Main {

	    	public static void main(String[] args) {
	  
	    	Scanner input = new Scanner(System.in);	
	        int index=0;    
			int max = -1000000, min = 1000000;
			int[] arr = new int[9];
			for(int i = 0; i < 9; i++) {
				arr[i]=input.nextInt();
				if (arr[i] > max)max=arr[i];
				if (arr[i] < min)min=arr[i];
					
			}
			System.out.println(max);
	        System.out.println(min);    	
	  }
}

