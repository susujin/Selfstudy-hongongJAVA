package sec02.ex02;

public class ChildEx {

	public static void main(String[] args) {
		Child child=new Child();
		
		Parent parent=child;
		parent.method1();
		parent.method2();
		//parent.method3(); ȣ��Ұ�
	}

}
