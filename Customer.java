public class Customer // this is a short class representing the customer object. To be updated later.
{
    private final String customerID;
    private String name;

    public Customer(String name, String customerID)
    {
        this.name = name;
        this.customerID = customerID;
    }

    /**
     * This is the getter method for the customer name
     * @return String customer name
     */
    public String getCustomerName()
    {
        return name;
    }


    /**
     * This is the method to get the customer ID
     * @return String customerID
     */
    public String getCustomerID()
    {
        return customerID;
    }

    /**
     * This is the tostring method for the customer class
     */
    @Override
    public String toString()
    {
        return "Name : " + getCustomerName() +
            ", Customer ID: " + getCustomerID(); 
    }


}