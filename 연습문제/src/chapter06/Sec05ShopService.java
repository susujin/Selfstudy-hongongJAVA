package chapter06;

public class Sec05ShopService {
	private static Sec05ShopService singleton=new Sec05ShopService();
	
	private Sec05ShopService() {}
	
	static Sec05ShopService getInstance() {
		return singleton;
	}
	
}
