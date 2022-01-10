package sec01.ex08;

public class SwtichStringEx {

	public static void main(String[] args) {
		String position="과장";
		
		switch(position){
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
				
		}

	}

}
