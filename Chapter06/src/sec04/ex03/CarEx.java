package sec04.ex03;

public class CarEx {

	public static void main(String[] args) {
		Car myCar=new Car();
		
		myCar.setGas(5);
		
		boolean gasState=myCar.isLeftGas();
		if(gasState) {
			System.out.println("출밥합니다.");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas를 추입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입하세요.");
		}

	}

}
