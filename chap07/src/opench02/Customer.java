package opench02;

public class Customer {
	private String name;
	private String phoneNum;
	private String address;
	
	public Customer(String name, String phoneNum, String address) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.address = address;
	}
	
	public void show() {
		System.out.println("-------------");
		System.out.println("Customer Info");
		System.out.println("-------------");
		System.out.println("Name : " + name);
		System.out.println("PhoneNumber : " + phoneNum);
		System.out.println("Address : " + address);
	}

}
