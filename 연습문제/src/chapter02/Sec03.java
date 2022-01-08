package chapter02;

public class Sec03 {

	public static void main(String[] args) {
		//no.6
		int x=5;
		int y=2;
		int result1=x/y;
		System.out.println(result1);
		
		//no.7
		int a=5;
		int b=2;
		double result2=(double)a/b;
		System.out.println(result2);
		
		//no.8
		double va1=3.5;
		double va2=2.7;
		int result3=(int)(va1+va2);
		System.out.println(result3);
		
		//no.9
		long var1=2L;
		float var2=1.8f;
		double var3=2.5;
		String var4="3.9";
		int result4=(int)var1+(int)var2+(int)var3+(int)Double.parseDouble(var4);
		System.out.println(result4);
		
		//no.11
		byte value1=Byte.parseByte("10");
		int value2=Integer.parseInt("1000");
		float value3=Float.parseFloat("20.5");
		double value4=Double.parseDouble("3.14159");
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
	}

}
