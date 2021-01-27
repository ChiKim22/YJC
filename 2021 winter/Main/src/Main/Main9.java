package Main;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Main9 {
	public static Scanner in =new Scanner(System.in);
	public static void main(String[] args) {
		
		//getMinMax();
		
		
		
		
	}
	private static int getMinMax2(int[] prices) {
		int min = prices[0];
		for (int i=0; i<prices.length; i++) {
			if(prices[i]<min) {
				min=prices[i];
			}
		}
		return min;
	}
	public static void getMinMax() {
		System.out.println("브랜드 갯수 :");
		int size=in.nextInt();
		int[] prices= new int[size];
		
		Random random = new Random();
		for(int i=0; i<prices.length; i++) {
			prices[i]=random.nextInt(100)+100; // 100~199
			
		}
		int min=prices[0];
		int max=prices[0];
		for(int i=0; i<prices.length; i++) {
			if (prices[i]<min) {
				min=prices[i];
			}else {
				max=prices[i];
			}
		}
		System.out.println("최소가격 :" + min+" 만원");
		System.out.println("최대가격 :" + max+" 만원");
		
		//System.out.println(Arrays.toString(prices));
		System.out.println(arrays2String(prices));
		
	}
	public static String arrays2String(int[] arr){
		String s = "[";
		for(int i=0; i<arr.length; i++) {
			s=s+arr[i]+ ", ";
		}
	
			s= s+arr[arr.length-1] + "]";
		return s;
	}
}
