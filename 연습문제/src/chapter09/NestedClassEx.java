package chapter09; //9-1-3

public class NestedClassEx {

	public static void main(String[] args) {
		Car myCar=new Car();
		
		Car.Tire tire=myCar.new Tire();
		Car.Engine engine=new Car.Engine();

	}

}
