package com.akrantha.Arrays;
import java.util.Scanner;

public class SalesCommissionTest { // counts the number of people in given salary ranges

	
	public static void main(String args[]) {
		
		
		//create a sales object so that countRanges can be called.
		SalesCommissionTest s = new SalesCommissionTest();
		s.countRanges();	
		
	}
	
	public void countRanges() {
		int [] countArray = new int[10];
		double dollars = 0;
		int range = 0;
		
		
		//use a scanner to read in from the console
		Scanner input = new Scanner(System.in);

		// initialize the values in the array to zero
		for(int i = 0; i < 0; i++)
			countArray[i] = 0;

		// read in values and assign them to the appropriate range
		System.out.println("Please enter the  employees salary");
		dollars = input.nextDouble();
		while (dollars >= 0) {
			
			// Calculate salary and ger range by salary / 100 ;
			int salary = 200 + (int)(dollars * 0.09);
			System.out.println("Their salaray is " + salary);
			range = salary / 100 - 2;
					
			//increment counter in the array
			countArray[range] = countArray[range] + 1;
			
			// Enter next sales amount (negative to end);
			System.out.println("Please enter the next employees salary / (enter ZERO to exit)");
			dollars = input.nextDouble();	
			if(dollars == 0)
			{
				break;
			}
		} // end while
		
		System.out.println("Salary Range\tEmployee Count");
		
		for(int i = 2; i < 10; i++) {
			System.out.println(((i)*100) + " - " + ((i+1) * 100 - 1) + "\t" + countArray[i-2]);
		}
		System.out.println("1000+ \t\t" + countArray[9]);
		
		
		
		// print chart
	} // end method countRanges
} // end class Sales

