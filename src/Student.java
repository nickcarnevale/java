/* Nick Carnevale
 * Mrs. Kalafut
 * 4/30
 * 
 * Participation
 * This class extends LehighPerson and initalizes new class members to student object
 */

public class Student extends LehighPerson{

	//private members
	private String major;
	private String anticipatedGradDate;
	private static int totalCSEnrollment = 0;
	
	//blank constructor
	public Student() {}
	
	//2-arg constructor
	public Student(String lin, String email) {
		super(lin, email);
	}
		
	//5-arg constructor
	public Student(String name, String address, String brithdate, String lin, String email){
		super(name, address, brithdate, lin, email);
	}
	
	//set methods
	public void setMajor(String major) {
		this.major = major;
	}
	
	public void setAnticipatedGradDate(String anticipatedGradDate) {
		this.anticipatedGradDate = anticipatedGradDate;
	}
	
	//get methods
	public String getMajor() {
		return major;
	}

	public String getAnticipatedGradDate() {
		return anticipatedGradDate;
	}
	
	public static int getTotalCSEnrollment() {
		return totalCSEnrollment;
	}
	
}


