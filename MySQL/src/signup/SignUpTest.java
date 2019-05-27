package signup;

import java.util.List;

public class SignUpTest {
	public static void main(String[] args) {
		MemberDAO mDao = new MemberDAO();
		
//		mDao.updateMembers(new MemberDTO(1000,"java","뉴자바","1987-05-04","대전광역시 갈마동"));
		/*List<MemberDTO> memberList = mDao.selectAll();
		for(MemberDTO member : memberList) {
			System.out.println(member.toString());
		}*/
		int id1 = 1000;
		int id2 = 1100;
		
		String password1 = "1234";
		String password2 = "java2";
		
		
		if(mDao.IsMember(id1,password1))
			System.out.println("인증 완료!");
		else
			System.out.println("틀렸습니다.");
		
		if(mDao.IsMember(id1,password2))
			System.out.println("인증 완료!");
		else
			System.out.println("틀렸습니다.");
		
		if(mDao.IsMember(id2,password1))
			System.out.println("인증 완료!");
		else
			System.out.println("틀렸습니다.");
		
		/*if(mDao.searchMember(name2))
			System.out.println("찾았습니다!");
		else
			System.out.println("존재하지 않는 이름 입니다.");*/
		
		/*MemberDTO member = mDao.selectOne(1000);
		System.out.println(member.toString());*/
		
	}

}
