package sec02;

public class ThrowsEx {

	public static void main(String[] args) {
		try {
			findClass();
		}catch(ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�");
		}

	}
	
	public static void findClass()throws ClassNotFoundException{
		Class clazz=Class.forName("java.lang.String2");
	}

}