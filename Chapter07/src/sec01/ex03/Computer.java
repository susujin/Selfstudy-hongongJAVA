package sec01.ex03;

public class Computer extends Calculator{
	@Override
	double areaCircle(double r) {
		System.out.println("Calculator °´Ã¼ÀÇ areaCircle()½ÇÇà");
		return Math.PI*r*r;
	}
}
