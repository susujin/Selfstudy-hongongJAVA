package sec01.ex03;

public class Computer extends Calculator{
	@Override
	double areaCircle(double r) {
		System.out.println("Calculator ��ü�� areaCircle()����");
		return Math.PI*r*r;
	}
}
