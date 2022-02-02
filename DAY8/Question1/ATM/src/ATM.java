import java.util.*;

public class ATM {
    private long balanceInATM; // Balance in ATM
    private Map<Integer, Integer> availableNotesInATM; // Available notes in ATM
    private int notesOf100 = 100; // Notes Value
    private int notesOf200 = 200; // Notes Value
    private int notesOf500 = 500; // Notes Value
    private int notesOf2000 = 2000; // Notes Value

    ATM() { // Constructor
        this.balanceInATM = 0;
        this.availableNotesInATM = new HashMap<Integer, Integer>() {
            {
                put(notesOf100, 10);
                put(notesOf200, 10);
                put(notesOf500, 10);
                put(notesOf2000, 10);
            }
        };
    }

    // Update Notes in ATM
    public void updateNotesInATM(int denomination, int numberOfDenominations) {
        this.availableNotesInATM.put(denomination, this.availableNotesInATM.get(denomination) + numberOfDenominations);
    }

    // Get Balance in the ATM
    public long getTotalBalanceInATM() {
        return balanceInATM;
    }

    // Available Notes in ATM
    public Map<Integer, Integer> getAvailableNotesInATM() {
        return availableNotesInATM;
    }

    // Withdraww Cash from Atm
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
        if (this.availableNotesInATM.get(notesOf2000) < currentNotesOf2000) {
            currentNotesOf2000 = this.availableNotesInATM.get(notesOf2000);
        }
        withdrawNotesType.put(notesOf2000, currentNotesOf2000);
        tempAmount = tempAmount - (currentNotesOf2000 * notesOf2000);
        updateNotesInATM(notesOf2000, currentNotesOf2000);

        // 500 Notes
        int currentNotesOf500 = (int) (tempAmount / notesOf500);
        if (this.availableNotesInATM.get(notesOf500) < currentNotesOf500) {
            currentNotesOf500 = this.availableNotesInATM.get(notesOf500);
        }
        withdrawNotesType.put(notesOf500, currentNotesOf500);
        tempAmount = tempAmount - (currentNotesOf500 * notesOf500);
        updateNotesInATM(notesOf500, currentNotesOf500);

        // 200 Notes
        int currentNotesOf200 = (int) (tempAmount / notesOf200);
        if (this.availableNotesInATM.get(notesOf200) < currentNotesOf200) {
            currentNotesOf200 = this.availableNotesInATM.get(notesOf200);
        }
        withdrawNotesType.put(notesOf200, currentNotesOf200);
        tempAmount = tempAmount - (currentNotesOf200 * notesOf200);
        updateNotesInATM(notesOf200, currentNotesOf200);

        // 100 Notes
        int currentNotesOf100 = (int) (tempAmount / notesOf100);
        if (this.availableNotesInATM.get(notesOf100) < currentNotesOf100) {
            currentNotesOf100 = this.availableNotesInATM.get(notesOf100);
        }
        withdrawNotesType.put(notesOf100, currentNotesOf100);
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
