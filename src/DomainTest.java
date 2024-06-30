/* Nicholas Carnevale
 * Prof. Kalafut
 * 5/1/2022
 * 
 * HW7
 * 
 * This class tests the domain availability class
 */

import java.util.Scanner;
public class DomainTest {

	public static void main(String[] args) {
		//variables for main
		Scanner scanner = new Scanner(System.in);
		String domain;
		int valid;
		boolean correct = true;
		int selection;
		boolean contin = false;
		DomainAvaliability domain1 = new DomainAvaliability();
		
		//this do loop continues until user does not want to enter any more domains
		do {
		System.out.println("Enter a Domain: ");
		//this do loop continues until user enters a correct domain
		do {
		domain = getString();
		domain1.setDomain(domain);
		valid = domain1.checkIfDomainIsValid(domain);
		if(valid == 0) {
			System.out.println("The Domain Name is acceptable.");
			correct = true;
		}
		else if(valid == -1) {
			System.out.println("There should only be 1 period.");
			correct = false;
			System.out.println("Try again: ");
		}
		else if(valid == -2) {
			System.out.println("The '.' cannot be in the first or last spot.");
			correct = false;
			System.out.println("Try again: ");
		}
		else if(valid == -3) {
			System.out.println("The second-level domain is invalid.");
			correct = false;
			System.out.println("Try again: ");
		}
		else if(valid == -4) {
			System.out.println("The top-level domain is invalid.");
			correct = false;
			System.out.println("Try again: ");
		}
		else {
			System.out.println("Error, try again: ");
			correct = false;
		}
		}while(!correct);
		
		//if the domain is not registered
		if(domain1.hasAvaliableDomainName(domain1.domain, domain1.registeredDomains)) {
			System.out.println("Domain is avaliable and now registered.\n");
			domain1.addGoodDomain(domain, domain1.registeredDomains);
			System.out.println("List of Registered Domains:");
			for(int i = 0; i < domain1.registeredDomains.size(); i++) {
				System.out.println(domain1.registeredDomains.get(i));
			}
		}
		//if the domain is already registered
		else {
			System.out.println("\nThis domain is registered already.");
			System.out.println("Here are some similar domains to try again with:\n"+ domain1.getSimilarDomainNames(domain1.domain, domain1.registeredDomains, domain1.validTLD, domain1.restrictedTLD));
		}
		
		//ask if user wants to enter another domain
		System.out.println("\nWould you like to add another domain?\n1-yes\n2-no");
		//continues until user enteres 1 or 2
		do{
			if(scanner.hasNextInt()) {
				selection = scanner.nextInt();
				if(selection == 1) {
					correct = true;
				}
				else if(selection == 2) {
					scanner.nextLine();
					System.out.println("Thank you!");
					contin = true;;
				}
				else {
					correct = false;
					scanner.nextLine();
					System.out.println("Please print 1 or 2");
				}
			}
			else {
				correct = false;
				scanner.nextLine();
				System.out.println("Please print 1 or 2.");
			}
		}while(!correct);
		}while(!contin);

	}
	
	//method that gets a string from user
	public static String getString() {
		Scanner scanner = new Scanner(System.in);
		return scanner.next();
	}

}
