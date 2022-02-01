
public class Bank {
	private String bankName; // To hold the bank name
	private String area; // To hold the area to which the bank belongs

	Bank(String bankName, String area) { // Constructor
		this.bankName = bankName;
		this.area = area;
	}

	public String getBankName() { // To get the name of the bank
		return bankName;
	}

	public String getArea() { // To get the area of bank
		return area;
	}

}
