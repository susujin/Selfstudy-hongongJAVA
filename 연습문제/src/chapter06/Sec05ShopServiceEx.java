package chapter06;

public class Sec05ShopServiceEx {

	public static void main(String[] args) {
		Sec05ShopService obj1=Sec05ShopService.getInstance();
		Sec05ShopService obj2=Sec05ShopService.getInstance();
		
		if(obj1==obj2) {
			System.out.println("같은 Sec05ShopService 입니다.");
		}else {
			System.out.println("다른 Sec05ShopService 입니다.");
		}

	}

}
