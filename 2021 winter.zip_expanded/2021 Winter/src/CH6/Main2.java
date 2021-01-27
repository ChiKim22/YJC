package CH6;

public class Main2 {
	
	public static void main(String[] args) {
		
		/*
		Box b1=new Box(10, 10, 20);
		Box b2=new Box(10, 10, 20);
		
		if(b1.isSameBox(b2)) {
			System.out.println("Same");
		}else {
			System.out.println("Not Same");
		}
		*/
		
		/*
		Ractangle r1 = new Ractangle(20,30);
		Ractangle r2 = new Ractangle();
		
		System.out.println("r1 = "+r1.toString());
		System.out.println("r2 = "+r2.toString());
		*/
		
//		
//		Box b1 = new Box();
//		Box b2 = new Box();
//		Box b3 = new Box();
//		
//		
//		//nomal
//		System.out.println("생성된 Box 객체의 수: " + b3.getCount()); // => 1
//		//static
//		System.out.println("생성된 Box 객체의 수: " + Box.getCount()); // => 3
		
		/*
		if(r1.isSameRactangle(r2)) {
			System.out.println("Is Same");
		}else {
			System.out.println("Not Same");
		}
		*/
		
		//Math.add(1, 2); 존재하지 않음.
		
//		int sum = Math.add(1, 2);
//		System.out.println(sum);
//		
//		Math math = new Math(1, 2);
//		System.out.println(math);
		
//		double result = java.lang.Math.pow(2, 10); //2의 10승.
//		System.out.println(result);
		
		
		Employee emp1 = new Employee(10, "gdhong");
		//emp1.setCeo("kim");
		Employee emp2 = new Employee(11,"chsung");
		//emp1.setCeo("kim");
		Employee.setCeo("Kim"); //static 모든 객체에 적용.
		
		System.out.println(emp1);
		System.out.println(emp2);
		
		
		
	}

}
