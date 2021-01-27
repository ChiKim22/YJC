package Main;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		
		if (x>0) {
			System.out.print("1");
		}else  {
			System.out.print("2");
		//}else (y>0) {
			System.out.print("3");
		//}else {
			System.out.print("4");
		}
	}
}
		


/*
    	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
    	double n =input.nextInt();
    	double m =input.nextInt();
    	int sum =0,max=-1000000;
    	double[] arr = new int[];
    	
    	for(double i=0;i<n;i++) {
    		if(arr[i]>max) {
    			max=arr[i];
    		}
    	}
    	System.out.print(sum);
    	}
    	*/

