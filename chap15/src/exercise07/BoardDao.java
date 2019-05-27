package exercise07;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	
	public BoardDao() {}
	
	public List<Board> getBoardList() {
		
		List<Board> insertBoards = new ArrayList();
		
		insertBoards.add(new Board("제목1","내용1"));
		insertBoards.add(new Board("제목2","내용2"));
		insertBoards.add(new Board("제목3","내용3"));
		
		return insertBoards;
		
	}
	
	

}
