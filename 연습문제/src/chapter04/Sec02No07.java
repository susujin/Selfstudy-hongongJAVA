package chapter04;

import java.util.Scanner;

public class Sec02No07 {

	public static void main(String[] args) {
		boolean run=true;
		int balance=0;
		Scanner scanner=new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ����");
			System.out.println("------------------------------------");
			System.out.printf("����> ");
			
			int num=Integer.parseInt(scanner.nextLine());
			
			if(num==1) {
				System.out.printf("���ݾ�> ");
				balance+=Integer.parseInt(scanner.nextLine());
			} else if(num==2) {
				System.out.printf("��ݾ�> ");
				balance-=Integer.parseInt(scanner.nextLine());
			} else if(num==3) {
				System.out.printf("�ܰ�> ");
				System.out.println(balance);
			} else if(num==4) {
				run=false;
			} else {
				System.out.printf("�߸� �Էµ� �����Դϴ�.");
			}
		}
		
		System.out.println("���α׷� ����");

	}

}
