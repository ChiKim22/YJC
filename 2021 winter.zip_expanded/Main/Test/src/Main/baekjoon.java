package Main;
import java.util.*;
public class baekjoon {
	public static void main(String[] args) {
		int[] n1= {1,2,3,4,5};
		int[] n2= {10,9,8,7,6};
		
		int[] n3= new int[n1.length];
		
		for(int i=0; i<n1.length; i++) {
			n3[i]=n1[i]+n2[i];
			if(i>0) {
				n3[i]=n3[i-1]+n3[i];
			}
		}
		System.out.println(n3[n3.length-1]);

	}
}

