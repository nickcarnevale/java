/* Nicholas Carnevale
 * Prof. Kalafut
 * 5/1/2022
 * 
 * HW7
 * 
 * This class creates a domain availability object that is used in the domain test to valid whether user input can be registered as a domain
 */

//using an arraylist for the registered domains to easily add the valid domains given in input
import java.util.ArrayList;

public class DomainAvaliability {

	//given public variables
	String domain;
	String[] validTLD = { ".com", ".net", ".org", ".biz", ".info", ".pro", "name"};
	String[] restrictedTLD = {"biz",".name", ".pro" };
	
	//arraylist instead of a regular array because you cannot change the size of an array once is is declared, where you can with an arraylist
	ArrayList<String> registeredDomains = new ArrayList<String>();{
		registeredDomains.add("apple.com");
		registeredDomains.add("oracle.com");
		registeredDomains.add("comcast.com");
		registeredDomains.add("comcast.org");
		registeredDomains.add("comcast.net");
		registeredDomains.add("combast.biz");
		registeredDomains.add("nonprofit.org");
		registeredDomains.add("home.biz");
		registeredDomains.add("intel.com");
		registeredDomains.add("information.com");
		registeredDomains.add("RunningYourOwn.net");
	}

	int numRegisteredDomains = registeredDomains.size();
	
	//blank DomainAvaliability constructor
	public DomainAvaliability() {
		
	}
	
	//DomainAvaliability constructor which initializes the domain
	public DomainAvaliability(String domain) {
		this.domain = domain.toLowerCase();
	}
	
	//method to change the strings of a string array to lower case
	public String[] changeStringsToLowerCase(String[] list) {			
		for(int i = 0; i < list.length; i++) {
			list[i].toLowerCase();
		}
		return list;
	}
	
	//if DomainAvaliability is constructed without a domain, this method can be used to initialize it
	public void setDomain(String domain) {
		this.domain = domain;
	}
	
	//this method checks to see if the domain is valid, DOES NOT CHECK AGAINST THE REGISTERED LIST
	public int checkIfDomainIsValid(String domain) {		
		
		//Variables for method
		int counter = 0;
		String tld;
		String sld;
		boolean periodGood = true;
		boolean tldGood = false;
		boolean sldGood = true;
		
		//make the string a char array
		char[] domainChars = domain.toCharArray();
		
		//verify there is only one '.'
		for(int i = 0; i < domainChars.length; i++) {
			if(domainChars[i] == '.') {
				counter++;
			}
		}
		
		//verify first and last char arent '.'
		if(domainChars[0] == '.' || domainChars[domainChars.length-1] == '.') {
			periodGood = false;
		}
		
		//verify second-level domain
		if(counter == 1) {
			sld = domain.substring(0, getPeriodPosition(domain));
			if(!hasValidSecondLevel(sld)) {
				sldGood = false; 
			}
		}
		
		
		//verify top-level domain
		if(counter == 1) {
			tld = domain.substring(getPeriodPosition(domain), domain.length());
			if(checkIfTldIsValid(tld)) {
				tldGood = true;
			}
		}
		
		//if statements to produce validity code
		if(counter == 1 && periodGood && tldGood && sldGood) {
			return 0;
		}	
		else if(!periodGood) {
			return -2;
		}	
		else if(counter != 1) {
			return -1;
		}
		else if(!sldGood) {
			return -3;
		}	
		else if(!tldGood) {
			return -4;
		}
		else return 1;
	}

	//this method returns the period position of a string
	public int getPeriodPosition(String domain) {
		int counter = 0;
		char[] domainChars = domain.toCharArray();
		
		//verify there is only one '.'
		for(int i = 0; i < domainChars.length; i++) {
			if(domainChars[i] == '.') {
				counter++;
			}
		}
	
		//produce position or -1
		if(counter == 1) {
			return domain.indexOf(".");
		}
		else {
			return -1;
		}
	}
	
	//this method verifies that the second level domain is of correct syntax
	public boolean hasValidSecondLevel(String domain) {
		
		//variables for method
		int counter = 0;
		boolean lengthGood = true;
		boolean charsGood = false;
		boolean dashGood = true;
		
		//make string a char array
		char[] domainChars = domain.toCharArray();
		char[] goodChars = {'0','1','2','3','4','5','6','7','8','9',
							'a','b','c','d','e','f','g','h','i','j',
							'k','l','m','n','o','p','q','r','s','t',
							'u','v','w','x','y','z',
							'A','B','C','D','E','F','G','H','I','J',
							'K','L','M','N','O','P','Q','R','S','T',
							'U','V','W','X','Y','Z','-'};
		
		//checks to see if the length of domain is good
		if(domain.length()<1 || domain.length()>63) {
			lengthGood = false;
		}
		
		//checks to see if only valid characters are used
		for(int i = 0; i < domainChars.length; i++) {
			for(int j = 0; j < goodChars.length; j++) {
				if(domainChars[i] == goodChars[j]) {
					counter++;
				}
				
			}
		}
		if(counter == domain.length()) {
			charsGood = true;
		}
		
		//checks to see if the domain begins or ends with a dash
		if(domainChars[0] == '-' || domainChars[domainChars.length-1] == '-') {
			dashGood = false;
		}
		
		if(lengthGood && charsGood && dashGood) {
			return true;
		}
		else return false;
		
		
	}

	//this method checks to see if the TLD has correct syntax
	public boolean checkIfTldIsValid(String tld) {
		
		//variables for method
		int counter = 0;
		boolean periodGood = false;
		boolean charsGood = false;
		
		char[] tldChars = tld.substring(1,tld.length()).toCharArray();
		char[] goodChars = {'0','1','2','3','4','5','6','7','8','9',
							'a','b','c','d','e','f','g','h','i','j',
							'k','l','m','n','o','p','q','r','s','t',
							'u','v','w','x','y','z',
							'A','B','C','D','E','F','G','H','I','J',
							'K','L','M','N','O','P','Q','R','S','T',
							'U','V','W','X','Y','Z'};
		
		//checks to see if first character is a period
		if(tld.substring(0, 1).equals(".")){
			periodGood = true;
		}
		
		//checks to see if the characters are all allowed
		for(int i = 0; i < tldChars.length; i++) {
			for(int j = 0; j < goodChars.length; j++) {
				if(tldChars[i] == goodChars[j]) {
					counter++;
				}	
			}
		}
		if(counter == tldChars.length) {
			charsGood = true;
		}
		
		//returns true or false
		if(periodGood && charsGood) {
			return true;
		}
		else return false;
		
		
	}

	//checks the domain string against the registered domains
	public boolean hasAvaliableDomainName(String domain, ArrayList<String> registeredDomains) {
		boolean domainGood = true;
		
		//iterates through the arraylist and compares if any are equal. If ones is returns false
		for(int i = 0; i < registeredDomains.size(); i++) {
			if(domain.equals(registeredDomains.get(i))) {
				domainGood = false;
			}
		}
		return domainGood;
	}

	//this method returns a string a similar domain names with the same SLD but different TLD if not restricted. 
	public String getSimilarDomainNames(String domain, ArrayList<String> registeredDomains, String[] validTLD, String[] restrictedTLD) {
		
		//variables for method
		String tld = domain.substring(getPeriodPosition(domain), domain.length());
		String sld = domain.substring(0, getPeriodPosition(domain));
		String similarDomain;
		String list = "";
		
		//makes sure the tld is not restricted
		for(int i = 0; i < restrictedTLD.length; i++) {
			if(tld == restrictedTLD[i]) {
				return "Restricted TLD: No Similar Domains";
			}
		}
		
		//creates a string of similar tld and appeans it to the sld
		if(checkIfDomainIsValid(domain) == 0 && !hasAvaliableDomainName(domain, registeredDomains)) {
			for(int i = 0; i < validTLD.length; i++) {
				similarDomain = sld + validTLD[i];
				if(checkIfDomainIsValid(similarDomain) == 0 && hasAvaliableDomainName(similarDomain, registeredDomains)) {
					list += similarDomain + ", ";
				}
			}
		}
		return list;
		
	}
	
	//this method adds string to the arraylist
		public void addGoodDomain(String domain, ArrayList<String> registeredDomains) {
			registeredDomains.add(domain);
		}
	
}
