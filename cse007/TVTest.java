public class TVTest{
    public static void main(String[]args){
       
    	TVShow[] lineup = new TVShow[4];
        System.out.println("The total number of shows: "+ TVShow.getShows());
        lineup[0] = new TVShow("Great British Baking Championship", "Netflix", "Food/Reality", 55 );
        lineup[1] = new TVShow("Nailed it!", "Netflix", "Food/Reality", 22);
        lineup[2] = new TVShow("Brooklyn 99", "Hulu", "Comedy", 23.5);
        lineup[3] = new TVShow("Arrested Development", "Netflix", "Comedy", 22.7);
        
        for(int i = 0; i<lineup.length; i++){
            lineup[i].airEpisodes((int)(Math.random()*10)+1);
        }
        
        System.out.println("The total number of shows: "+ TVShow.getShows());
        
        for(int i = 0; i<lineup.length; i++){
            System.out.println("Show: "+lineup[i].getName()+" has aired "+ lineup[i].getEpisodes()+" episodes for a total airtime of "+ lineup[i].getTotalAirTime()+" mins.");
        }
    }

}