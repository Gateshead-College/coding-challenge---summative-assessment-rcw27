package models;


public class Stock {


    public int productID;
    public String manufacturer;
    public Double price;
    public int quantityStocked;
    public String phoneName;

    public Stock(int productID, String manufacturer, Double price, int quantityStocked, String phoneName) {
        this.productID = productID;
        this.manufacturer = manufacturer;
        this.price = price;
        this.quantityStocked = quantityStocked;
        this.phoneName = phoneName;
    }
}


