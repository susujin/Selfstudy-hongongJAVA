package sec01.ex01;

public class CellPhone {
	String model;
	String color;
	
	void powerOn() {System.out.println("������ ŵ�ϴ�");}
	void powerOff() {System.out.println("������ ���ϴ�");}
	void bell() {System.out.println("���� �︳�ϴ�");}
	void sendVoice(String messange) {System.out.println("�ڱ�: "+messange);}
	void receiveVoice(String messange) {System.out.println("����: "+messange);}
	void hangUp() {System.out.println("��ȭ�� �����ϴ�");}
}
