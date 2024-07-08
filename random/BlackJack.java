import java.util.Scanner;
public class BlackJack {

	static boolean stood = false;
	static int dealerValue = 0; 
	static int playerValue = 0; 
	static boolean playAgain = false; 

	
	public static void main (String[]args) {
		
		boolean lessThan21 = true;
		boolean lessThan17 = true; 
		Scanner scanner = new Scanner(System.in);
		
		Deck deck = new Deck();
		System.out.println("Unshuffed deck:\n" + deck);
		
		do {
		deck.shuffle();
		System.out.println("Shuffled deck:\n" + deck);
		
		Hand player = new Hand(10);
		Hand dealer = new Hand(10);
		
		player.addCard(deck.dealCard());
		dealer.addCard(deck.dealCard());
		player.addCard(deck.dealCard());
		dealer.addCard(deck.dealCard());

		System.out.println("\nYour current hand: ");
		player.display();
		displayValue(player);
		
		System.out.println("\nDealer's first card is: " + dealer.getFirstCard());
		
		
		do {
		hitOrStay(player,deck, scanner); 
		if(player.getSoftValue(player.getHand()) < 21) {
			lessThan21 = true;
		}
		else if(player.getSoftValue(player.getHand()) == 21) {
			lessThan21 = false; 
			System.out.println("\nBlackjack!");
			playAgain = playAgain(scanner);
		}
		else {
			System.out.println("Sorry you busted :(");
			lessThan21 = false;
			playAgain = playAgain(scanner);
		}
		}while (lessThan21 && !stood); 
		
		if(!playAgain) {
		System.out.println("\nDealer's current hand: ");
		dealer.display();
		displayDealerValue(dealer); 
		
		if(dealerValue < 17) {
			while(lessThan17) {
				System.out.println("Dealer Hits...");
				dealer.addCard(deck.dealCard());
				System.out.println("\nDealer's current hand: ");
				dealer.display();
				displayDealerValue(dealer);
				System.out.println(playerValue);
				if(dealerValue > 16 && dealerValue < 22) {
					lessThan17 = false;
					if(dealerValue > playerValue) {
						System.out.println("Sorry the Dealer has won.");
						playAgain = playAgain(scanner);
					}
					else if(dealerValue == playerValue) {
						System.out.println("Game ends in a draw.");
						playAgain = playAgain(scanner);
					}
					else
						System.out.println("You Won!!!");
						playAgain = playAgain(scanner);
				}
				else if (dealerValue > 21) {
					lessThan17 =  false; 
					System.out.println("Dealer busts. You Win!!!");
					playAgain = playAgain(scanner);
				}
				else
					lessThan17 = true;
			}	
		}	
		else {
			if(dealerValue > 16 && dealerValue < 22) {
				lessThan17 = false;
				if(dealerValue > playerValue) {
					System.out.println("Sorry the Dealer has won.");
					playAgain = playAgain(scanner);
				}
				else if(dealerValue == playerValue) {
					System.out.println("Game ends in a draw.");
					playAgain = playAgain(scanner);
				}
				else {
					System.out.println("You Won!!!");
					playAgain = playAgain(scanner);
				}
			}
		}
		
		}	
		}while (playAgain); 
	}
	
	public static void hitOrStay(Hand player, Deck deck, Scanner scanner) {
		boolean valid = true; 
		int answer = 0; 
		System.out.print("\nWould you like to stay or hit? \n1 for Hit\n2 for Stay\n");

		do {
			if(scanner.hasNextInt()) {
				answer = scanner.nextInt(); 
				if(answer == 1 || answer == 2) {
				valid = true; 
				}
				else {
					scanner.nextLine();
					System.out.print("Enter 1 or 2: ");
				valid = false;
				}
			}
			else {
				scanner.nextLine();
				System.out.print("Enter 1 or 2: ");
				valid = false; 
			}
			
				
		}while (!valid);
		
		if(answer == 1) {
			System.out.println("Hitting...");
			player.addCard(deck.dealCard());
			System.out.println("\nYour current hand: ");
			player.display();
			displayValue(player);
			playAgain = false;
}
		
		if(answer == 2) {
			stood = true; 
		}
		
	}	

	public static void displayValue(Hand player) {
		if(player.getSoftValue(player.getHand()) == player.getHardValue(player.getHand()) || player.getHardValue(player.getHand())>21){
			System.out.println("\n\nThe value of your hand is: " + player.getSoftValue(player.getHand()) + "\n");
			playerValue = player.getSoftValue(player.getHand());
		}
		else {
			System.out.printf("\n\nThe value of your hand is %d or %d\n", player.getSoftValue(player.getHand()),player.getHardValue(player.getHand()) );
			playerValue = player.getHardValue(player.getHand());

		}
	}

	public static boolean playAgain(Scanner scanner) {
		boolean valid = true; 
		String input; 
		
		System.out.println("\nWould you like to play again? Y or N");
		do {
			input = scanner.next(); 
			if(input.equalsIgnoreCase("y"))
				return true; 
			else if(input.equalsIgnoreCase("n")) {
				System.out.println("Thanks for playing!");
				return false; }
			else {
				System.out.println("Y or N: ");
				valid = false; 
			}
		}while(!valid); 
		return true; 
		
	}

	public static void displayDealerValue(Hand dealer) {
		if(dealer.getSoftValue(dealer.getHand()) == dealer.getHardValue(dealer.getHand()) || dealer.getHardValue(dealer.getHand())>21){
			System.out.println("\n\nThe value of the Dealer's hand is: " + dealer.getSoftValue(dealer.getHand()));
			dealerValue = dealer.getSoftValue(dealer.getHand());
		}
		else if(dealer.getSoftValue(dealer.getHand()) != dealer.getHardValue(dealer.getHand()) && dealer.getHardValue(dealer.getHand())> 16 && dealer.getHardValue(dealer.getHand())< 22) {
			System.out.println("\n\nThe value of the Dealer's hand is: " + dealer.getHardValue(dealer.getHand()));
			dealerValue = dealer.getHardValue(dealer.getHand());
		}
		else {
			System.out.printf("\n\nThe value of the Dealer's is :%d", dealer.getSoftValue(dealer.getHand()));
			dealerValue = dealer.getSoftValue(dealer.getHand());
		}
	}
	
}
