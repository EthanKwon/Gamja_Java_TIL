package exercise18;

public class ShopService {
	private static ShopService singleton = new ShopService();
	
	static ShopService getInstance() {
		return singleton;
	}
}
