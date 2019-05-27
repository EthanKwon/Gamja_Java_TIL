package openchallenge03;

import java.time.LocalDate;
import java.util.TreeSet;

public class MemberSort {
	public static void main(String[] args) {
		TreeSet<Member> members = new TreeSet<Member>();
		
		members.add(new Member(1001,"김과장",Rank.과장,LocalDate.of(2003,4,8)));
		members.add(new Member(1002,"김부장",Rank.부장,LocalDate.of(1995,6,15)));
		members.add(new Member(1003,"김대리",Rank.대리,LocalDate.of(2012,7,23)));
		members.add(new Member(1004,"이사원",Rank.사원,LocalDate.of(2016,5,16)));
		members.add(new Member(1005,"이차장",Rank.차장,LocalDate.of(1998,4,18)));
		members.add(new Member(1006,"박대리",Rank.대리,LocalDate.of(2010,2,26)));
		members.add(new Member(1007,"최부장",Rank.부장,LocalDate.of(1993,11,24)));
		members.add(new Member(1008,"정과장",Rank.과장,LocalDate.of(2000,8,12)));
		members.add(new Member(1009,"정사원",Rank.사원,LocalDate.of(2018,4,6)));
		members.add(new Member(1010,"박차장",Rank.차장,LocalDate.of(1997,3,2)));
		
		System.out.println("------------------------------[사원 정보]------------------------------");
		System.out.println();
		for(Member m : members) {
			System.out.println(m.toString());
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------------------");
	}

}
