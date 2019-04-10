package openchallenge03;

import java.time.LocalDate;

public class Member implements Comparable<Member> {
	private int id;
	private String name;
	private Rank rank;
	private LocalDate date;
	
	
	public Member(int id, String name, Rank rank, LocalDate date) {
		this.id = id;
		this.name = name;
		this.rank = rank;
		this.date = date;
	}
	
	@Override
	public int compareTo(Member m) {
		if(rank.getNum() > m.rank.getNum()) return 1;
		else if(rank.getNum() < m.rank.getNum()) return -1;
		else return compareDate(m);
	}
	
	public int compareDate(Member m) {
		if(date.compareTo(m.date) > 0) return 1;
		else if (date.compareTo(m.date) < 0) return -1;
		else return 0;
	}

	@Override
	public String toString() {
		return "직급 : " + rank + " | 입사 날짜 : " + date + " | 사원 번호 : " + id + " | 이름 : "+ name;
	}
	
	
	
}
