package CH9;

public class Main8 {
    public static void main(String[] args){
        Flyable flyable = new FlyingCar();
        flyable.Fly();

        Flyable flyable2 = new Flyable(){

			@Override
			public void Fly() {
				// TODO Auto-generated method stub
				System.out.println("Flyyyyyyyyyy");
			}
        };
        flyable2.Fly();
        Flyable flyable3 = () -> {System.out.println("종이비행기가 날아갑니다.");};
        flyable3.Fly();
    }
}