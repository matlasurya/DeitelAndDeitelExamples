package BasicProgrames;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int number1;
		int number2;
		int sum;
		System.out.println("enter first integer");
		number1=input.nextInt();
		System.out.println("enter second integer");
		number2=input.nextInt();
		sum=number1+number2;
		System.out.println("sum of given two numbers is:"+sum);
	}

}
