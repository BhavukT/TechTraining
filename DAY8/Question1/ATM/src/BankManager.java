import java.util.*;
public class BankManager {
    private String name; 
	private String mobileNumber; 
	private Bank bank; 
	
	BankManager(String name, String mobileNumber, Bank bank){ //Constructor
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.bank = bank;
	}
	
	public void rechargeCashInATM(Map<Integer, Integer> notes, ATM atm) { //To add cash to ATM
		atm.rechargeATM(notes);
	}
}
