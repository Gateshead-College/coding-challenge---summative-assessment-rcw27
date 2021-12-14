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
        stockList.add("Samsung A52");
        stockList.add("Oppo X3 Neo");
        stockList.add("Oppo A54");

        System.out.println("What would you like to do?");
        System.out.println("1 - View all stock");
        System.out.println("2 - View stock information");
        int input = Integer.parseInt(scn.nextLine());

        switch (input) {
            case 1:
                System.out.println("Our current stock range is:" + stockList);
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
        PhoneA pa = new PhoneA("ID:" + productID + "Manufacturer:" manufacturer + productID + quantityStocked);

    }

    private void showPhoneB() {
        PhoneB pa = new PhoneB(price + manufacturer + productID + quantityStocked);

    }

    private void showPhoneC() {
        PhoneC pa = new PhoneC(price + manufacturer + productID + quantityStocked);

    }
}