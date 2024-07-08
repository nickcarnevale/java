/*
 * Nick Carnevale
 * 2/4/2022
 * CSE 7: Lab 2
 * PizzaParty Class
 */

import java.util.Scanner;

public class PizzaParty {

	public static void main(String[] args) {

		double budget; //this holds the total amount you have to spend on the weekend (we will compare this to the weekendTotal)

		int numFriendsFri;  //this holds the number of people that will join you for pizza each night
		int numFriendsSat;
		
		double avgSlicePerPersonFri; //this holds the number of slices that the avg person eats and will be used to calculate the total number of slices (pies) needed
		double avgSlicePerPersonSat;
		
		double costPerPizzaFri;  //this holds the cost for a single pizza (whole pie; slices not available separately)
		double costPerPizzaSat;
		
		int wholePizzasFri;   //will hold the number of whole pizzas required based on the slices that are estimated
		int wholePizzasSat;
		
		double totalPizzaCostFri; //subtotal of cost of pizzas
		double totalPizzaCostSat;
		
		double totalTaxOwedFri;  //uses rate below to calculate the tax owed on the total
		double totalTaxOwedSat;
		
		double totalFri; //will hold the total owed each night including pizza, tax and delivery
		double totalSat; 
		
		double weekendTotal;
		
		final int slicePerPizza = 8; //this is the number of slices cut from each pizza

		final double salesTax = .06; //this holds the salesTax rate used for the order (6%)

		final double deliveryFee = 4.99; //this holds the flat delivery fee applied to each order

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to my pizza party planner! \n");
	
		System.out.print("What is your Budget? : ");
		
		budget = scanner.nextDouble();
		
		System.out.print("\nHow many friends are coming Friday? : ");
		
		numFriendsFri = scanner.nextInt();
		numFriendsFri++;
		
		System.out.print("\nHow many slices will everyone eat? : ");
		
		avgSlicePerPersonFri = scanner.nextDouble();
		
		System.out.print("\nWhat is the cost per Pizza? : ");
		
		costPerPizzaFri = scanner.nextDouble();
		
		double slices = numFriendsFri * avgSlicePerPersonFri;
		double pizzas = slices/slicePerPizza;
		
		wholePizzasFri = (int) (Math.ceil(pizzas));
		
		totalPizzaCostFri = wholePizzasFri * costPerPizzaFri;
		totalTaxOwedFri = totalPizzaCostFri * salesTax;
		totalFri = totalPizzaCostFri + totalTaxOwedFri + deliveryFee;
		
System.out.print("\nHow many friends are coming Saturday? : ");
		
		numFriendsSat = scanner.nextInt();
		numFriendsSat++;
		
		System.out.print("\nHow many slices will everyone eat? : ");
		
		avgSlicePerPersonSat = scanner.nextDouble();
		
		System.out.print("\nWhat is the cost per Pizza? : ");
		
		costPerPizzaSat = scanner.nextDouble();
		
		double slicesSat = numFriendsSat * avgSlicePerPersonSat;
		double pizzasSat = slicesSat/slicePerPizza;
		
		wholePizzasSat = (int) (Math.ceil(pizzasSat));
		
		totalPizzaCostSat = wholePizzasSat * costPerPizzaSat;
		totalTaxOwedSat = totalPizzaCostSat * salesTax;
		totalSat = totalPizzaCostSat + totalTaxOwedSat + deliveryFee;
		
		weekendTotal = totalFri + totalSat;
		
		//print statements
		System.out.println("Friday Night Party");
		System.out.printf("%d Pizzas: $%.2f\n",wholePizzasFri, totalPizzaCostFri );
		System.out.printf("Tax: $%.2f\n", totalTaxOwedFri);
		System.out.printf("Delivery: $%.2f\n", deliveryFee);
		System.out.printf("Total: $%.2f\n", totalFri);
		
		System.out.println("Saturday Night Party");
		System.out.printf("%d Pizzas: $%.2f\n",wholePizzasSat, totalPizzaCostSat );
		System.out.printf("Tax: $%.2f\n", totalTaxOwedSat);
		System.out.printf("Delivery: $%.2f\n", deliveryFee);
		System.out.printf("Total: $%.2f\n", totalSat);
		
		int totalPizzas = wholePizzasFri + wholePizzasSat;
		System.out.printf("Weekend Total: %d Pizzas for $%.2f\n",totalPizzas,weekendTotal);
		
		if(weekendTotal > budget) {
			System.out.println("Can you afford? False");
		}
		else
			System.out.println("Can you afford? True");
		
		
	}

}
