package sec01.ex04;

public class IfDiceEx {

	public static void main(String[] args) {
		int num=(int)(Math.random()*6) +1;
		
		if(num==1) {
			System.out.println("1���� �������ϴ�.");
		} else if(num==2) {
			System.out.println("2���� �������ϴ�.");
		} else if(num==3) {
			System.out.println("3���� �������ϴ�.");
		} else if(num==4) {
			System.out.println("4���� �������ϴ�.");
		} else if(num==5) {
			System.out.println("5���� �������ϴ�.");
		} else {
			System.out.println("6���� �������ϴ�.");
		}

	}

}
