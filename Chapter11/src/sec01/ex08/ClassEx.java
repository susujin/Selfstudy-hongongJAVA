package sec01.ex08;

public class ClassEx {

	public static void main(String[] args) throws Exception{
		//1
		Class clazz=Car.class;
		
		//2
		//Class clazz=Class.forName("sec01.ex08.Car");
		
		//3
		//Car car=new Car();
		//Class clazz=car.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());

	}

}
