package MarketManagementSystem;

/**
 * This class is for each seller
 * It keeps track of the properties such as :
 * the id of the seller
 * the name of the seller
 * The currentBalance which increases as the customers buys
 */
public class Sellers {
    private int id;
    private String sellerName;
    private double currentBalance;

    /**
     * This is creating a new constructor for seller
     * @param id this is the id of the seller which is unique
     * @param sellerName this is the name of the teacher which may not be unique
     */
    public Sellers(int id, String sellerName){
         this.id = id;
         this.sellerName = sellerName;
         this.currentBalance = 0;
    }

    /**
     * this returns an addition of the seller current balance and what he sold
     * @param credit this is the amount for the goods the seller sold
     */
    public double getCurrentBalance(double credit) {
        return currentBalance += credit;
    }

    /**
     * this sets value for the current balance of seller
     * @param currentBalance this is the seller current balance
     */
    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    /**
     *
     * @return returns the seller id
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return returns the sellers name
     */
    public String getSellerName() {
        return sellerName;
    }

}

