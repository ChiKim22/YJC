package oop2;

import java.util.Arrays;

public class Professor extends Person {
	private String[] lectures=new String[5];
	
	
	private String lectures25tr() {
		String result = "[";
		if(lectures[0] != null)
				result += lectures[0];
		for (int i=0; i<lectures.length; i++) {
			if(lectures[i] !=null)
				result += (", " +lectures[i]);
		}
		result +="]";
		return result;
	}

	public String[] getLectures() {
		return Arrays.copyOf(lectures, lectures.length);
	}

	public void setLectures(String[] lectures) {
		for(int i=0; i<lectures.length; i++) {
			
		}
	}
	

}
