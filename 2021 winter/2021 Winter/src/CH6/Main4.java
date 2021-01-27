package CH6;

public class Main4 {
	
	private static Animal animal;
	
	public static void main(String[] args) {
//		Dog dog = new Dog();
//		dog.speak();
		
		
		animal = new Animal() {
			
			@Override
			public void speak() {
				System.out.println("야옹");
			}
		};
		
		animal.speak();
		
		
		test();
	}
	
	public static void test() { // 반환값이 없으면 void 
		System.out.println("test");
		animal.speak();
	}
	
}
