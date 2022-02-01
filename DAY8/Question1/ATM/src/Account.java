
public class Account {
	private String accountNumber; 
	private Bank bank; 
	private long availableBalance; 
	
	Account( String accountNumber, Bank bank, long availableBalance){ //Constructor
		this.accountNumber = accountNumber;
		this.bank = bank;
		this.availableBalance = availableBalance;
	}
	
	
	public String getAccountNumber() { //To get the account number
		return accountNumber;
	}
	
	public Bank getBank() { //To get the bank
		return bank;
	}
	
	public long getAvailableBalance() { //To get the available balance
		return availableBalance;
	}
	
	public void debit(long amount) { //To debit with given amount
		this.availableBalance = this.availableBalance - amount;
	}
}