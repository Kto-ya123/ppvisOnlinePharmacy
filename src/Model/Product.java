package Model;

public class Product {
    private int cost;
    private String nameProduct;
    private String description;
    private String manufacturer;
    private int quantityProduct;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufaturer() {
        return manufacturer;
    }

    public void setManufaturer(String manufaturer) {
        this.manufacturer = manufaturer;
    }

    public int getQuantityProduct() {
        return quantityProduct;
    }

    public void setQuantityProduct(int quantityProduct) {
        this.quantityProduct = quantityProduct;
    }
}
