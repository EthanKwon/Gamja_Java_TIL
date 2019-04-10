package openchallenge03;

public enum Rank {
	
	부장(1),
	차장(2),
	과장(3),
	대리(4),
	사원(5);
	
	private int num;

	Rank(int num){
		this.num = num;
	}

	public int getNum() {
		return num;
	}
	
}
