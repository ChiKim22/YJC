package CH9;

public class Person {
	private String phone;
	private String addr;
	
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void eat() {
		System.out.println("먹습니다.");
	}
	

}
