package controllers;

import models.Stock;

import java.util.ArrayList;
import java.util.Scanner;

public class StockController {

    Scanner scn = new Scanner(System.in);
    ArrayList<Stock> phones = new ArrayList();

    public static void main(String[] args) {
        StockController m = new StockController();
        m.Startup();
        m.printMenu();
    }

    private void Startup() {

        phones.add(new Stock(456, "Apple", 780.50, 12, "iPhone 13"));
        phones.add(new Stock(452, "Samsung", 714.99, 10, "Galaxy S21"));
        phones.add(new Stock(448, "Apple", 389.76, 8, "iPhone SE"));

    }

    private void printMenu() {

        System.out.println("What would you like to do?");
        System.out.println("1 - View all stock");
        System.out.println("2 - View stock information");
        System.out.println("3 - Amend current stock");
        System.out.println("4 - Add a new stock option");
        System.out.println("5 - Remove a stock option");

        int input = Integer.parseInt(scn.nextLine());

        switch (input) {
            case 1:
                for (Stock s : phones) {
                    System.out.println("Our current stock range is:" + s.phoneName);
                }

                System.out.println();
                System.out.println();
                printMenu();

            case 2:
                printStockInfoMenu();
            case 3:
                printStockEditMenu();
            case 4:
                System.out.println("This option is still under construction, please try again later.");
            case 5:
                System.out.println("This option is still under construction, please try again later.");

        }


    }

    private void printStockInfoMenu() {

        System.out.println("Which item of stock would you like to view info for?");
        int Counter = 1;
        for (Stock s : phones) {
            System.out.println(Counter + " - " + s.phoneName);
            Counter++;
        }
        int input = Integer.parseInt(scn.nextLine());

        Stock selectedPhone = null;


        if (input <= phones.size()) {
            selectedPhone = phones.get(input - 1);
        } else {
            System.out.println("Invalid Option.Try again");
            printStockInfoMenu();
        }


        System.out.println("Loading information for  " + selectedPhone.phoneName);
        System.out.println();
        System.out.println("ID: " + selectedPhone.productID + "  Manufacturer: " + selectedPhone.manufacturer +
                "  Price in GBP: " + selectedPhone.price + "  Quantity in stock: " + selectedPhone.quantityStocked);

    }

    private void printStockEditMenu() {

        System.out.println("Which item of stock would you like to edit?");
        int Counter = 1;
        for (Stock s : phones) {
            System.out.println(Counter + " - " + s.phoneName);
            Counter++;
        }
        int input = Integer.parseInt(scn.nextLine());


        Stock selectedPhone = phones.get(input - 1);
        editPhone(selectedPhone);

    }

    private void editPhone(Stock phone) {
        System.out.println("What information would you like to update?");
        System.out.println("1 - Product ID ");
        System.out.println("2 - Manufacturer ");
        System.out.println("3 - Price ");
        System.out.println("4 - Quantity in Stock ");
        System.out.println("5 - Phone Name ");

        int input = Integer.parseInt(scn.nextLine());

        switch (input) {
            case 1:
                System.out.println("Current ID is set as: " + phone.productID);
                System.out.println("What would you like to change this to?");
                int newID = Integer.parseInt(scn.nextLine());
                System.out.println("Are you sure you want to change the ID from " + phone.productID +
                        " to this: " + newID + " Y/N ");
                if (scn.nextLine().equalsIgnoreCase("Y")) {
                    phone.productID = newID;
                    System.out.println("Product ID has now been updated.");
                } else {
                    System.out.println("Changes not saved.");
                }
                System.out.println("Would you like to edit another product? Y/N");
                System.out.println("If no you will be returned to the main menu.");

                if (scn.nextLine().equalsIgnoreCase("Y")) {
                    printStockEditMenu();
                } else {
                    printMenu();
                }


                break;
            case 2:
                System.out.println("Current Manufacturer is set as: " + phone.manufacturer);
                System.out.println("What would you like to change this to?");
                String newManufacturer = (scn.nextLine());
                System.out.println("Are you sure you want to change the Manufacturer from " + phone.manufacturer +
                        " to this: " + newManufacturer + " Y/N ");
                if (scn.nextLine().equalsIgnoreCase("Y")) {
                    phone.manufacturer = newManufacturer;
                    System.out.println("Manufacturer has now been updated.");
                } else {
                    System.out.println("Changes not saved.");
                }
                System.out.println("Would you like to edit another product? Y/N");
                System.out.println("If no you will be returned to the main menu.");

                if (scn.nextLine().equalsIgnoreCase("Y")) {
                    printStockEditMenu();
                } else {
                    printMenu();
                }

                break;
            case 3:
                System.out.println("Current Price is set as: " + phone.price);
                System.out.println("What would you like to change this to?");
                double newPrice = Double.parseDouble(scn.nextLine());
                System.out.println("Are you sure you want to change the Price from " + phone.productID +
                        " to this: " + newPrice + " Y/N ");
                if (scn.nextLine().equalsIgnoreCase("Y")) {
                    phone.price = newPrice;
                    System.out.println("Price has now been updated.");
                } else {
                    System.out.println("Changes not saved.");
                }
                System.out.println("Would you like to edit another product? Y/N");
                System.out.println("If no you will be returned to the main menu.");

                if (scn.nextLine().equalsIgnoreCase("Y")) {
                    printStockEditMenu();
                } else {
                    printMenu();
                }

                break;
            case 4:
                System.out.println("Current Quantity in Stock is set as: " + phone.quantityStocked);
                System.out.println("What would you like to change this to?");
                int newQuantity = Integer.parseInt(scn.nextLine());
                System.out.println("Are you sure you want to change the quantity in stock from " + phone.quantityStocked +
                        " to this: " + newQuantity + " Y/N ");
                if (scn.nextLine().equalsIgnoreCase("Y")) {
                    phone.quantityStocked = newQuantity;
                    System.out.println("Quantity in stock has now been updated.");
                } else {
                    System.out.println("Changes not saved.");
                }
                System.out.println("Would you like to edit another product? Y/N");
                System.out.println("If no you will be returned to the main menu.");

                if (scn.nextLine().equalsIgnoreCase("Y")) {
                    printStockEditMenu();
                } else {
                    printMenu();
                }

                break;
            case 5:
                System.out.println("Current Phone Name is set as: " + phone.phoneName);
                System.out.println("What would you like to change this to?");
                String newName = (scn.nextLine());
                System.out.println("Are you sure you want to change the phone name from " + phone.phoneName +
                        " to this: " + newName + " Y/N ");
                if (scn.nextLine().equalsIgnoreCase("Y")) {
                    phone.phoneName = newName;
                    System.out.println("Phone Name has now been updated.");
                } else {
                    System.out.println("Changes not saved.");
                }
                System.out.println("Would you like to edit another product? Y/N");
                System.out.println("If no you will be returned to the main menu.");

                if (scn.nextLine().equalsIgnoreCase("Y")) {
                    printStockEditMenu();
                } else {
                    printMenu();
                }
                break;
            default:
                System.out.println("Invalid option. Please try again");
                printStockEditMenu();

        }


    }

}



