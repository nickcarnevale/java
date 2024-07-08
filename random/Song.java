/* Nick Carnevale
 * 4/29
 * Prof. Kalafut
 * 
 * Lab 10 
 * 
 * This code creates the song class to be used in MakePlaylist.java
 */

public class Song {

	//declare variables
	private String name;
	private String artist;
	private String album;
	private int time;
	private static int numSongs;
	
	//creates the song contructor
	public Song(String name, String artist, String album, int time) {
		this.name = name;
		this.artist = artist;
		this.album = album;
		this.time = time;
	}
	
	//gets name of the song
	public String getName() {
		return name;
	}
	
	//gets artist
	public String getArtist() {
		return artist;
	}
	
	//gets album
	public String getAlbum() {
		return album;
	}
	
	//gets time
	public int getTime() {
		return time;
	}
	
	
}
