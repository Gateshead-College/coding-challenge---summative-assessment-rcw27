package views;

import controllers.LoginController;
import controllers.StockController;

public class LoginView {

    public void displayLoginScreen() {
        LoginController lc = new LoginController();

        System.out.println("Hi, Welcome to The Phone Shop data system");

        System.out.println("Please enter your Username:");
        lc.getUsername();

        //ask for password - call a method from the LoginController
        System.out.println("Please enter your Password");
        lc.getPassword();
        //if un & pw correct go to mainmenu
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
