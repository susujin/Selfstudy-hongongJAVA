package sec02.ex02;

public class AnonymousEx {

	public static void main(String[] args) {
		Anonymous anony=new Anonymous();
		
		anony.field.turnOn();
		
		anony.method1();
		
		anony.method2(
				new RemoteControl() {
					@Override
					public void turnOn() {
						System.out.println("SmartTV�� �մϴ�");
					}
					@Override
					public void turnOff() {
						System.out.println("SmartTV�� ���ϴ�");
					}
				}
		);

	}

}
