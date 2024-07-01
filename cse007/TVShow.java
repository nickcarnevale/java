
public class TVShow {

	private String name;
	private String stream;
	private String genre;
	private double avgLength;
	private int episodes = 0;
	static int shows = 0;
	
	public TVShow() {
		name = "n/a";
		stream = "n/a";
		genre = "n/a";
		avgLength = 0;
		shows++;
	}
	
	public TVShow(String name, String stream, String genre, double avgLength) {
		this.name = name;
		this.stream = stream;
		this.genre = genre;
		this.avgLength = avgLength;
		shows++;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getEpisodes() {
		return episodes;
	}
	
	public void setEpisodes(int episodes) {
		this.episodes = episodes;
	}
	
	public void airEpisodes() {
		episodes++;
	}
	
	public void airEpisodes(int num) {
		episodes += num;
	}
	
	public static int getShows() {
		return shows;
	}
	
	public double getTotalAirTime() {
		return episodes * avgLength;
	}
	
}
