package sec05.ex05;

public class PersonEx {

	public static void main(String[] args) {
		Person p1=new Person("123456-1234567","È«±æµ¿");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);

		p1.name="È«»ï¿ø";
		//p1.nation="usa";
		//p1.ssn="654321-7654321";
	}

}
