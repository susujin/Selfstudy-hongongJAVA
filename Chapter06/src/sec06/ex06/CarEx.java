package sec06.ex06;

public class CarEx {

	public static void main(String[] args) {
		Car myCar=new Car();
		
		//잘못된
		myCar.setSpeed(-50);
		System.out.println("현재 속도 : "+myCar.getSpeed());
		
		//올바른
		myCar.setSpeed(60);

		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("현재 속도 : "+myCar.getSpeed());
	}

}
