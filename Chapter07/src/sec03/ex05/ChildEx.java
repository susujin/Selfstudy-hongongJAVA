package sec03.ex05;

public class ChildEx {

	public static void main(String[] args) {
		Parent parent=new Child();
		parent.field1="data1";
		parent.method1();
		parent.method2();
		
		
		//불가능
		//parent.field2="data2";
		//parent.method3();

		Child child=(Child)parent; //강제 타입 변환
		child.field2="yyy";
		child.method3();
	}

}
