package ReverseNumber;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args)
	{
	int n, reverse = 0;
	 
    System.out.println("Enter any number ");
    Scanner rev = new Scanner(System.in);
    n = rev.nextInt();

    while( n != 0 )
    {
        reverse = reverse * 10;
        reverse = reverse + n%10;
        n = n/10;
    }

    System.out.println("Reverse of entered number is "+reverse);
	}

}
