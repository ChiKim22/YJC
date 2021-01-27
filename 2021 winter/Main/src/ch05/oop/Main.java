package ch05.oop;

public class Main {
	
	public static void main(String[] args) {
		
	
	Student std1 = new Student();
	std1.age=19;
//	std1.dept="컴정";
	std1.setDept("컴정");
	std1.gender="남";
	std1.name="홍길동";
	std1.setSid("1234567");
//	std1.slevel=0;
	std1.study();
	std1.study();
	std1.study();
//	std1.slevel=100;
//	System.out.println(std1.name+"의 학습레벨은 "+std1.slevel);
	int level=std1.getslevel();
	System.out.println(std1.name+"의 학습레벨은 "+level);
	System.out.println(std1.name+"의 소속은 "+std1.getDept());
	System.out.println(std1.name+"의 학번은 "+std1.getSid());
	
	
	Student std2 = new Student();
	std2.age=18;
//	std2.dept="컴정";
	std2.setDept("사회복지");
	std2.gender="여";
	std2.name="일지매";
	std2.setSid("1234578");
//	std2.slevel=0;
	std2.study();
//	System.out.println(std2.name+"의 학습레벨은 "+std2.slevel);
	level=std2.getslevel();
	System.out.println(std2.name+"의 학습레벨은 "+level);
	System.out.println(std2.name+"의 소속은 "+std2.getDept());
	System.out.println(std2.name+"의 학번은 "+std2.getSid());
	
	
	Professor pf1 = new Professor();
	pf1.name="박문수";
	pf1.setDept("컴정");
	pf1.lecture();
	System.out.println(pf1.name+"교수의 소속은 "+pf1.getDept());
	
	
	Professor pf2 = new Professor();
	pf1.name="이몽룡";
	pf1.setDept("컴퓨터정보");
	pf1.lecture();
	System.out.println(pf2.name+"교수의 소속은 "+pf2.getDept());
	
	
	}
}
