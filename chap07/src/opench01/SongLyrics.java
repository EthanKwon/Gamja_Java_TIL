package opench01;

public class SongLyrics extends Song {
	public String lyrics;
	
	public SongLyrics(String title, String artist, String album, String composer, int year, int track, String lyrics) {
		super(title, artist, album, composer, year, track);
		this.lyrics = lyrics;
	}
	@Override
	public void showSong() {
		System.out.println("-------------");
		System.out.println("Song Info");
		System.out.println("-------------");
		System.out.println("title : " + title);
		System.out.println("artist : " + artist);
		System.out.println("album : " + album);
		System.out.println("composer : " + composer );
		System.out.println("year : " + year);
		System.out.println("track : " + track);
		System.out.println("lyrics : ");
		System.out.println(lyrics);
	}
	

}
