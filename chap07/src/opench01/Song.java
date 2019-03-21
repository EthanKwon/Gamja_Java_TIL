package opench01;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public Song( ) {};
	public Song(String title, String artist, String album, String composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	
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
	}

}
