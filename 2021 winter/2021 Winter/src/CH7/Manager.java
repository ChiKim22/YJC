package CH7;

public class Manager extends Employee {
	private int bouns;
	
	public Manager() {
		this("홍길동", "대구", 200, -1, 0);
	}

	public Manager(String name, String address, int salary, int rrn, int bouns) {
		super(name, address, salary, rrn); // 부모 클래스의 생성자를 호출.
		this.bouns = bouns;
		
	}
	
	void test() {
		System.out.println("name = "+name);
		System.out.println("address = "+address);
		System.out.println("salary = "+salary);
//		System.out.println("rrn = "+rrn);
	}
	
	

}
