package controllers;

import models.Stock;

import java.util.ArrayList;
import java.util.Scanner;

public class StockController {

    Scanner scn = new Scanner(System.in);
    ArrayList <Stock> phones = new ArrayList();

    public static void main(String[] args) {
        StockController m = new StockController();
        m.Startup();
        m.printMenu();
    }

    private void Startup() {

        phones.add(new Stock(456,"Apple",780.50,12, "iPhone 13"));
        phones.add(new Stock(452,"Samsung",714.99,10, "Galaxy S21"));
        phones.add(new Stock(448,"Apple",389.76,8, "iPhone SE"));

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
                for(Stock s: phones){
                    System.out.println("Our current stock range is:" + s.phoneName);
                }

                System.out.println();
                System.out.println();
                printMenu();

            case 2:
                System.out.println("Please wait.");
                printStockInfoMenu();
            case 3:
                System.out.println("This option is still under construction, please try again later.");
            case 4:
                System.out.println("This option is still under construction, please try again later.");
            case 5:
                System.out.println("This option is still under construction, please try again later.");

        }


    }

    private void printStockInfoMenu() {

        System.out.println("Which item of stock would you like to view info for?");
        int Counter = 1;
        for (Stock s : phones){
            System.out.println(Counter + " - " + s.phoneName );
            Counter ++;
        }
        int input = Integer.parseInt(scn.nextLine());

        Stock selectedPhone = null;


        if (input <= phones.size()){
            selectedPhone = phones.get(input -1);
        }
        else {
            System.out.println("Invalid Option.Try again");
            printStockInfoMenu();
        }


        System.out.println("Loading information for  " + selectedPhone.phoneName );
        System.out.println();
        System.out.println("ID: " + selectedPhone.productID + "  Manufacturer: " + selectedPhone.manufacturer +
                "  Price in GBP: " + selectedPhone.price + "  Quantity in stock: " + selectedPhone.quantityStocked);

    }

    private void printStockEditMenu() {

        System.out.println("Which item of stock would you like to edit?");
            int Counter = 1;
            for (Stock s : phones){
                System.out.println(Counter + " - " + s.phoneName );
                Counter ++;
            }
        int input = Integer.parseInt(scn.nextLine());



            Stock selectedPhone = phones.get(input -1);
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
                System.out.println("Current ID is set as: " + phone.productID );
                System.out.println("What would you like to change this to?");
                int newID = Integer.parseInt(scn.nextLine());
                System.out.println("Are you sure you want to change the ID from " + phone.productID +
                        " to this: " + newID);
                if (scn.nextLine().equalsIgnoreCase("Y")){
                    phone.productID = newID;
                    System.out.println("Product ID has now been updated.");
                }
                else {
                    System.out.println("Changes not saved.");
                }


                //recall method showPhoneA(); but edit values before displaying

                /*need a new scanner
                put input in to the allocated field in Array
                then redisplay as updated showPhone();  ??
                 */
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            default:
                System.out.println("Invalid option. Please try again");
                printStockEditMenu();

        }


    }

    private void editPhoneB() {

    }

    private void editPhoneC() {

    }


}

