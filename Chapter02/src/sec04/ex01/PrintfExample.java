package sec04.ex01;

public class PrintfExample {

	public static void main(String[] args) {
		int value=123;
		System.out.printf("��ǰ�� ���� : %d��\n",value); //����
		System.out.printf("��ǰ�� ���� : %6d��\n",value); //6�ڸ�����. ���� ���ڸ� ����
		System.out.printf("��ǰ�� ���� : %-6d��\n",value); //6�ڸ� ����. ������ ���ڸ� ����
		System.out.printf("��ǰ�� ���� : %06d��\n",value); //6�ڸ� ����. ���� ���ڸ� 0���� ä��.
		
		double area=3.14159*10*10;
		System.out.printf("�������� %d�� ���� ���� : %10.2f\n",10,area); //�Ҽ��� �̻� 7�ڸ�. �Ҽ������� 2�ڸ�. ���� ���ڸ� ����
		
		String name="ȫ�浿";
		String job="����";
		System.out.printf("%6d | %-10s | %10s\n",1,name,job);

	}

}
