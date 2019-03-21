package opench02;

public class Member extends Customer {
	public int csNum;
	public int mileage;
	
	public Member (String name, String phoneNum, String address, int csNum, int mileage) {
		super(name, phoneNum, address);
		this.csNum = csNum;
		this.mileage = mileage;
	}
	
	@Override
	public void show() {
		System.out.println("-------------");
		System.out.println("Customer Info");
		System.out.println("-------------");
		System.out.println("Name : " + name);
		System.out.println("PhoneNumber : " + phoneNum);
		System.out.println("Address : " + address);
		System.out.println("Customer Number : " + csNum);
		System.out.println("Mileage : " + mileage);
	}
	

}
