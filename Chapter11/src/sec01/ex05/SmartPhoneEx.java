package sec01.ex05;

public class SmartPhoneEx {

	public static void main(String[] args) {
		SmartPhone myPhone=new SmartPhone("구글","안드로이도");
		
		String strObj=myPhone.toString();
		System.out.println(strObj);
		
		System.out.println(myPhone);

	}

}
