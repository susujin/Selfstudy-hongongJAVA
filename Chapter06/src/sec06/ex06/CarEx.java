package sec06.ex06;

public class CarEx {

	public static void main(String[] args) {
		Car myCar=new Car();
		
		//�߸���
		myCar.setSpeed(-50);
		System.out.println("���� �ӵ� : "+myCar.getSpeed());
		
		//�ùٸ�
		myCar.setSpeed(60);

		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("���� �ӵ� : "+myCar.getSpeed());
	}

}
