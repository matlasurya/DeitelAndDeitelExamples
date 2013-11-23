package Leapyear;

import java.util.Scanner;

public class Leap {
	public static void main(String[] args)
	{
		int year;
		System.out.printf( "enter any year" );
		Scanner input=new Scanner(System.in);
		year=input.nextInt();
		if(year%4==0)
		{
			System.out.printf( year+"-is a  year  leap year " );
		}
			else
			{
				System.out.printf( year+"-is not a leap year" );
		}
	}

}
