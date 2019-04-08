package membermodeling;

public class MemberExample {
	public static void main(String[] args) {
		Member member1 = new Member("홍길동","gildong123","javapass",25);
		Member member2 = new Member("고길동","gildong1234","javapass1",26);
		
		int result = member1.comparableTo(member2);
		
		System.out.println("결과는 " + result);
		
		
	}

}
