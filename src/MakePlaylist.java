/* Nick Carnevale
 * 4/29
 * Prof. Kalafut
 * 
 * Lab 10 
 * 
 * This code creates creates a playlist from user input and uses the song and playlist classes
 */

//import statements
import java.util.Scanner;
import java.util.Random;

public class MakePlaylist {

	//main
	public static void main(String[] args) {

		//declare variables for main
		Scanner scanner = new Scanner(System.in);
		String playlistName;
		String creatorName;
		int selection = 0;
		int num = 0;
		boolean correct = true;
		Song[] tunes;
		
		//prompts user for name of playlist
		System.out.print("Enter the name of your playlist: ");
		playlistName = scanner.next();
		
		//prompts user for creator name of playlist
		System.out.print("Enter Creator name: ");
		creatorName = scanner.next();
		
		//prompts user for the amount of songs in playlist
		//repeats if not int or less than 20
		System.out.print("Enter number of songs (<20): ");
		do {
			if(scanner.hasNextInt()) {
				num = scanner.nextInt();
			}
			else{
				correct = false;
			}
			if(num > 0 && num < 20) {
				correct = true;
			}
			else {
				correct = false;
				scanner.nextLine();
				System.out.print("Please enter a number less than 20: ");
			}
		}while(!correct);
		
		//initalizes songs array with input
		tunes = new Song[num];
		
		//populates songs array with input
		tunes = createSongs(num, scanner);
		
		//creates playlist
		Playlist songs = new Playlist(playlistName, creatorName, tunes);
		
		//asks user what they want to do with playlist
		System.out.println("\nWould you like to add, remove or queue songs?\n1-add\n2-remove\n3-queue\n4-quit\nSelection: ");
	
		//repeats if not valid input
		do {
			if(scanner.hasNextInt()) {
				selection = scanner.nextInt();
			}
			else {
				correct = false;
			}
			if(selection == 1 || selection == 2 || selection == 3 || selection == 4) {
				correct = true;
			}
			else {
				correct = false;
				scanner.nextLine();
				System.out.print("Please enter 1,2,3, or 4: ");
			}
		}while(!correct);
		
		//does proper selection
		switch(selection) {
			case 1: addSong(songs, scanner);
			break;
			
			case 2: removeSong(songs, scanner);
			break;
			
			case 3: queueSongs(songs, scanner);  
			break;	
			
			case 4: System.out.println("Thank you!");
			break;
		}
	}
	
	//this method prompts the user to see if they want to queue songs and queues a random array of them from the playlist
	public static void queueSongs(Playlist songs, Scanner scanner) {
		
		//delcare variables for this method
		Random random = new Random();
		Song[] songs1 = new Song[songs.getSongs().length];
		songs1 = songs.getSongs();
		Song temp;
		boolean valid = true;
		int num = 0;
		boolean correct = true;
		
		//outer do loop repeats if user wants to queue more than once
		do {
		
		//asks user how many songs they would like to queue
		System.out.println("How many songs would you like to queue?");
		
		//repeats if input is not an int or in the desired range
		do {
			if(scanner.hasNextInt()) {
				num = scanner.nextInt();
			}
			else {
				correct = false;
			}
			if(num > 0 && num <= songs.getSongs().length) {
				correct = true;
			}
			else {
				correct = false;
				scanner.nextLine();
				System.out.println("Error queue needs to be an int < the playlist size: ");
			}
		} while(!correct);
		
		//if the int is valid, using the input, randomize the set of songs
		for(int i = 0; i < num; i++) {
			int randomP = random.nextInt(num);
			temp = songs1[i];
			songs1[i]= songs1[randomP];
			songs1[randomP] = temp;	
		}
		
		//print out the queue
		System.out.println("This is your queue: ");
		for(int i = 0; i < num; i++) {
			System.out.print(songs1[i].getName() + "\n");
		}
		
		//ask if they want to queue again
		System.out.println("\nQueue again?\n1  - Yes\n-1 - No");
		int select = 0;
		//valid the input
		do {
			if(scanner.hasNextInt()) {
				select = scanner.nextInt();
			}
			else {
				correct = false;
			}
			if(select == 1 || select == -1) {
				correct = true;
			}
			else {
				correct = false;
				scanner.nextLine();
				System.out.println("Enter 1 or -1: ");
			}
		//repeat if input is not valid
		} while(!correct);
		
		if(select == 1) {
			valid = false;
		}
		else {
			System.out.println("Thank you!");
			valid = true;
		}
		
		//repeat whole method if they want to queue
		}while(!valid);
		
	}
	
	//this method removes a song from the playlist if it matches a song from input
	public static void removeSong(Playlist songs, Scanner scanner) {
		Song song = getSong(scanner);
		
		//uses method from playlist.java
		songs.removeSong(song, songs.getSongs());
		System.out.println("Song " + song.getName() + " is removed.");
	}
	
	//this method adds a song to playlist if capacity not full
	public static void addSong(Playlist songs, Scanner scanner) {
		Song song = getSong(scanner);
		
		//uses method from playlist.java
		songs.addSong(song, songs.getSongs());	
		System.out.println("Song " + song.getName() + " is added.");

	}
	
	//this method creates the songs to initalize the playlist
	//gets input from user
	public static Song[] createSongs(int num, Scanner scanner) {
		
		//declare variables for method
		int counter = 1;
		String name;
		String artist;
		String album; 
		int time = 0;
		boolean correct = true;
		Song[] songs = new Song[num];
		
		//repeats until each song in playlist is initalized
		do {
		
		//get name, artist, album and run time from user	
		System.out.print("Enter song " + counter + " name: ");
		name = scanner.next();
		scanner.nextLine();
		System.out.print("Enter album name: ");
		album = scanner.next();
		scanner.nextLine();
		System.out.print("Enter artist name: ");
		artist = scanner.next();
		scanner.nextLine();
		System.out.print("Enter song runtime: ");
		//makes sure run time is an int
		do {
			if(scanner.hasNextInt()) {
				time = scanner.nextInt();
			}
			else {
				correct = false;
			}
			if(time > 0) {
				correct = true;
			}
			else {
				correct = false;
				scanner.nextLine();
				System.out.println("Error runtime needs to be an int: ");
			}
		}while(!correct);

		//initializes current song with input
		songs[counter-1] = new Song(name, artist, album, time);
		//increates counter
		counter++;
		
		//interates until dersired playlist is full
		}while(counter < num+1);
		
		//returns songs array
		return songs;
	}
	
	//this method gets a song from the user 
	public static Song getSong(Scanner scanner) {
		
		//declare variables
		String name;
		String artist;
		String album; 
		int time = 0;
		boolean correct = true;
		
		//prompts user for input
		System.out.print("What is the name of the song?: ");
		name = scanner.next();
		scanner.nextLine();
		System.out.print("Enter album name: ");
		album = scanner.next();
		scanner.nextLine();
		System.out.print("Enter artist name: ");
		artist = scanner.next();
		scanner.nextLine();
		System.out.print("Enter song runtime: ");
		//makes sure run time is an int
		do {
			if(scanner.hasNextInt()) {
				time = scanner.nextInt();
			}
			else {
				correct = false;
			}
			if(time > 0) {
			}
			else {
				correct = false;
				scanner.nextLine();
				System.out.println("Error runtime needs to be an int: ");
			}
		}while(!correct);
		
		//returns the song
		return new Song(name, artist, album, time);
	}

}
