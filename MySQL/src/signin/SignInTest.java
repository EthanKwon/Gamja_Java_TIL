package signin;

public class SignInTest {
	public static void main(String[] args) {
		BbsDAO bDao = new BbsDAO();
		BbsDTO bDto = new BbsDTO(1002,"테스트 게시물","내용을 입력하세요.");
//		bDao.insertBbs(bDto);
		bDto = new BbsDTO(1001,"테스트 게시물 수정","내용을 수정하세요.");
		bDto.setId(1003);
//		bDao.updateBbs(bDto);
		
//		bDao.deleteBbs(bDto);
		
		System.out.println("[게시판 List]");
		for(BbsDTO write : bDao.selectNameAlldesc()) {
			System.out.println(write.toStringName());
		}
		
		System.out.println("[작성자 List]");
		for(BbsDTO write : bDao.selectContentAllWriter("관리자")) {
			System.out.println(write.toStringContent());
		}
		
		System.out.println("[내용 상세 보기]");
		for(BbsDTO write : bDao.selectContentId(bDto.getId())) {
			System.out.println(write.toStringContent());
		}
	}

}
