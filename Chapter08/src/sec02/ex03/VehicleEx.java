package sec02.ex03;

public class VehicleEx {

	public static void main(String[] args) {
		Vehicle vehicle=new Bus();
		
		vehicle.run();
		
		Bus bus=(Bus)vehicle; //���� Ÿ�� ��ȯ
		
		bus.run();
		bus.checkFare();

	}

}
