package sec01.ex01;

public class IfEx {

	public static void main(String[] args) {
		int score=93;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		
		if(score<90) 
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다."); //괄호로 감싸지 않았기 때문에 if문과는 상관없이 실행됨.
		

	}

}
