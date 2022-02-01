import java.util.*;

public class ATM {
    private long balanceInATM; // To hold the total balanceInATM in ATM
    private Bank bank; // To hold the bank to which the ATM belongs
    private Map<Integer, Integer> availableNotes; // To hold the available denominations in the ATM
    private static final int notesOf100 = 100;
    private static final int notesOf200 = 200;
    private static final int notesOf500 = 500;
    private static final int notesOf2000 = 2000;

    ATM(Bank bank) { // Constructor
        this.balanceInATM = 0;
        this.bank = bank;
        this.availableNotes = new HashMap<Integer, Integer>() {
            {
                put(notesOf100, 0);
                put(notesOf200, 0);
                put(notesOf500, 0);
                put(notesOf2000, 0);
            }
        };
    }

    public long getTotalBalanceInATM() { // To get the total balanceInATM available in the ATM
        return balanceInATM;
    }

    public Bank getBank() { // To get the bank to which the ATM belongs
        return bank;
    }

    public Map<Integer, Integer> getAvailableNotes() { // To get the total available denominations
        return availableNotes;
    }

    public void rechargeATM(Map<Integer, Integer> currentNotes) { // To add cash to ATM (which can only be done by
                                                                  // bank manager)
        int currentNotesOf100 = currentNotes.get(notesOf100); // To get the toped up first
                                                               // denominations(100 notes)
        int currentNotesOf200 = currentNotes.get(notesOf200); // To get the toped up second
                                                                // denominations(200 notes)
        int currentNotesOf500 = currentNotes.get(notesOf500); // To get the toped up third
                                                               // denominations(500 notes)
        int currentNotesOf2000 = currentNotes.get(notesOf2000); // To get the toped up fourth
                                                                 // denominations(2000 notes)

        long totalAddedMoney = (currentNotesOf100 * notesOf100)
                + (currentNotesOf200 * notesOf200) +
                (currentNotesOf500 * notesOf500)
                + (currentNotesOf2000 * notesOf2000); // Getting the total toped up amount

        this.balanceInATM = this.balanceInATM + totalAddedMoney; // Updating ATM balanceInATM

        
        updateNotesInATM(notesOf100, currentNotesOf100);
        updateNotesInATM(notesOf200, currentNotesOf200);
        updateNotesInATM(notesOf500, currentNotesOf500);
        updateNotesInATM(notesOf2000, currentNotesOf2000);
    }

    public Map<Integer, Integer> withdrawCashFromATM(long amount, Account account) { // To withdraw cash from ATM
        if (account.getAvailableBalance() < amount) { // If the user has insufficient balanceInATM in his/her account
            System.out.println("Your account has insufficient balanceInATM");
            return null;
        } else if (this.balanceInATM < amount) { // If the ATM has insufficient balanceInATM
            System.out.println("The ATM has insufficient balanceInATM");
            return null;
        }

        // To hold the denominations which will be withdrawn from the ATM
        Map<Integer, Integer> withdrawNotesType = new HashMap<Integer, Integer>();
        withdrawNotesType.put(notesOf100, 0);
        withdrawNotesType.put(notesOf200, 0);
        withdrawNotesType.put(notesOf500, 0);
        withdrawNotesType.put(notesOf2000, 0);

        long remainingAmount = amount;

        int currentNotesOf2000 = (int) (remainingAmount / notesOf2000);
        if (this.availableNotes.get(notesOf2000) < currentNotesOf2000) {
            currentNotesOf2000 = this.availableNotes.get(notesOf2000);
        }
        withdrawNotesType.put(notesOf2000, currentNotesOf2000);
        remainingAmount = remainingAmount - (currentNotesOf2000 * notesOf2000);

        int currentNotesOf500 = (int) (remainingAmount / notesOf500);
        if (this.availableNotes.get(notesOf500) < currentNotesOf500) {
            currentNotesOf500 = this.availableNotes.get(notesOf500);
        }
        withdrawNotesType.put(notesOf500, currentNotesOf500);
        remainingAmount = remainingAmount - (currentNotesOf500 * notesOf500);

        int currentNotesOf200 = (int) (remainingAmount / notesOf200);
        if (this.availableNotes.get(notesOf200) < currentNotesOf200) {
            currentNotesOf200 = this.availableNotes.get(notesOf200);
        }
        withdrawNotesType.put(notesOf200, currentNotesOf200);
        remainingAmount = remainingAmount - (currentNotesOf200 * notesOf200);

        int currentNotesOf100 = (int) (remainingAmount / notesOf100);
        withdrawNotesType.put(notesOf100, currentNotesOf100);
        if (this.availableNotes.get(notesOf100) < currentNotesOf100) {
            currentNotesOf100 = this.availableNotes.get(notesOf100);
        }
        remainingAmount = remainingAmount - (currentNotesOf100 * notesOf100);

        if (remainingAmount != 0) {
            System.out.println("The ATM do not have the required denominations");
            return null;
        }

        
        updateNotesInATM(notesOf100, currentNotesOf100);
        updateNotesInATM(notesOf200, currentNotesOf200);
        updateNotesInATM(notesOf500, currentNotesOf500);
        updateNotesInATM(notesOf2000, currentNotesOf2000);

        account.debit(amount); 

        return withdrawNotesType;
    }

    public void updateNotesInATM(int denomination, int numberOfDenominations) { // To update denominations in the ATM
        this.availableNotes.put(
                denomination, this.availableNotes.get(denomination) + numberOfDenominations);
    }
}