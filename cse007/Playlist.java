/* Nick Carnevale
 * 4/29
 * Prof. Kalafut
 * 
 * Lab 10 
 * 
 * This code creates the playlist class to be used in MakePlaylist.java
 */

import java.util.Arrays;

public class Playlist {

	//declare variables
	private String name;
	private String creator;
	private final int CAPACITY = 20;
	private Song[] songs = new Song[CAPACITY];

	//create playlist contructors
	public Playlist(String name, String creator) {
		this.name = name;
		this.creator = creator;
	}
	
	//create a playlist constructor with a song array
	public Playlist(String name, String creator, Song[] songs) {
		this.name = name;
		this.creator = creator;
		this.songs = songs;
	}
	
	//return the name of the playlist
	public String getName() {
		return name;
	}
	
	//add songs to playlist if not full
	public void addSong(Song song, Song[] playlist) {
		
		for(int i = 0; i<playlist.length; i++) {
			if(songs[i] == null) {
				songs[i] = song;
			}
		}
	}
	
	//remove a specific song from the playlist
	public void removeSong(Song song, Song[]playlist) {
		
		for(int i = 0; i<playlist.length; i++) {
			if(songs[i] == song) {
				songs[i] = null;
			}
		}
		
	}
	
	//get the array of songs from the playlist
	public Song[] getSongs() {
		return songs;
	}
	
}
