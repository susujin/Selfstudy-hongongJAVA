package sec02.ex03;

public class LongExample {

	public static void main(String[] args) {
		//long은 정수 리터럴이 int타입의 허용범위를 초과할 경우 L을 붙여줘야함.
		long var1=10;
		long var2=20L;
		//long var3=1000000000000;//컴파일 에러
		long var4=1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}
}
