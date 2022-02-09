package MarketManagementSystem;

/**
 * created by Adeolu Oluwasegun David
 * This was inspired by an object oriented programming project by Rakshith Vasudev
 * This class is basically for keeping customers details.
 * The details include customers name, customers id, shop customer patronises and amount to pay as well amount
 * paid
 */
public class Customers {

    private int id;
    private String customerName;
    private int shopPatronisedId;
    private double amountDeducted;
    private double amountTotal;

    /**
     *  This constructor is to pass the parameters for each customer
     *  The amount deducted is set to 0 at the onset, and it gets updated
     * @param id customer unique number
     * @param customerName customers name
     * @param shopPatronisedId unique name of shop customer patronised
     * @param amountTotal the amount the customer paid into his account to be deducted after every purchase
     */
    public Customers(int id, String customerName, int shopPatronisedId, int amountTotal){
        this.id = id;
        this.customerName =customerName;
        this.shopPatronisedId = shopPatronisedId;
        this.amountDeducted = 0;
        this.amountTotal = amountTotal;
    }
    /**
     *
     * @param amountDeducted this is the amount the customers is to pay after every transaction
     */
    public void setAmountDeducted(double amountDeducted){
        this.amountDeducted = amountDeducted;
    }

    /**
     *
     * @return returns student's id
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return returns shop customer patronised
     */
    public int getShopPatronisedId() {
        return shopPatronisedId;
    }

    /**
     *
     * @return returns customer's name
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     *
     * @param debit amount to be deducted from customers account
     * @return returns total amount to be deducted from customer's account.
     */
    public double getAmountDeducted(double debit) {
        return amountDeducted + debit;
    }

}
