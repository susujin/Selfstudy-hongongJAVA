package sec05.ex04;

public class SingletonEx {

	public static void main(String[] args) {
		//������ ����
		//Singleton obj1=new Singleton(); 
		//Singleton obj2=new Singleton();
		
		Singleton obj1=Singleton.getInstance();
		Singleton obj2=Singleton.getInstance();
		
		if(obj1==obj2) {
			System.out.println("���� Singleton �Դϴ�.");
		}else {
			System.out.println("�ٸ� Singleton �Դϴ�.");
		}
	}

}
