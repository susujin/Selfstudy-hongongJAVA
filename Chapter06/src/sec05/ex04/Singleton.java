package sec05.ex04;

public class Singleton {
	private static Singleton singleton=new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton;
	}
}
