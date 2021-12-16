package views;

import controllers.LoginController;
import controllers.StockController;
import models.User;

import java.util.ArrayList;

public class LoginView {

    public static void main(String[] args) {
        LoginView lv = new LoginView();
        while (true)
        lv.displayLoginScreen();
    }

    public void displayLoginScreen() {
        LoginController lc = new LoginController();

        System.out.println("Hi, Welcome to The Phone Shop data system");

        System.out.println("Please enter your Username:");
        lc.getUsername();

        System.out.println("Please enter your Password");
        lc.getPassword();

        if (lc.checkDetails()) {

            System.out.println("Correct details entered.");
            System.out.println("Going to Main Menu.");
            lc.printMenu();

        } else {
            System.out.println("Incorrect Username and/or Password, please try again.");
            displayLoginScreen();
        }
    }

}

