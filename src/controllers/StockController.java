package controllers;

import models.Stock;
import models.User;
import views.LoginView;

import java.util.ArrayList;
import java.util.Scanner;

public class StockController {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";

    Scanner scn = new Scanner(System.in);
    ArrayList<Stock> phones = new ArrayList();

    public static void main(String[] args) {
        StockController m = new StockController();
        m.Startup();
        m.createUsers();
    }


    private void Startup() {

        phones.add(new Stock(456, "Apple", 780.50, 12, "iPhone 13"));
        phones.add(new Stock(452, "Samsung", 714.99, 10, "Galaxy S21"));
        phones.add(new Stock(448, "Apple", 389.76, 8, "iPhone SE"));

    }


    private void createUsers() {
        users = new ArrayList<>();
        users.add(new User("Jan", "Lewis", 1234, "JLew1", "JanPass1", true));
        users.add(new User("Fran", "Brewis", 1235, "FBrew1", "FranPass1", false));
        users.add(new User("Stan", "Chewis", 1236, "SChew1", "StanPass1", false));
        LoginView lv = new LoginView();
        lv.displayLoginScreen();

    }

    void printMenu() {

        System.out.println("What would you like to do?");
        System.out.println("1 - View all stock");
        System.out.println("2 - View stock information");
        System.out.println("3 - Amend current stock");
        System.out.println("4 - Add a new stock option");
        System.out.println("5 - Remove a stock option");
        System.out.println(ANSI_RED + "6 - Exit" + ANSI_RESET);

        int input = Integer.parseInt(scn.nextLine());

        switch (input) {
            case 1:
                for (Stock s : phones) {
                    System.out.println(ANSI_CYAN + "Our current stock range is:" + s.phoneName + ANSI_RESET);
                }

                System.out.println();
                System.out.println();
                printMenu();

            case 2:
                printStockInfoMenu();
            case 3:
                printStockEditMenu();
            case 4:
                printStockRemoveMenu();
            case 5:
                System.out.println(ANSI_RED + "This option is still under construction, please try again later."
                        + ANSI_RESET);
                System.out.println();
                System.out.println();
                printMenu();
            case 6:
                System.exit(0);

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
            System.out.println(ANSI_RED + "Invalid Option.Try again" + ANSI_RESET);
            printStockInfoMenu();
        }


        System.out.println("Loading information for  " + selectedPhone.phoneName);
        System.out.println();
        System.out.println(ANSI_CYAN + "ID: " + selectedPhone.productID + "  Manufacturer: "
                + selectedPhone.manufacturer + "  Price in GBP: " + selectedPhone.price +
                "  Quantity in stock: " + selectedPhone.quantityStocked + ANSI_RESET);
        System.out.println();
        System.out.println();
        System.out.println("Would you like to view another product? Y/N");
        System.out.println("If no you will be returned to the main menu.");
        System.out.println();

        if (scn.nextLine().equalsIgnoreCase("Y")) {
            printStockInfoMenu();
        } else {
            printMenu();
        }
    }

    private void printStockEditMenu() {

        System.out.println("Which item of stock would you like to edit?");
        System.out.println();
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
        System.out.println(ANSI_RED + "6 - Exit" + ANSI_RESET);
        System.out.println();

        int input = Integer.parseInt(scn.nextLine());

        switch (input) {
            case 1:
                System.out.println("Current ID is set as: " + ANSI_BLUE + phone.productID + ANSI_RESET);
                System.out.println("What would you like to change this to?");
                int newID = Integer.parseInt(scn.nextLine());
                System.out.println("Are you sure you want to change the ID from " + ANSI_BLUE + phone.productID
                        + ANSI_RESET + " to this: " + ANSI_CYAN + newID + ANSI_RESET + " Y/N ");
                if (scn.nextLine().equalsIgnoreCase("Y")) {
                    phone.productID = newID;
                    System.out.println("Product ID has now been updated.");
                    System.out.println();
                    System.out.println();
                } else {
                    System.out.println("Changes not saved.");
                    System.out.println();
                    System.out.println();
                }
                System.out.println("Would you like to edit another product? Y/N");
                System.out.println("If no you will be returned to the main menu.");
                System.out.println();

                if (scn.nextLine().equalsIgnoreCase("Y")) {
                    System.out.println();
                    printStockEditMenu();
                } else {
                    System.out.println();
                    printMenu();
                }


                break;
            case 2:
                System.out.println("Current Manufacturer is set as: " + ANSI_BLUE + phone.manufacturer + ANSI_RESET);
                System.out.println();
                System.out.println("What would you like to change this to?");
                System.out.println();
                String newManufacturer = (scn.nextLine());
                System.out.println("Are you sure you want to change the Manufacturer from " + ANSI_BLUE +
                        phone.manufacturer + ANSI_RESET + " to this: "
                        + ANSI_CYAN + newManufacturer + ANSI_RESET + " Y/N ");
                System.out.println();
                if (scn.nextLine().equalsIgnoreCase("Y")) {
                    phone.manufacturer = newManufacturer;
                    System.out.println("Manufacturer has now been updated.");
                    System.out.println();
                } else {
                    System.out.println("Changes not saved.");
                    System.out.println();
                }
                System.out.println("Would you like to edit another product? Y/N");
                System.out.println("If no you will be returned to the main menu.");
                System.out.println();

                if (scn.nextLine().equalsIgnoreCase("Y")) {

                    System.out.println();
                    printStockEditMenu();

                } else {
                    System.out.println();
                    printMenu();
                }

                break;
            case 3:
                System.out.println("Current Price is set as: " + ANSI_BLUE + phone.price + ANSI_RESET);
                System.out.println("What would you like to change this to?");
                System.out.println();
                double newPrice = Double.parseDouble(scn.nextLine());
                System.out.println("Are you sure you want to change the Price from " + ANSI_BLUE + phone.price +
                        ANSI_RESET + " to this: " + ANSI_CYAN + newPrice + ANSI_RESET + " Y/N ");
                System.out.println();
                if (scn.nextLine().equalsIgnoreCase("Y")) {
                    phone.price = newPrice;
                    System.out.println("Price has now been updated.");
                    System.out.println();
                } else {
                    System.out.println("Changes not saved.");
                    System.out.println();
                }
                System.out.println("Would you like to edit another product? Y/N");
                System.out.println("If no you will be returned to the main menu.");
                System.out.println();

                if (scn.nextLine().equalsIgnoreCase("Y")) {
                    System.out.println();
                    printStockEditMenu();
                } else {
                    System.out.println();
                    printMenu();

                }

                break;
            case 4:
                System.out.println("Current Quantity in Stock is set as: " + ANSI_BLUE + phone.quantityStocked + ANSI_RESET);
                System.out.println("What would you like to change this to?");
                System.out.println();
                int newQuantity = Integer.parseInt(scn.nextLine());
                System.out.println("Are you sure you want to change the quantity in stock from " +
                        ANSI_BLUE + phone.quantityStocked + ANSI_RESET + " to this: "
                        + ANSI_CYAN + newQuantity + ANSI_RESET + "Y/N");
                System.out.println();
                if (scn.nextLine().equalsIgnoreCase("Y")) {
                    phone.quantityStocked = newQuantity;
                    System.out.println("Quantity in stock has now been updated.");
                    System.out.println();
                } else {
                    System.out.println("Changes not saved.");
                    System.out.println();
                }
                System.out.println("Would you like to edit another product? Y/N");
                System.out.println("If no you will be returned to the main menu.");
                System.out.println();

                if (scn.nextLine().equalsIgnoreCase("Y")) {
                    System.out.println();
                    printStockEditMenu();
                } else {
                    System.out.println();
                    printMenu();
                }

                break;
            case 5:
                System.out.println("Current Phone Name is set as: " + ANSI_BLUE + phone.phoneName + ANSI_RESET);
                System.out.println("What would you like to change this to?");
                System.out.println();
                String newName = (scn.nextLine());
                System.out.println("Are you sure you want to change the phone name from " + ANSI_BLUE + phone.phoneName + ANSI_RESET +
                        " to this: " + ANSI_CYAN + newName + ANSI_RESET + " Y/N ");
                System.out.println();
                if (scn.nextLine().equalsIgnoreCase("Y")) {
                    phone.phoneName = newName;
                    System.out.println("Phone Name has now been updated.");
                    System.out.println();
                } else {
                    System.out.println("Changes not saved.");
                    System.out.println();
                }
                System.out.println("Would you like to edit another product? Y/N");
                System.out.println("If no you will be returned to the main menu.");
                System.out.println();

                if (scn.nextLine().equalsIgnoreCase("Y")) {
                    System.out.println();
                    printStockEditMenu();
                } else {
                    System.out.println();
                    printMenu();
                }
                break;
            case 6:
                System.exit(1);
            default:
                System.out.println();
                System.out.println(ANSI_RED + "Invalid option. Please try again" + ANSI_RESET);
                printStockEditMenu();

        }
    }

    private void printStockRemoveMenu() {

        System.out.println("Which item of stock would you like to remove?");
        System.out.println();
        int Counter = 1;
        for (Stock s : phones) {
            System.out.println(Counter + " - " + s.phoneName);
            Counter++;
        }
        int input = Integer.parseInt(scn.nextLine());

        Stock selectedPhone = phones.get(input - 1);
        removePhone(selectedPhone);

    }

    private void removePhone(Stock selectedPhone) {
        System.out.println("Are you sure you want to delete" + selectedPhone + "from the system? Y/N");

        if (scn.nextLine().equalsIgnoreCase("Y")) {
            phones.remove(selectedPhone);
            System.out.println(selectedPhone + "has now been updated.");
            System.out.println();
            System.out.println();
        } else {
            System.out.println("Changes not saved.");
            System.out.println();
            System.out.println();
        }


    }
}





