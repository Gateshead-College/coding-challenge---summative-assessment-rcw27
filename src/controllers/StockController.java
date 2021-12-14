package controllers;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StockController {

    private static
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
            int input = Integer.parseInt(scn.nextLine());

            switch (input) {
                case 1:
                    System.out.println("Our current stock range is:" + stockList);
                    printMenu();
            }


    }
}