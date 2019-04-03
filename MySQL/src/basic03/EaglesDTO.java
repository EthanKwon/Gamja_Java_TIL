package basic03;

public class EaglesDTO {
	private int backNo;
	private String name;
	private String position;
	private String highschool;
	private String useHand;
	private String hitHand;
	private String birthDay;
	private int salary;
	
	public EaglesDTO(int backNo, String name, String position, String highschool, String useHand, String hitHand,
			String birthDay, int salary) {
		this.backNo = backNo;
		this.name = name;
		this.position = position;
		this.highschool = highschool;
		this.useHand = useHand;
		this.hitHand = hitHand;
		this.birthDay = birthDay;
		this.salary = salary;
	}
	
	public EaglesDTO(){}

	public EaglesDTO(int backNo){
		this.backNo = backNo;
	}
	
	public int getBackNo() {
		return backNo;
	}

	public void setBackNo(int backNo) {
		this.backNo = backNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getHighschool() {
		return highschool;
	}

	public void setHighschool(String highschool) {
		this.highschool = highschool;
	}

	public String getUseHand() {
		return useHand;
	}

	public void setUseHand(String useHand) {
		this.useHand = useHand;
	}

	public String getHitHand() {
		return hitHand;
	}

	public void setHitHand(String hitHand) {
		this.hitHand = hitHand;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EaglesDTO [backNo=" + backNo + ", name=" + name + ", position=" + position + ", highschool="
				+ highschool + ", useHand=" + useHand + ", hitHand=" + hitHand + ", birthDay=" + birthDay + ", salary="
				+ salary + "]";
	}
	
	
	
	

}
