package sec07child;

public interface ParentInterface {
	public void method1();
	public default void method2() {System.out.println("**Parent의 method1()**");} ;

}
