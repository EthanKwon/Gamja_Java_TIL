package opench01;

public class SongLyrics extends Song {
	private String lyrics;
	
	public SongLyrics(String title, String artist, String album, String composer, int year, int track, String lyrics) {
		super(title, artist, album, composer, year, track);
		this.lyrics = lyrics;
	}
	@Override
	public void showSong() {
		super.showSong();
		System.out.println("lyrics : ");
		System.out.println(lyrics);
	}
	

}
