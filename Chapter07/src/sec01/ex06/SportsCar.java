package sec01.ex06;

public class SportsCar extends Car{
	@Override
	public void speedUp() {speed+=10;}
	
	@Override
	public void stop() {
		System.out.println("������ī�� ����");
		speed=0;
		//������ �Ұ�
	}
}
