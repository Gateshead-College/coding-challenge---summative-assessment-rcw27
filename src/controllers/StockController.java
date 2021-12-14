package controllers;

import java.util.ArrayList;
import java.util.Scanner;

public class StockController {

    Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        StockController m = new StockController();
        m.printMenu();
    }


    private void printMenu() {

        ArrayList stockList = new ArrayList();
        stockList.add("iPhone 13");
        stockList.add("iPhone SE");
        stockList.add("Samsung S21");


        System.out.println("What would you like to do?");
        System.out.println("1 - View all stock");
        System.out.println("2 - View stock information");
        int input = Integer.parseInt(scn.nextLine());

        switch (input) {
            case 1:
                System.out.println("Our current stock range is:" + stockList);
                System.out.println();
                System.out.println();
                printMenu();
            case 2:
                System.out.println("Please wait.");
                printStockInfoMenu();
        }


    }

    private void printStockInfoMenu() {

        System.out.println("Which item of stock would you like to view info for?");
        System.out.println("1 - iPhone 13");
        System.out.println("2 - iPhone SE");
        System.out.println("3 - Galaxy S21");
        int input = Integer.parseInt(scn.nextLine());

        switch (input) {
            case 1:
                showPhoneA();
                break;
            case 2:
                showPhoneB();
                break;
            case 3:
                showPhoneC();
                break;
            default:
                System.out.println("Invalid stock option. Please try again");
                printStockInfoMenu();

        }
    }


    public int productID;
    public String manufacturer;
    public Double price;
    public int quantityStocked;

    public void Phone(int productID, String manufacturer, Double price, int quantityStocked) {

        this.productID = productID;
        this.manufacturer = manufacturer;
        this.price = price;
        this.quantityStocked = quantityStocked;

    }

    private void showPhoneA() {
        productID = 456;
        manufacturer = "Apple";
        price = 780.50;
        quantityStocked = 12;

        System.out.println("Loading information for iPhone 13");
        System.out.println();
        System.out.println("ID: " + productID + "  Manufacturer: " + manufacturer + "  Price in GBP: " + price + "  Quantity in stock: " + quantityStocked);

    }

    private void showPhoneB() {
        productID = 448;
        manufacturer = "Apple";
        price = 389.76;
        quantityStocked = 8;

        System.out.println("Loading information for iPhone SE");
        System.out.println();
        System.out.println("ID: " + productID + "  Manufacturer: " + manufacturer + "  Price in GBP: " + price + "  Quantity in stock: " + quantityStocked);

    }

    private void showPhoneC() {
        productID = 452;
        manufacturer = "Samsung";
        price = 714.99;
        quantityStocked = 10;
        System.out.println("Loading information for Galaxy S21");
        System.out.println();
        System.out.println("ID: " + productID + "  Manufacturer: " + manufacturer + "  Price in GBP: " + price + "  Quantity in stock: " + quantityStocked);

    }


}

