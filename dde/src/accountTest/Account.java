package accountTest;

public class Account {
	private double accountBalance;
	public Account(double balance){
		accountBalance=balance;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public void getCredit(double depositeAmount) {
		accountBalance=accountBalance+depositeAmount;
	}
	public void getDebit(double withdrawAmount) {
		if(withdrawAmount <= accountBalance)
		{
		accountBalance=accountBalance-withdrawAmount;
		}
		else
		{
			System.out.println("Debit amount exceeded account balance !\nEnter currect Amount");
		}
	}
	
}
