package CH9;

public class Main6 {
	public static void main(String[] args) {
		RemoteControl tv = new Television();
		tv.turnOn();
		
		RemoteControl dvd = new RemoteControl() {

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("DVD On...");
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("DVD Off...");
			}
			
		};
		dvd.turnOff();
		dvd.turnOn();
		
		Student graduateStudent = new Student() { //무명클래스 gui, android
//			public void getInfo() {
//				System.out.println("I'm graduate student");
			@Override
			public String getName() {
			return super.getName()+ "입니다.";
			}
		};
		
		graduateStudent.setName("kim");
		System.out.println(graduateStudent.getName());
		
		
	}
}
