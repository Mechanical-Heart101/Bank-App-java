import java.util.Scanner;

public class BankApp
{
    public static void main(String[] args)
    {
        Bank bank = new Bank(); // new bank object
        Scanner scanner = new Scanner(System.in); // new scanner object

        boolean running = true;

        while (running)
        {
            System.out.println("=== Bank Menu ===");
            System.out.println("1. Add Customer");
            System.out.println("2. Remove Customer");
            System.out.println("3. Add Account");
            System.out.println("4. Remove Account");
            System.out.println("5. Find Customer");
            System.out.println("6. Find Account");
            System.out.println("7. Exit");

            int choice = scanner.nextInt(); // read the users choice
            scanner.nextLine();


            switch (choice)
            {
                case 1: // Adding a customer to the bank
                    System.out.println("Customer Name: ");
                    String name = scanner.nextLine();

                    System.out.println("CustomerID: ");
                    String customerID = scanner.nextLine();

                    bank.addCustomer(name, customerID); // using the Bank Classes addcustomer method, add a customer to the customers list

                    break;

                case 2: // Removing a customer from the bank
                    System.out.println("Remove CustomerID: "); // ID of the customer
                    String removeCustomer = scanner.nextLine();

                    bank.removeCustomer(removeCustomer); // Remove the customer
                    
                    break;

                case 3: // This case adds an account to the accounts list in bank.
                    System.out.println("Account Number: ");
                    String newAccountNumber = scanner.nextLine();

                    System.out.println("Insert Balance: ");
                    double newBalance = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Owner: ");
                    String newCustomerID = scanner.nextLine();

                    bank.addAccount(newAccountNumber, newBalance, newCustomerID); // add the new account to the accounts list in bank

                    break;

                case 4: // This removes an account from bank
                    System.out.println("Remove Account Number: ");
                    String accountNumber = scanner.nextLine();

                    bank.removeAccount(accountNumber);

                    break;

                case 5: // This case is to find a customer
                    System.out.println("Find CustomerID: ");
                    String searchCustomerID = scanner.nextLine();

                    Customer search = bank.findCustomer(searchCustomerID);

                    if (search != null)
                    {
                        System.out.println(search);
                    }
                    else
                    {
                        System.out.println("Customer not found!");
                    }

                    break;

                case 6: // This case is to find an account
                    System.out.println("Find Account Number: ");
                    String searchAccountNumber = scanner.nextLine();

                    Account search2 = bank.findAccount(searchAccountNumber);

                    if (search2 != null)
                    {
                        System.out.println(search2);
                    }
                    else
                    {
                        System.out.println("Account not found!");
                    }

                    break;

                case 7: // this case is for exiting the application
                    running = false;
                    break;
            }
        }
        scanner.close(); // close the scanner to prevent memory leaks
    }

}