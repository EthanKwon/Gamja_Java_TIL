package sec02;

public class BoxExample {
	public static void main(String[] args) {
		//기존
		Box<Object> originBox = new Box<Object>(); //제네릭타입이 없었을 때 Object 였다.
		originBox.set("홍길동");
		String name1 = (String)originBox.get();
		
		originBox.set(new Apple());
		Apple apple1 = (Apple)originBox.get();
		
		//제네릭 타입 이용
		Box<String> box = new Box<String>();
		box.set("홍길동");
		String name = box.get();
		
		
		Box<Apple> appleBox = new Box<Apple>();
		appleBox.set(new Apple());
		Apple apple = appleBox.get();
		
	}

}
