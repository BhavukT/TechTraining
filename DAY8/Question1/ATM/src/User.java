import java.util.*;

public class User {
	private String name; 
	private String mobileNumber;
	private Account account; 
	
	User(String name, String mobileNumber, Account account){ //Constructor
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.account = account;
	}

	public String getName() { //To get the name of user
		return name;
	}

	public String getMobileNumber() { //To get the mobile number of user
		return mobileNumber;
	}

	public Account getAccount() { //To get the account of user
		return account;
	}
	
	public Map<Integer, Integer> withdrawCash(long amount, ATM atm){ //To withdraw cash from ATM
		return atm.withdrawCashFromATM(amount, account);
	}
}
