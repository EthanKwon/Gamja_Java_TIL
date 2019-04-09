package sec03_HashSet;

public class Test {
	public static void main(String[] args) {
		String a = "Java";
		String b = new String("Java");
		
		System.out.println(a.hashCode() + " & " + b.hashCode());
		System.out.println(a == b);
	}
	
	

}
