package ch05.oop;

//import java.util.Arrays;


public class Student extends Person {

	private int[] grades=new int[10];
	private int count=0;
	
	public void addGrade(int jumsu) {
		grades[count++]=jumsu;
	}
	
//	public int[] getGrades() {
//		int[] copy = Arrays.copyOf(grades, count);
//		
//	}
	
	public String getAllGrades() {
		String result = "[";
		for(int i=0; grades[i]>0; i++) {
			result += grades[i] + " ";
		}
		result += "]";
		return result;
	}
	
	void study() {
		slevel++;
		System.out.println(name+" 이(가) 공부합니다.");
	}
	void play() {
		slevel--;
		System.out.println(name+" 이(가) 놉니다.");
	}
	// 멤버 메소드

	public void setGender(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}
	
	//위의 코드들은
	//설계도이기 떄문에 실행되지 않는다.
}