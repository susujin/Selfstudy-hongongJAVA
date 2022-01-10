package chapter04;

public class Sec02No03 {

	public static void main(String[] args) {
		while(true) {
			int num1=(int)(Math.random()*6)+1; //주사위1
			int num2=(int)(Math.random()*6)+1; //주사위2
			
			System.out.println("("+num1+", "+num2+")");
			
			if((num1+num2)==5)
				break;
		}

	}

}
