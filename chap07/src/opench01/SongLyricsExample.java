package opench01;

public class SongLyricsExample {
	public static void main(String[] args) {
			SongLyrics songLyrics = new SongLyrics("Love of My Life", "Queen", 
					"A Night at the Opera", "Freddie Mercury", 1975, 9, "Love of my life, you've hurt me\r\n" + 
							"You've broken my heart and now you leave me\r\n" + 
							"Love of my life, can't you see?\r\n" + 
							"Bring it back, bring it back\r\n" + 
							"Don't take it away from me, because you don't know\r\n" + 
							"What it means to me");
			songLyrics.showSong();
	}

}
