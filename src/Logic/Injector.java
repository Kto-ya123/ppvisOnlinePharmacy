package Logic;

import Logic.Container;
import UI.Customer_ui;
import UI.Seller_ui;

public class Injector {
    public Injector(){
        initializeObjects();
    }
    void initializeObjects(){
        Container container = new Container();
        container.customer = new Customer_customer();
        container.manager = new Manager_service();
        container.merchandising = new Merchandising_service();
        container.pricing = new Pricing_service();
        container.workWithBasket = new Basket_service();
        container.seller = new Seller_seller();
        container.customer_ui = new Customer_ui();
        container.seller_ui = new Seller_ui();

    }
}
