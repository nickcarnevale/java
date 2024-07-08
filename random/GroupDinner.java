/* Nick Carnevale
 * CSE007
 * 2/7/2022
 * CSE7 HW 1
 * Group Dinner Class
 */

import java.util.Scanner;
public class GroupDinner {

	public static void main(String[] args) {

		//number of friends that attended dinner
		int numFriends = 4;
		
		//cost of meal for each friend
		double meal1 = 34.50;
		double meal2 = 17.99;
		double meal3 = 12.98;
		double meal4 = 25.75;
		
		//cost of bevs
		double bev1 = 10.00;
		double bev2 = 7.99;
		double bev3 = 2.99;
		double bev4 = 2.99;
		
		//the tax rate
		double salesTax = 0.06;
		
		//the tip amount
		double tipRate = 0.15;
		
		double subtotal = meal1 + meal2 + meal3 + meal4 + bev1 + bev2 + bev3 + bev4;
		double tax = salesTax * subtotal;
		double tip = tipRate * subtotal;
		double total = subtotal + tax + tip;
		double totalEvenSplit = total/4;
		
		//calculate fair splits for each friend
		double friend1Tax = (meal1 + bev1) * salesTax;
		double friend1fairsplit = meal1 + bev1 + (friend1Tax) + ((meal1 + bev1) *tipRate);
		
		double friend2Tax = (meal2 + bev2) * salesTax;
		double friend2fairsplit = meal2 + bev2 + (friend2Tax) + ((meal2 + bev2) *tipRate);
		
		double friend3Tax = (meal3 + bev3) * salesTax;
		double friend3fairsplit = meal3 + bev3 + (friend3Tax) + ((meal3 + bev3) *tipRate);
		
		double friend4Tax = (meal4 + bev4) * salesTax;
		double friend4fairsplit = meal4 + bev4 + (friend4Tax) + ((meal4 + bev4) *tipRate);
		
		System.out.printf("Dinner Totals: \nTransaction Total: $%.2f\nTax Total: $%.2f\nGratuity Total: $%.2f\nFinal Total: $%.2f\n\n", subtotal, tax, tip, total);
		
		double mealTips = (meal1 + meal2 + meal3 + meal4) * tipRate;
		double mealTax = (meal1 + meal2 + meal3 + meal4) * salesTax;
		double bevTips = (bev1 + bev2 + bev3 + bev4) * tipRate;
		double bevTax = (bev1 + bev2 + bev3 + bev4) * salesTax;
		
		System.out.printf("Meals Tax: $%.2f\nMeals Tip: $%.2f\nBeverage Tax: $%.2f\nBeverage Tip: $%.2f\n\n", mealTax, mealTips, bevTax, bevTips);
		
		System.out.printf("Debts: \nEven Split: Everyone owes $%.2f\nFair Split: \nFriend 1 owes: $%.2f\nFriend 2 owes: $%.2f\nFriend 3 owes: $%.2f\nFriend 4 owes: $%.2f\n", totalEvenSplit,friend1fairsplit,friend2fairsplit,friend3fairsplit,friend4fairsplit);
		
	}

}
