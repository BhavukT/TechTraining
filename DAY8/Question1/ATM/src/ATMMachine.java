
public class ATMMachine{
	
	public static void displayInfo(User user) { //To display the info of user
		System.out.println("Name: " + user.getName());
		System.out.println("Mobile Number: " + user.getMobileNumber());
		System.out.println("Bank Name: " + user.getAccount().getBank().getBankName());
		System.out.println("Available Balance: " + user.getAccount().getAvailableBalance());
		System.out.println();
	}
}