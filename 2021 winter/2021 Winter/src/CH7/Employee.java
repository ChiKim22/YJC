package CH7;

public class Employee {
	public String name; //어디서나 접근 가능
	String address; // 같은 package 내에서 접근 가능
	protected int salary; // 같은 package 뿐만 아니라, 자식 클래스에서도 접근 가능.
	private int rrn; // 클래스 내에서만 접근가능.
	
	public Employee(String name, String address, int salary, int rrn) {
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.rrn = rrn;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
	}
	
	
	

}
