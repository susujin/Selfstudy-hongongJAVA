package chapter06;

public class Sec05ShopServiceEx {

	public static void main(String[] args) {
		Sec05ShopService obj1=Sec05ShopService.getInstance();
		Sec05ShopService obj2=Sec05ShopService.getInstance();
		
		if(obj1==obj2) {
			System.out.println("���� Sec05ShopService �Դϴ�.");
		}else {
			System.out.println("�ٸ� Sec05ShopService �Դϴ�.");
		}

	}

}
