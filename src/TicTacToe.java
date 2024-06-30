/* Nick Carnevale
 * 4/4/2022
 * CSE7
 * Prof. Kalafut
 * 
 * This program simulates a pvp tic tac toe match.
 */


import java.util.Scanner;
public class TicTacToe {
	
	//method to fill the board at the begining of the match
	public static void fillArray(String[][] board) {
		board[0][0]="1";
		board[0][1]="2";
		board[0][2]="3";
		board[1][0]="4";
		board[1][1]="5";
		board[1][2]="6";
		board[2][0]="7";
		board[2][1]="8";
		board[2][2]="9";
	}
	
	//method to fill the counter for which spots are avaliable on the board
	public static void fillArray(int[] spotsAvaliable) {
		int counter = 1;
		for(int i = 0; i < spotsAvaliable.length; i++) {
			spotsAvaliable[i] = counter;
			counter++;
		}
	}
	
	//prints the board
	public static void printArray(String[][] board) {
		System.out.print("\n      ");
		for(String i: board[0]) {
			System.out.print(i + "  ");
		}
		System.out.print("\n      ");
		for(String i: board[1]) {
			System.out.print(i + "  ");
		}
		System.out.print("\n      ");
		for(String i: board[2]) {
			System.out.print(i + "  ");
		}
	}
	
	//method that gets an integer from the user
	//checks to see if the integer is an avaliable space on the board
	public static int getInt(Scanner scanner, int[] spotsAvaliable) {
		boolean correct = false;
		int choice = -1;
		System.out.print("\nPlease choose an avaliable position on the board (1-9): ");
		do {
			if(scanner.hasNextInt()) {
				choice = scanner.nextInt();
				for(int i= 0;i<spotsAvaliable.length;i++) {
					if(choice == spotsAvaliable[i]) {
						spotsAvaliable[i] = -7;
						correct = true;
					}
				}
				if(!correct) {
					System.out.print("\nInvalid Entry. Please choose an avalible spot: ");
				}
			}
			else {
				correct = false;
				scanner.nextLine();
				System.out.print("\nPlease enter an integer 1-9:");
			}
	
		}while(!correct);
		return choice;
	}
		
	//method that edits the board for player 1: replaces open spaces with X
	public static void editArray(String[][] board, int choice) {
		
		switch(choice) {
		
		case 1: board[0][0]="X";
			break;
		case 2: board[0][1]="X";
			break;
		case 3: board[0][2]="X";
			break;
		case 4: board[1][0]="X";
			break;
		case 5: board[1][1]="X";
			break;
		case 6: board[1][2]="X";
			break;
		case 7: board[2][0]="X";
			break;
		case 8: board[2][1]="X";
			break;
		case 9: board[2][2]="X";
			break;
		
		}
	}
	
	//method that edits the board for player 2: replaces open spaces with O
    public static void editArray2(String[][] board, int choice) {
		
		switch(choice) {
		
		case 1: board[0][0]="O";
			break;
		case 2: board[0][1]="O";
			break;
		case 3: board[0][2]="O";
			break;
		case 4: board[1][0]="O";
			break;
		case 5: board[1][1]="O";
			break;
		case 6: board[1][2]="O";
			break;
		case 7: board[2][0]="O";
			break;
		case 8: board[2][1]="O";
			break;
		case 9: board[2][2]="O";
			break;
		
		}
	}
	
    //this method checks to see if there is any interation of three Xs or three Os in a row
    public static boolean isGameFinished(String[][] board) {
    	boolean valid = false;
    	
    	if(board[0][0]=="O" && board[0][1]=="O" && board[0][2]=="O" ||
    	   board[0][0]=="X" && board[0][1]=="X" && board[0][2]=="X" ||
    	   board[1][0]=="O" && board[1][1]=="O" && board[1][2]=="O" ||
    	   board[1][0]=="X" && board[1][1]=="X" && board[1][2]=="X" ||
    	   board[2][0]=="O" && board[2][1]=="O" && board[2][2]=="O" ||
    	   board[2][0]=="X" && board[2][1]=="X" && board[2][2]=="X" ||
    	   board[0][0]=="O" && board[1][0]=="O" && board[2][0]=="O" ||
    	   board[0][0]=="X" && board[1][0]=="X" && board[2][0]=="X" ||
    	   board[0][1]=="O" && board[1][1]=="O" && board[2][1]=="O" ||
    	   board[0][1]=="X" && board[1][1]=="X" && board[2][1]=="X" ||
    	   board[0][2]=="O" && board[1][2]=="O" && board[2][2]=="O" ||
    	   board[0][2]=="X" && board[1][2]=="X" && board[2][2]=="X" ||
    	   board[0][0]=="O" && board[1][1]=="O" && board[2][2]=="O" ||
    	   board[0][0]=="X" && board[1][1]=="X" && board[2][2]=="X" ||
    	   board[2][0]=="O" && board[1][1]=="O" && board[0][2]=="O" ||
    	   board[2][0]=="X" && board[1][1]=="X" && board[0][2]=="X") {
    	   
    		valid = true;
    	}
    	else valid = false;
    		
    	   return valid;
    }
    
    //this method checks to see if the whole board is filled without a winnder
    public static boolean isADraw(String[][] board, int[] spotsAvaliable) {
    	boolean valid = false;
    	int counter = 0;
    	for(int i: spotsAvaliable) {
    		if(-7==i) {
    			counter++;
    		}
    	}
    	if(counter == 9) {
    		valid = true;
    	}
    	return valid;
    }
    
	public static void main(String[]args) {
		
		//declare variables
		String[][] board = new String[3][3];
		Scanner scanner = new Scanner(System.in);
		int choice = -1;
		int choice2 = -1;
		boolean valid = false;
		int[] spotsAvaliable = new int[9];
		
		//use methods to start the game: fill and print the board
		fillArray(board);
		System.out.println("Tic Tac Toe Simulator:");
		printArray(board);
		fillArray(spotsAvaliable);
		
		//this do/while statement repeatedly asks the user to make a selection until one person has won or there is a tie
		do {
		System.out.print("\n\nPlayer 1:");
		choice = getInt(scanner, spotsAvaliable);
		editArray(board, choice);
		printArray(board);
		valid = isGameFinished(board);
		if(valid) {
			System.out.println("\n\nPLAYER 1 WINS!");
			System.exit(0);
		}
		if(isADraw(board, spotsAvaliable)) {
			System.out.println("\n\nGAME ENDS IN A DRAW.");
			System.exit(0);
		}
		System.out.print("\n\nPlayer 2:");
		choice2 = getInt(scanner,spotsAvaliable);
		editArray2(board, choice2);
		printArray(board);
		valid = isGameFinished(board);
		if(valid) {
			System.out.println("\n\nPLAYER 2 WINS!");
			System.exit(0);
		}
		if(isADraw(board, spotsAvaliable)) {
			System.out.println("\n\nGAME ENDS IN A DRAW.");
			valid = true;
		}
		}while(!valid);

		
	}

}
