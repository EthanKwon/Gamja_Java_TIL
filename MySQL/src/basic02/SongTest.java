package basic02;

import java.util.List;

public class SongTest {
	public static void main(String[] args) {
		SongDAO sDao = new SongDAO();
//		SongDTO sDto = new SongDTO();
		/*SongDTO sDto = new SongDTO("빨간맛","빠빠빨간 맛 궁금해 허니");
		
		SongDTO sDto =  sDao.selectOne(119);
		sDao.deleteSong(sDto);
		
		sDao.insertSong(sDto);*/
		
		/*sDto = sDao.selectOne(121);
		System.out.println(sDto.toString() +"\n");
		sDto.setTitle("넌 is 뭔들");
		sDto.setLyrics("나 지금 너땜에 혼란스러 제발 누가 나 좀 말려줘");
		sDao.updateSong(sDto);
		sDto = sDao.selectOne(121);
		System.out.println(sDto.toString());*/
		
		List<SongDTO> songList = sDao.selectAll();
		for(SongDTO song : songList) {
			System.out.println(song.toString());
		}
		
		sDao.close();
	}

}
