package chapter09; //9-2-2

public class Anonymous2Ex {

	public static void main(String[] args) {
		Anonymous2 anony=new Anonymous2();
		anony.field.run();
		anony.method1();
		anony.method2(
				new Vehicle() {
					@Override
					public void run() {
						System.out.println("트럭이 달립니다");
					}
				}
		);

	}

}
