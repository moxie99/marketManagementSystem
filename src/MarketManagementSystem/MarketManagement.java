package MarketManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class MarketManagement {

    public static void main(String[] args) {
        Sellers shopOne = new Sellers(123, "Adegbite Omoronke");
        Sellers shopTwo = new Sellers(123, "Aderombi Ajisola");
        Sellers shopThree = new Sellers(123, "Chisom Eruka");
        Sellers shopFour = new Sellers(123, "Ifunaya Somto");
        Sellers shopFive = new Sellers(123, "Idiebube Romzy");

        List<Sellers> sellersList = new ArrayList<>();
        sellersList.add(shopOne);
        sellersList.add(shopTwo);
        sellersList.add(shopThree);
        sellersList.add(shopFour);
        sellersList.add(shopFive);


        Customers customerOne = new Customers(234, "Omolade Ratzy", 123, 3450);
        Customers customerTwo = new Customers(234, "Omolade Ratzy", 123, 3450);
        Customers customerThree = new Customers(234, "Omolade Ratzy", 123, 3450);
        Customers customerFour = new Customers(234, "Omolade Ratzy", 123, 3450);

        List<Customers> customersList = new ArrayList<>();
        customersList.add(customerOne);
        customersList.add(customerTwo);
        customersList.add(customerThree);
        customersList.add(customerFour);

        Market owode = new Market(sellersList, customersList);

        ;

        System.out.println("Owode market has " + owode.getTotalMoneyInCirculation() + "naira in circulation");
    }
}
