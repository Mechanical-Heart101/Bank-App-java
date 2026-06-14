import java.util.ArrayList;

public class Bank
{
    private ArrayList<Customer> customers;
    private ArrayList<Account> accounts;

    public Bank()
    {
        customers = new ArrayList<Customer>(); // stores the customer objects
        accounts = new ArrayList<Account>(); // stores the account objects

    }

    /**
     * This method adds a customer object to the list
     * @param String name
     * @param String customerID
     */
    public void addCustomer(String name, String customerID)
    {
        Customer newCustomer = new Customer(name, customerID);
        customers.add(newCustomer);
        System.out.println("Customer successfully added!");
    }

    /**
     * This method is meant to remove a designsted customer from the arraylist customers
     * @param String customerID of the object to remove
     */
    public void removeCustomer(String customerID)
    {
        Customer removeCustomer = findCustomer(customerID);

        if (removeCustomer == null)
        {
            System.out.println("A customer with that ID does not exist.");
        }
        else
        {
            customers.remove(removeCustomer); // remove the found customer from the list
            System.out.println("Customer removed!");
        }
    }

    /**
     * This is the method meant to fins customer objects
     * @param String customerID
     * @return Customer customer
     */
    public Customer findCustomer(String customerID)
    {
        for (Customer customer : customers)
        {
            if (customer.getCustomerID().equals(customerID))
            {
                return customer;
            }
        }
        return null;
    }

    /**
     * This is the method for adding account objects to the list
     * @param String accountNumber
     * @param int balance
     * @param String owner
     */
    public void addAccount(String accountNumber, double balance, String customerID)
    {
        Customer owner = findCustomer(customerID);

        if (owner == null)
        {
            System.out.println("Customer not found!");
            return;
        }

        Account newAccount = new Account(accountNumber, balance, owner); // create a new account object
        accounts.add(newAccount); // add it to the accounts list
        System.out.println("Account successfully created!");
    }

    /**
     * This is the remove acount method
     * @param String accountNumber
     */
    public void removeAccount(String accountNumber)
    {
        Account removeAccount = findAccount(accountNumber);
        if (removeAccount == null)
        {
            System.out.println("This account does not exist.");
        }
        else
        {
            accounts.remove(removeAccount);
            System.out.println("Account removal successful!");
        }
    }

    /**
     * This is the findaccount method
     * @param String accountNumber
     * @return Account account
     */
    public Account findAccount(String accountNumber)
    {
        for (Account account : accounts)
        {
            if (account.getAccountNumber().equals(accountNumber))
            {
                return account;
            }
        }
        return null;
    }

    /** 
     * This is the toString method for the bank class
     * @return String toString
     */
    @Override
    public String toString()
    {
        return "Customers: " + customers.size() +
        ", Accounts: " + accounts.size();
    }

}