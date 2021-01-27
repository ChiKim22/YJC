package Main;
 import java.util.*;
public class Test4 {
	/*
	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();    
        int b = input.nextInt();
        int sum4 = a*b;
        int sum1 = a*(b%10);b=b/10;
        int sum2 = a*(b%10);b=b/10;
        int sum3 = a*b;
        
        System.out.print(sum1 + "\n" + sum2 + "\n" + sum3 + "\n"+ sum4 );
	}
	
	*/
	
	/*
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		
		if (a % 4 == 0 && a % 100!=0) {
			System.out.print("1");
		}else {
			System.out.print("0");
		}
	}
	
	*/
	
	/*
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		
		if ( -1000 <= x || x <= 1000 || x != 0) {
			if (-1000 <= y || y <= 1000 || y != 0) {
				System.out.print("1");
			}
		}else if ()
	}
	*/
	
	/*
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		

		int n = input.nextInt();
		int max = -1000000;
		int min = 1000000;

		int[] num  = new int[n];
		
		for(int i=0; i<n;i++ ) {
			num[i]=input.nextInt();
			if (num[i] < min) {
				min = num[i];
			}if (num[i] > max) {
				max = num[i];
			}
		}
		System.out.println(max + " " + min);	
		
	}
	*/
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] arr = new int[9];
		int max = 0;
		int index = 0;

		for(int i = 0; i < 9; i++) {
			if (arr[i] > max) {
				arr[i]= scan.nextInt();
				max=arr[i];
				index= i+1;
			}	
		}
		System.out.println(max);
		System.out.println(index);
		scan.close();
	}

	
}