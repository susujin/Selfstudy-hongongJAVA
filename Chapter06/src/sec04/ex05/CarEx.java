package sec04.ex05;

public class CarEx {

	public static void main(String[] args) {
		Car myCar=new Car();
		
		myCar.keyTurnOn();
		myCar.run();
		int speed=myCar.getSpeed();
		System.out.println("���� �ӵ� : "+speed+"km/h");

	}

}
