//Nick Carnevale
//Prof. Kalafut
//CSE007
//3/10
//This program creates a deck of cards, shuffles it, deals two hands, and determines which hand wins, and asks the user if they want to play again

//import statments: 
import java.util.Scanner;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.Arrays;

public class CardGame{ 

	// method to randomly swap two different indexes
	public static String[] shuffleArray(String[] array) {
		int index;
		String temp;
		Random random = new Random();
		for(int i = 0; i < array.length; i++) {
			index = random.nextInt(i+1);
			temp = array[index];
			array[index] = array[i];
			array[i] = temp;
		}
		return array;
	}
	
	//method to deal a hand of 5 cards
	public static String[] getHand(String[] array) {
		int index;
		String[] hand = new String[5]; 
		for(int i = 0; i < 5; i++) {
			hand[i] = array[i];
			array[i]=array[i+5];
		}
		return hand;
	}
	
	//main method
	public static void main(String[] args) { 
		
		//declare scanner
		Scanner scan = new Scanner(System.in); 
		
		//initialize variables
		//suits club, heart, spade or diamond 
		String[] suitNames={"C","H","S","D"};    
		String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"}; 
		String[] deck = new String[52]; 
		String[] shuffledDeck = new String[52];
		String[] hand1 = new String[5]; 
		String[] hand2 = new String[5];
		int value;
		int totalValue1 = 0;
		int totalValue2 = 0;
		String answer;
		
		//create the deck
		int cardnumber = 0;
		for (int i = 0; i < suitNames.length; i++) {
			for (int j = 0; j < rankNames.length; j++) {
				deck[cardnumber] = (suitNames[i] + rankNames[j]);
				cardnumber++;
			}
		}
		
		//Print out the deck
		System.out.println("Unshuffled Deck:");
		for(int index = 0; index < deck.length; index++) {
			System.out.print(deck[index] + " ");
		}
		System.out.println("");
		
		//set a do while loop so the user can play again
		do {
		
		//shuffle the deck using the method created before
		System.out.println("Shuffled Deck:");
		shuffledDeck = shuffleArray(deck);
		
		for(int index1 = 0; index1 < shuffledDeck.length; index1++) {
			System.out.print(shuffledDeck[index1] + " ");
		}
		
		//create and print out hand 1
		System.out.println("\nHand1: ");

		hand1 = getHand(shuffledDeck);

		for(int index1 = 0; index1 < hand1.length; index1++) {
			System.out.print(hand1[index1] + " ");
		}

		//create and print out hand 2
		System.out.println("\nHand2: ");

		hand2 = getHand(shuffledDeck);
		
		for(int index1 = 0; index1 < hand2.length; index1++) {
			System.out.print(hand2[index1] + " ");
		}
		
		//get the value of hand 1
		for(String i : hand1) {
						
			switch(i) {	
				case "C2": value = 2;
					break;
				case "C3": value = 3;
					break;
				case "C4": value = 4;
					break;
				case "C5" :value = 5;
					break;
				case "C6" :value = 6;
					break;
				case "C7" :value = 7;
					break;
				case "C8" :value = 8;
					break;
				case "C9" :value = 9;
					break;
				case "C10" :value = 10;
					break;
				case "CJ" :value = 10;
					break;
				case "CQ" :value = 10;
					break;
				case "CK" :value = 10;
					break;
				case "CA" :value = 11;
					break;
				case "H2" :value = 2;
					break;
				case "H3" :value = 3;
					break;
				case "H4" :value = 4;
					break;
				case "H5" :value = 5;
					break;
				case "H6" :value = 6;
					break;
				case "H7" :value = 7;
					break;
				case "H8" :value = 8;
					break;
				case "H9" :value = 9;
					break;
				case "H10" :value = 10;
					break;
				case "HJ" :value = 10;
					break;
				case "HQ" :value = 10;
					break;
				case "HK" :value = 10;
					break;
				case "HA" :value = 11;
					break;
				case "S2" :value = 2;
					break;
				case "S3" :value = 3;
					break;
				case "S4" :value = 4;
					break;
				case "S5" :value =5;
					break;
				case "S6" :value = 6;
					break;
				case "S7" :value = 7;
					break;
				case "S8" :value = 8;
					break;
				case "S9" :value = 9;
					break;
				case "S10" :value = 10;
					break;
				case "SJ" :value = 10;
					break;
				case "SQ" :value = 10;
					break;
				case "SK" :value = 10;
					break;
				case "SA" :value = 11;
					break;
				case "D2" :value = 2;
					break;
				case "D3" :value = 3;
					break;
				case "D4" :value = 4;
					break;
				case "D5" :value = 5;
					break;
				case "D6" :value = 6;
					break;
				case "D7" :value = 7;
					break;
				case "D8" :value = 8;
					break;
				case "D9" :value = 9;
					break;
				case "D10" :value = 10;
					break;
				case "DJ" :value = 10;
					break;
				case "DQ" :value =10;
					break;
				case "DK" :value =10;
					break;
				case "DA" :	value =11;
					break;
				default: value = 0;
					break;
			}
			
			totalValue1 += value;
			
		}
		
		System.out.println("\nHand 1 value: " + totalValue1);
		
		//get the value of hand 2
		for(String i : hand2) {
			
			switch(i) {	
				case "C2": value = 2;
					break;
				case "C3": value = 3;
					break;
				case "C4": value = 4;
					break;
				case "C5" :value = 5;
					break;
				case "C6" :value = 6;
					break;
				case "C7" :value = 7;
					break;
				case "C8" :value = 8;
					break;
				case "C9" :value = 9;
					break;
				case "C10" :value = 10;
					break;
				case "CJ" :value = 10;
					break;
				case "CQ" :value = 10;
					break;
				case "CK" :value = 10;
					break;
				case "CA" :value = 11;
					break;
				case "H2" :value = 2;
					break;
				case "H3" :value = 3;
					break;
				case "H4" :value = 4;
					break;
				case "H5" :value = 5;
					break;
				case "H6" :value = 6;
					break;
				case "H7" :value = 7;
					break;
				case "H8" :value = 8;
					break;
				case "H9" :value = 9;
					break;
				case "H10" :value = 10;
					break;
				case "HJ" :value = 10;
					break;
				case "HQ" :value = 10;
					break;
				case "HK" :value = 10;
					break;
				case "HA" :value = 11;
					break;
				case "S2" :value = 2;
					break;
				case "S3" :value = 3;
					break;
				case "S4" :value = 4;
					break;
				case "S5" :value =5;
					break;
				case "S6" :value = 6;
					break;
				case "S7" :value = 7;
					break;
				case "S8" :value = 8;
					break;
				case "S9" :value = 9;
					break;
				case "S10" :value = 10;
					break;
				case "SJ" :value = 10;
					break;
				case "SQ" :value = 10;
					break;
				case "SK" :value = 10;
					break;
				case "SA" :value = 11;
					break;
				case "D2" :value = 2;
					break;
				case "D3" :value = 3;
					break;
				case "D4" :value = 4;
					break;
				case "D5" :value = 5;
					break;
				case "D6" :value = 6;
					break;
				case "D7" :value = 7;
					break;
				case "D8" :value = 8;
					break;
				case "D9" :value = 9;
					break;
				case "D10" :value = 10;
					break;
				case "DJ" :value = 10;
					break;
				case "DQ" :value =10;
					break;
				case "DK" :value =10;
					break;
				case "DA" :	value =11;
					break;
				default: value = 0;
					break;
			}
			
			totalValue2 += value;
			
		}
		
		System.out.println("Hand 2 value: " + totalValue2);
		
		//calculate the winner
		if(totalValue1 > totalValue2) {
			System.out.println("Hand1 is the winner!");
		}
		else if(totalValue2 > totalValue1) {
			System.out.println("Hand2 is the winner!");
		}
		else {
			System.out.println("It is a tie!");
		}
		
		//ask to play again
		System.out.println("What to play again? (Y/N)");
	
		//scan for answer
		answer = scan.next();
		
		//repeat if yes
		}while(answer.equalsIgnoreCase("Yes") || answer.equals("Y"));
		
		//if not say goodbye
		System.out.println("Goodbye");
	}	
}
