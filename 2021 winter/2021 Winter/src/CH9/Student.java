package CH9;

import java.rmi.Remote;

public class Student extends Person implements Comparable, RemoteControl{ //다중 상속을 지원하지 않음. 자신의 부모는 오직 하나. / 인터페이스는 가능하다.
	
	private int gpa;
	private String name;
	private int sid;
	
	public Student() {
		
	}

	public Student(int gpa, String name, int sid) {
		this.gpa = gpa;
		this.name = name;
		this.sid = sid;
	}
	public int getGpa() {
		return gpa;
	}
	@Override
	public String toString() {
		return "Student [gpa=" + gpa + ", name=" + name + ", sid=" + sid + "]";
	}
	public void setGpa(int gpa) {
		this.gpa = gpa;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		/*
		 * Object와 값을 비교해서
		 * 내가 가진 값이 더 크면 양수를 리턴
		 * 같으면 0
		 * 작으면 음수를 리턴
		 */
		
		if(o instanceof Student) {
			Student s = (Student)o;
			//return this.gpa - s.gpa;
			
			return s.gpa - this.gpa; // 역순
			
			//return this.name.compareTo(s.name);
			}
		return 0;
	}
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}
}
