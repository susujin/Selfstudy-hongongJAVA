package sec02.ex05;

public class ChildEx {

	public static void main(String[] args) {
		Parent parent=new Child();
		parent.field1="data1";
		parent.method1();
		parent.method2();
		
		
		//�Ұ���
		//parent.field2="data2";
		//parent.method3();

		Child child=(Child)parent; //���� Ÿ�� ��ȯ
		child.field2="yyy";
		child.method3();
	}

}
