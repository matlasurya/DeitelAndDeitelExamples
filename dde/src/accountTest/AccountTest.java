package accountTest;

import java.util.Scanner;

public class AccountTest{
	public static void main(String[]args){
		Account account1=new Account(50.00);
		Account account2=new Account(10.00);
		
		System.out.println("account1: "+account1.getAccountBalance());
		System.out.println("account2: "+account2.getAccountBalance());
		
		Scanner input=new Scanner(System.in);
		double depositeAmount;
		System.out.println("enter deposite amount for  account1:");
		depositeAmount=input.nextDouble();
		
		account1.getCredit(depositeAmount);
		System.out.println("account1: "+account1.getAccountBalance());
		System.out.println("account2: "+account2.getAccountBalance());
		
		System.out.println("enter deposite amount for  account2:");
		depositeAmount=input.nextDouble();
		
		account2.getCredit(depositeAmount);
		System.out.println("account1: "+account1.getAccountBalance());
		System.out.println("account2: "+account2.getAccountBalance());
		
		
		double withdrawAmount;
        System.out.println("please enter withdraw Amount for account1:");
        withdrawAmount=input.nextDouble();
        
        account1.getDebit(withdrawAmount);
        System.out.println("account1 current balance: "+account1.getAccountBalance());
       
       
        account2.getDebit(withdrawAmount);
        System.out.println("please enter withdraw Amount for account2:");
        withdrawAmount=input.nextDouble();
        System.out.println("account2 current balance: "+account2.getAccountBalance());
		
	}
}