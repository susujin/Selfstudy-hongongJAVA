package chapter04;

public class Sec02No06 {

	public static void main(String[] args) {
		for(int i=1; i<5; i++) {
			for (int j=4; j>0; j--) {
				if(j>i) {
					System.out.printf(" ");
				}
				else {
					System.out.printf("*");
				}
			}
			System.out.println();
			
		}

	}

}
