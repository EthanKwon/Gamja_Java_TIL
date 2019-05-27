package exercise19;

public class Account {
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	private int value;
	
	void setBalance (int value) {
		if (value < MIN_BALANCE || value > MAX_BALANCE)
			return;
		else
			this.value = value;
	}
	
	int getBalance() {
		return this.value;
	}

}
