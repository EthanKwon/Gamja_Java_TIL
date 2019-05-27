package opench02;

public class Member extends Customer {
	private int csNum;
	private int mileage;
	
	public Member (String name, String phoneNum, String address, int csNum, int mileage) {
		super(name, phoneNum, address);
		this.csNum = csNum;
		this.mileage = mileage;
	}
	
	@Override
	public void show() {
		super.show();
		System.out.println("Customer Number : " + csNum);
		System.out.println("Mileage : " + mileage);
	}
	

}
