package chapter02;

import java.util.Scanner;

public class Sec04 {

	public static void main(String[] args) {
		//no.1
		String name="���ڹ�";
		int age=25;
		String tel1="010", tel2="123", tel3="4567";
		System.out.println("�̸�: "+ name);
		System.out.print("����: "+ age+ "\n");
		System.out.printf("��ȭ: %1$s-%2$s-%3$s", tel1, tel2, tel3);
		System.out.println();
		
		//no.2
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("ù��° ��: ");
		String strNum1=scanner.nextLine();
		
		System.out.print("�ι�° ��: ");
		String strNum2=scanner.nextLine();
		
		int num1=Integer.parseInt(strNum1);
		int num2=Integer.parseInt(strNum2);
		int result=num1+num2;
		System.out.println("���� ���: "+result);
	}

}
