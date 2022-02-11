package sec02.ex03;

public class VehicleEx {

	public static void main(String[] args) {
		Vehicle vehicle=new Bus();
		
		vehicle.run();
		
		Bus bus=(Bus)vehicle; //강제 타입 변환
		
		bus.run();
		bus.checkFare();

	}

}
