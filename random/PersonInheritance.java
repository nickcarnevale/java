/* Nick Carnevale
 * Mrs. Kalafut
 * 4/30
 * 
 * Participation
 * 
 * This code shows the power of inheritance using the student, person, and lehighperson classes
 */

public class PersonInheritance {

	public static void main(String[]args) {
		
		//create an instance of each class
		Person nick = new Person("Nick", "25 Stockade Rd.", "20030428");
		LehighPerson nickC = new LehighPerson("12345678", "nic225", "Nick", "25 Stockade Rd.", "20030428");
		Student nickCarnevale = new Student("Nick", "25 Stockade Rd.", "20030428","12345678", "nic225");
		
		//create a student array
		Student[] roster = new Student[5];
		
		//intialize the students in the student array
		for(int i = 0; i<roster.length;i++) {
			roster[i] = new Student();
		}
		
		//use methods to set name
		roster[0].setName("Bill");
		roster[1].setName("Tris");
		roster[2].setName("Marco");
		roster[3].setName("Ellie");
		roster[4].setName("Paige");
		
		//use methods to set major
		roster[0].setMajor("Finance");
		roster[1].setMajor("Health");
		roster[2].setMajor("CSB");
		roster[3].setMajor("PreMed");
		roster[4].setMajor("IBE");
		
		//use methods to set email
		roster[0].setEmail("bil224");
		roster[1].setEmail("tri532");
		roster[2].setEmail("mar382");
		roster[3].setEmail("ell129");
		roster[4].setEmail("pai238");
		
		//email, name, and major were from all three classes showing how you can use inheritance
		
		//print using the get methods
		System.out.println("Current Roster:");
		for(int i = 0; i < roster.length; i++) {
			System.out.println(roster[i].getName() + "\t" + roster[i].getMajor() + "\t  " + roster[i].getEmail());
		}
		
	}
	
}
