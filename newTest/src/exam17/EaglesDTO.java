package exam17;

public class EaglesDTO {
	private int back_no;
	private String name;
	private String posi;
	private String highschool;
	private String use_hand;
	private String hit_hand;
	private String birthday;
	private int salary;
	
	public EaglesDTO(int back_no, String name, String posi, String highschool, String use_hand, String hit_hand,
			String birthday, int salary) {
		this.back_no = back_no;
		this.name = name;
		this.posi = posi;
		this.highschool = highschool;
		this.use_hand = use_hand;
		this.hit_hand = hit_hand;
		this.birthday = birthday;
		this.salary = salary;
	}
	
	public EaglesDTO() {};
	
	public int getBack_no() {
		return back_no;
	}
	public void setBack_no(int back_no) {
		this.back_no = back_no;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "(" + back_no + ", " + name + ", " + posi + ", " + highschool
				+ ", " + use_hand + "" + hit_hand + ", " + birthday + ", " + salary/1000000
				+ "백만원)";
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getPosi() {
		return posi;
	}
	public void setPosi(String posi) {
		this.posi = posi;
	}
	public String getHighschool() {
		return highschool;
	}
	public void setHighschool(String highschool) {
		this.highschool = highschool;
	}
	public String getUse_hand() {
		return use_hand;
	}
	public void setUse_hand(String use_hand) {
		this.use_hand = use_hand;
	}
	public String getHit_hand() {
		return hit_hand;
	}
	public void setHit_hand(String hit_hand) {
		this.hit_hand = hit_hand;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	
}
