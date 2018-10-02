import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        this.accountType = accountCategory;
        Bank.totalAccounts++;
    }

    public double getBalance(){
        return this.accountBalance;
    }
    public void setBalance(final double newBal){
        this.accountBalance = newBal;
    }
    public void setName(final String newName){
        this.ownerName = newName;
    }
    public String getName(){
        return this.ownerName;
    }
}
