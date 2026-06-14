public class Account
{
    private final String accountNumber;
    private double balance;
    private Customer owner;

    public Account(String accountNumber, double balance, Customer owner)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }

    /**
     * This is the getter method for accountNumber
     * @return String accountNumber
     */
    public String getAccountNumber()
    {
        return accountNumber;
    }

    /**
     * This method returns the balance in the account
     * @return Double balance
     */
    public double getBalance()
    {
        return balance;
    }

    /**
     * This method returns the accounts customer owner
     * @return Customer owner
     */
    public Customer getOwner()
    {
        return owner;
    }

    /**
     * This is the toString method for the account class
     * @return String toString
     */
    @Override
    public String toString()
    {
        return "Account number: " + getAccountNumber() +
                ", Balance: " + getBalance() +
                ", Owner: " + getOwner();
    }

}