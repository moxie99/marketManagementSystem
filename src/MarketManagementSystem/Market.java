package MarketManagementSystem;

import java.util.List;

/**
 * The market has many sellers
 * The market also has many customers
 * Since there will be multiple sellers and buyers which will increase in number
 * The size of the customers and sellers is unknown, hence the way is arraylist
 */

public class Market {

    private List<Sellers> sellers;
    private List<Customers> customers;
    private double totalMoneyInCirculation;
    private double totalDebt;

    /**
     * This is a constructor for generating sellers and customers list
     * @param sellers this is the list for sellers
     * @param customers this is the list for customers
     * the market is starting with zero for total Money in circulation as well as total debt
     */
    public Market(List<Sellers> sellers, List<Customers> customers){
        this.customers = customers;
        this.sellers = sellers;
        this.totalDebt = 0;
        this.totalMoneyInCirculation = 0;
    }

    /**
     *
     * @return the list of sellers in the market
     */
    public List<Sellers> getSellers() {
        return sellers;
    }

    /**
     * adds a seller to the list of sellers in the market
     * @param seller this is the new seller just coming into the market
     */
    public void addSellers(Sellers seller) {
        sellers.add(seller);
    }

    /**
     *
     * @return a list of customers in the market
     */
    public List<Customers> getCustomers() {
        return customers;
    }

    /**
     * adds a new customer coming to the market
     * @param customer : a new customer coming to the market
     */
    public void addCustomers(Customers customer) {
        customers.add(customer);
    }


    /**
     *
     * @return the updated money in circulation in the market
     */
    public double getTotalMoneyInCirculation() {
        return totalMoneyInCirculation;
    }

    /**
     *
     * @param moneyInCirculation : this is the money paid by customers for the goods just bought
     */
    public void addToTotalMoneyInCirculation(double moneyInCirculation) {
        this.totalMoneyInCirculation += moneyInCirculation;
    }

    /**
     *
     * @return the total deficit by all customers
     */
    public double getTotalDebt() {
        return totalDebt;
    }

    /**
     *
     * @param currentDebt: this is the present debt of customers
     */
    public void addToTotalDebt(double currentDebt) {
        this.totalDebt += currentDebt;
    }

}
