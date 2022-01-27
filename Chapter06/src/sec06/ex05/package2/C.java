package sec06.ex05.package2;

import sec06.ex05.package1.A;

public class C {
	public C{
		A a=new A();
		a.field1=1;
		a.field2=1; //default필드 접근 불가
		a.field3=1; //private필드 접근 불가
		
		a.method1();
		a.method2(); //default메소드 접근 불가
		a.method3(); //private메소드 접근 불가
	}
}
