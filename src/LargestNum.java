/*The purpose of this program is to identify the 
largest number out of three ints entered by the user.
Created w/ VSCode
*/

import java.util.Scanner;

public class LargestNum {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int num1;
      int num2;
      int num3;

      System.out.println("Enter a number");
      num1 = keyboard.nextInt();
      System.out.println("Enter another number");
      num2 = keyboard.nextInt();
      System.out.println("Enter a third number");
      num3 = keyboard.nextInt();
   
      if ( num1 >= num2 && num1 >= num3   ) { //fill in this if statement (in parens), for the condition where num1 is the largest
         System.out.println(num1+" is the largest num.");
      }
      else if (  num2 >= num1 && num2 >= num3  ) { //fill in this if statement, for the condition where num2 is the largest
         System.out.println(num2 +" is the largest num.");
      }
      else { //since num1 and num2 weren't largest, num3 is largest by default
         System.out.println(num3 +" is the largest num.");
      } 
      keyboard.close();
   }
}