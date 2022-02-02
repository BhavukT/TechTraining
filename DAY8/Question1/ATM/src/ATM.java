import java.util.*;

public class ATM {
    private long balanceInATM;
    private Map<Integer, Integer> availableNotes;
    private int notesOf100 = 100;
    private int notesOf200 = 200;
    private int notesOf500 = 500;
    private int notesOf2000 = 2000;

    ATM(Bank bank) { // Constructor
        this.balanceInATM = 0;
        this.availableNotes = new HashMap<Integer, Integer>() {
            {
                put(notesOf100, 10);
                put(notesOf200, 10);
                put(notesOf500, 10);
                put(notesOf2000, 10);
            }
        };
    }

    //Update Notes in ATM
    public void updateNotesInATM(int denomination, int numberOfDenominations) {
        this.availableNotes.put(denomination, this.availableNotes.get(denomination) + numberOfDenominations);
    }

    //Get Balance in the ATM
    public long getTotalBalanceInATM() {
        return balanceInATM;
    }

    //Available Notes in ATM
    public Map<Integer, Integer> getAvailableNotes() {
        return availableNotes;
    }

    //Withdraww Cash from Atm
    public Map<Integer, Integer> withdrawCashFromATM(long amount, Account account) {

        if (account.getAvailableBalance() < amount) {
            System.out.println("Your Bank account has insufficient balance");
            return null;
        } else if (this.balanceInATM < amount) {
            System.out.println("ATM machine has insufficient balanceInATM");
            return null;
        }

        Map<Integer, Integer> withdrawNotesType = new HashMap<Integer, Integer>();
        withdrawNotesType.put(notesOf100, 0);
        withdrawNotesType.put(notesOf200, 0);
        withdrawNotesType.put(notesOf500, 0);
        withdrawNotesType.put(notesOf2000, 0);

        long tempAmount = amount;

        // 2000 Notes
        int currentNotesOf2000 = (int) (tempAmount / notesOf2000);
        if (this.availableNotes.get(notesOf2000) < currentNotesOf2000) {
            currentNotesOf2000 = this.availableNotes.get(notesOf2000);
        }
        withdrawNotesType.put(notesOf2000, currentNotesOf2000);
        tempAmount = tempAmount - (currentNotesOf2000 * notesOf2000);
        updateNotesInATM(notesOf2000, currentNotesOf2000);

        // 500 Notes
        int currentNotesOf500 = (int) (tempAmount / notesOf500);
        if (this.availableNotes.get(notesOf500) < currentNotesOf500) {
            currentNotesOf500 = this.availableNotes.get(notesOf500);
        }
        withdrawNotesType.put(notesOf500, currentNotesOf500);
        tempAmount = tempAmount - (currentNotesOf500 * notesOf500);
        updateNotesInATM(notesOf500, currentNotesOf500);

        // 200 Notes
        int currentNotesOf200 = (int) (tempAmount / notesOf200);
        if (this.availableNotes.get(notesOf200) < currentNotesOf200) {
            currentNotesOf200 = this.availableNotes.get(notesOf200);
        }
        withdrawNotesType.put(notesOf200, currentNotesOf200);
        tempAmount = tempAmount - (currentNotesOf200 * notesOf200);
        updateNotesInATM(notesOf200, currentNotesOf200);

        // 100 Notes
        int currentNotesOf100 = (int) (tempAmount / notesOf100);
        withdrawNotesType.put(notesOf100, currentNotesOf100);
        if (this.availableNotes.get(notesOf100) < currentNotesOf100) {
            currentNotesOf100 = this.availableNotes.get(notesOf100);
        }
        tempAmount = tempAmount - (currentNotesOf100 * notesOf100);
        updateNotesInATM(notesOf100, currentNotesOf100);

        // Check for Remaining Amount
        if (tempAmount != 0) {
            System.out.println("The ATM do not have the required Cash");
            return null;
        }

        account.debit(amount);

        return withdrawNotesType;
    }

    // Rechage Atm With Cash
    public void rechargeATM(Map<Integer, Integer> currentNotes) {

        int currentNotesOf100 = currentNotes.get(notesOf100);
        int currentNotesOf200 = currentNotes.get(notesOf200);
        int currentNotesOf500 = currentNotes.get(notesOf500);
        int currentNotesOf2000 = currentNotes.get(notesOf2000);

        long totalAddedMoney = (currentNotesOf100 * notesOf100) + (currentNotesOf200 * notesOf200)
                + (currentNotesOf500 * notesOf500) + (currentNotesOf2000 * notesOf2000);

        this.balanceInATM = this.balanceInATM + totalAddedMoney;

        updateNotesInATM(notesOf100, currentNotesOf100);
        updateNotesInATM(notesOf200, currentNotesOf200);
        updateNotesInATM(notesOf500, currentNotesOf500);
        updateNotesInATM(notesOf2000, currentNotesOf2000);
    }

}   