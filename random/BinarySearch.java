
import java.util.Arrays;
public class BinarySearch {

	public static void main(String[]args){
		String[][] words =
		    {
		    {"Some", "Words", "Here"}, 
			{"Other", "Words", "In", "This", "Row"},
			{"I", "Can’t", "Think", "Of", "Any", "More", "Words"}
			};
		   
		for(String[] row: words){
			Arrays.sort(row);
		     }
		
		int index = searchRows(words, "more");
		if(index != -1){
			System.out.println("word found");
		} else {
		        System.out.println("word not found");
		}
	}

	public static int searchRows(String[][] words, String input) {
		int t = -1;
		
		for(int i = 0; i < words.length; i++) {
			int low, mid, high;
			high = words[i].length;
			low = 0;
			for(int j = 0; j < words[i].length; j++) {
				mid = (high+low)/2;
				while(high>=low) {
					if(input.equals(words[i][mid])) {
						t = 1;
					}
					else if(input.compareTo(words[i][mid])>0) {
						high = mid-1;
					}
					else if(input.compareTo(words[i][mid])<0) {
						low = mid-1;
					}
				}
			}
		}
		
		return t;
	}
	
	
}
