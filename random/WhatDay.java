/*
 * Nick Carnevale
 * Prof. Kalafut
 * HW 4
 * 
 * This is a program that produces the day of week from a numbered date
 */

import java.util.Scanner;
public class WhatDay {

	public static void main(String[] args) {

		//initialize scanner and variables
		Scanner scanner = new Scanner(System.in);
		String inputDate;
		int month;
		int monthCode;
		int day;
		int year;
		int yearLastDigits;
		int century;
		int centuryCode;
		int yearCode;
		int leapYearCode;
		int dayOfTheWeekCode;
		boolean validDate;
		boolean isLeapYear;
		String weekDay;
		
		//print out a prompt
		System.out.println("Day of the Week Calculator. (Please use xx/xx/xxxx)");
		System.out.print("Enter a date: ");
		
		//seperate month, day, and year from the string
		inputDate = scanner.nextLine();
		month = Integer.parseInt(inputDate.substring(0,2));
		day = Integer.parseInt(inputDate.substring(3,5));
		year = 	Integer.parseInt(inputDate.substring(6,10));
		yearLastDigits = Integer.parseInt(inputDate.substring(8,10));
		century = Integer.parseInt(inputDate.substring(6,8));
		
		//tell whether the date is valid
		if(month > 0 && month < 13 && day > 0 && day < 32 && year > 1699 && year < 2400)
			validDate = true;
		else
			validDate = false;
		
		//continue to ask for date if the date is not valid
		while(!validDate) {
			if(!validDate) {
				System.out.print("Enter a date: ");
				
				inputDate = scanner.nextLine();
				month = Integer.parseInt(inputDate.substring(0,2));
				day = Integer.parseInt(inputDate.substring(3,5));
				year = 	Integer.parseInt(inputDate.substring(6,10));
				yearLastDigits = Integer.parseInt(inputDate.substring(8,10));
				century = Integer.parseInt(inputDate.substring(6,8));
			}
	
			if(month > 0 && month < 13 && day > 0 && day < 32 && year > 1699 && year < 2400)
				validDate = true;
			else
				validDate = false;	
		}

		//find the year code
		yearCode = (yearLastDigits + (yearLastDigits / 4)) % 7;
		
		//find the month code
		switch(month) {
		case 01: monthCode = 0;
			break;
		case 02: monthCode = 3;
			break;
		case 03: monthCode = 3;
			break;
		case 04: monthCode = 6;
			break;
		case 05: monthCode = 1;
			break;
		case 06: monthCode = 4;
			break;
		case 07: monthCode = 6;
			break;
		case 8: monthCode = 2;
			break;
		case 9: monthCode = 5;
			break;
		case 10: monthCode = 0;
			break;
		case 11: monthCode = 3;
			break;
		case 12: monthCode = 5;
			break;
		default: monthCode = 0;
		break;
		}
		
		//find the century code
		switch(century) {
		case 17: centuryCode = 4;
			break;
		case 18: centuryCode = 2;
			break;
		case 19: centuryCode = 0;
			break;
		case 20: centuryCode = 6; 
			break;
		case 21: centuryCode = 4;
			break;
		case 22: centuryCode = 2;
			break;
		case 23: centuryCode = 0;
			break;
		default: centuryCode = 0;
			break;
		}
		
		//tell whether it is a leap year or not
		if(year%4 == 0 && year %100 != 0) {
			isLeapYear = true;
		}
		else 
			isLeapYear = false;
		
		if(year%400 == 0) {
			isLeapYear = true;
		}
		
		if(isLeapYear && (month == 02 || month == 01)){
			leapYearCode = 1;
		}
		else
			leapYearCode = 0;

		//get the day of the week code
		dayOfTheWeekCode = (yearCode + monthCode + centuryCode + day - leapYearCode) % 7;
		
		//translate the code into the day of the week
		switch(dayOfTheWeekCode) {
		case 0: weekDay = "Sunday";
			break;
		case 1: weekDay = "Monday";
			break;
		case 2: weekDay = "Tuesday";
			break;
		case 3: weekDay = "Wednesday";
			break;
		case 4: weekDay = "Thursday";
			break;
		case 5: weekDay = "Friday";
			break;
		case 6: weekDay = "Saturday";
			break;
		default: weekDay = "error";
		}
		
		//print out the result
		System.out.printf("\n%d/%d/%d is a %s",month,day,year,weekDay);
	}
}
