package basic02;

public class SongDTO {
	private int id;
	private String title;
	private String lyrics;
	
	public SongDTO(int id, String title, String lyrics) {
		this.id = id; 
		this.title = title;
		this.lyrics = lyrics;
	}
	public SongDTO(String title, String lyrics) {
		this.title = title;
		this.lyrics = lyrics;
	}
	
	public SongDTO() {}
	
	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getLyrics() {
		return lyrics;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}

	@Override
	public String toString() {
		return "SongDTO [id=" + id + ", title=" + title + ", lyrics=" + lyrics + "]";
	}
	
	
	
	

}
