package Logic;

import Model.Product;

public class Pricing_service {
    void setPriceOfProduct(int cost ,Product product){
        product.setCost(cost);
    }
    int quantityProductsPharmacy(int cost, Product product){
        return product.getQuantityProduct();
    }
}
