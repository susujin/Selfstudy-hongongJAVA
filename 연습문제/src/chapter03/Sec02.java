package chapter03;

import java.util.Scanner;

public class Sec02 {

	public static void main(String[] args) {
		//no.4
		int pencils=534;
		int students=30;
		
		int pencilsPerStudent=(pencils/students);
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft=(pencils%students);
		System.out.println(pencilsLeft);
		System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = ");
		
		//no.6
		int value=356;
		System.out.println(value/100*100);
		System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = ");
		
		//no.8
		int lengthTop=5;
		int lengthBottom=10;
		int height=7;
		double area=((lengthTop+lengthBottom)*height/2.0);
		System.out.println(area);
		System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = ");
		
		//no.9
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("ù ��° ��: ");
		String num1=scanner.nextLine();
		double number1=Double.parseDouble(num1);
		
		System.out.print("�� ��° ��: ");
		String num2=scanner.nextLine();
		double number2=Double.parseDouble(num2);
		
		System.out.println("-----------------------------");
		if((number2==0)|(number2==0.0)) {
			System.out.println("���:���Ѵ�");
		} else {
			System.out.println("���:"+(number1/number2));
		}
		System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = ");
		
		//no.10
		int var1=10;
		int var2=3;
		int var3=14;
		double var4=var1*var1*Double.parseDouble(var2+"."+var3);
		System.out.println("���� ����:"+var4);
		System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = ");
		
		//no.11
		Scanner scanner2=new Scanner(System.in);
		
		System.out.print("���̵�: ");
		String name=scanner2.nextLine();
		
		System.out.print("�н�����: ");
		String strPassword=scanner2.nextLine();
		int password=Integer.parseInt(strPassword);
		
		if(name.equals("java")) {
			if(password==12345) {
				System.out.println("�α��� ����");
			}else {
				System.out.println("�α��� ����: �н����尡 Ʋ��");
			}
		}else {
			System.out.println("�α��� ����: ���̵� �������� ����");
		}
		System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = ");
	}

}
