package chapter04;

import java.util.Scanner;

public class Sec02No07 {

	public static void main(String[] args) {
		boolean run=true;
		int balance=0;
		Scanner scanner=new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("------------------------------------");
			System.out.printf("선택> ");
			
			int num=Integer.parseInt(scanner.nextLine());
			
			if(num==1) {
				System.out.printf("예금액> ");
				balance+=Integer.parseInt(scanner.nextLine());
			} else if(num==2) {
				System.out.printf("출금액> ");
				balance-=Integer.parseInt(scanner.nextLine());
			} else if(num==3) {
				System.out.printf("잔고> ");
				System.out.println(balance);
			} else if(num==4) {
				run=false;
			} else {
				System.out.printf("잘못 입력된 숫자입니다.");
			}
		}
		
		System.out.println("프로그램 종료");

	}

}
