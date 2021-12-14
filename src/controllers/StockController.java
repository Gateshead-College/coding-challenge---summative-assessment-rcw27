package controllers;

import java.util.ArrayList;
import java.util.Scanner;

public class StockController {

    public static void main(String[] args) {
        StockController sc = new StockController();
        sc.printMenu();
    }

    Scanner scn = new Scanner(System.in);

    private void printMenu() {
        System.out.println("Which manufacturer would you like to view our stock range for?");
        System.out.println("1 - Apple");
        System.out.println("2 - Samsung");
        System.out.println("3 - Oppo");
        System.out.println();

        int input = Integer.parseInt(scn.nextLine());

        switch (input) {
            case 1:
                System.out.println("Our current stock range for Apple is:");
                System.out.println("iPhone SE, iPhone 12, iPhone 13");
                System.out.println();
                printMenu();

            case 2:
                System.out.println("Our current stock range for Samsung is:");
                System.out.println("Samsung J3, Samsung A52, Samsung S21");
                System.out.println();
                printMenu();

            case 3:
                System.out.println("Our current stock range for Oppo is:");
                System.out.println("A54, X3 Lite, X3 Pro");
                System.out.println();
                printMenu();


        }


    }


}
