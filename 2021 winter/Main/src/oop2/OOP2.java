package oop2;

import ch05.oop.Professor;
import ch05.oop.Student;

public class OOP2 {
	
//	private void nameNphoneOnly(Student std) {
//		System.out.println("이름은 "+std.getName()+"이고 전화번호는"+std.getPhone()+"입니다.");
//	}
//	
//	// method overloading
//	private void nameNphoneOnly(Professor prof) {
//		System.out.println("이름은 "+prof.getName()+"이고 전화번호는"+prof.getPhone()+"입니다.");
//	}
	
	private void nameNphoneOnly(Person p) {
		System.out.println("이름은 "+p.getName()+"이고 전화번호는"+p.getPhone()+"입니다.");
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		person.setDept("컴정");
		person.setGender("남자");
		person.setName("아이언맨");
		person.setPhone("010-111-2222");
		person.setSid("2001234");
		
		//person.print();
		
		
		Student std = new Student();
		std.setDept("컴정");
		std.setGender("여자");
		std.setName("스칼렛 요한슨");
		std.setPhone("010-1234-1111");
		std.setSid("2001122");
		std.addGrade(98);
		std.addGrade(97);
		
		//std.print();
		nameNphoneOnly(std);
		
		Professor prof = new Professor();
		prof.setDept("컴정");
		prof.setGender("남자");
		prof.setName("홍길동");
		prof.setLectures(new String[] {"프로그래밍 기초", "웹 프로그래밍(I)"});
		prof.setPhone("010-1111-2312");
		prof.setSid("1012345");
		
		//prof.print();
		nameNphoneOnly(prof);
		
		Person[] parr = new Person[3];
		Student[] stdarr = new Student[3];
		Professor[] profarr = new Professor[3];
		
		stdarr[0]=std;

//		sttarr[1]=[prof]; == X 배열에는 동일한 객체만 담을 수 있음.
		
		
		profarr[0]=prof;
		
		parr[0]=person;
		parr[1]=std;
		parr[2]=prof;
		
		printAll(parr);
		
		
	}
	private static void printAll(Person[] parr) {
		for(int i=0; i<parr.length; i++) {
			System.out.println("Instance of Person? : "+(parr[i] instanceof Person));
			System.out.println("Instance of Student? : "+(parr[i] instanceof Student));
			System.out.println("Instance of Professor? : "+(parr[i] instanceof Professor));
			parr[i].print();
		}
	}
	
}
