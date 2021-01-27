package ch05.oop;

import java.util.Arrays;

public class Person {
	String name;
	int age;
	String gender;
	private String dept;
	private String sid; //추상화
	
 int slevel=0;  //Access Modifie 접근 제어자
	
	 String[] dpts= {"컴정", "컴기", "전기", "디자인", "유야", "관광", "사복"};
	
	 public String getSid() {
		 return sid;
	 }
	 
	 public void setSid(String sid) {
		 if(sid.length() !=7) {
			 System.out.println("학번은 7자리이어야 합니다.");
			 return;
		 }
		 if(isNumeric(sid)==true) {
			 this.sid=sid;
		 }else {
			 System.out.println("학번은 숫자로만 구성되어야 합니다.");
		 }
	 }
	 
	private boolean isNumeric(String sid) {
		for(int i=0; i<sid.length();i++) {
			char c=sid.charAt(i);
			if(c<'0'||c>'9') {
				return false;
			}
		}
		return true;
	}
	 
	 
	String getDept() {
		return dept;
	}
	
	void setDept(String dept) {
		int i=0;
		for(; i<dpts.length; i++) {
			if(dept.equals(dpts[i]))break;
		}
		if(i == dpts.length) {
			System.out.println("소속학과는 "+Arrays.toString(dpts)+" 중에 하나이어야 합니다.");
		}else {
			this.dept=dept;
		}
	}
	
	int getslevel() {
		return slevel;
	}
	

	
}
