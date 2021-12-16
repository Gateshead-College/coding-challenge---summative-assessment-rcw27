package controllers;

import models.User;
import views.LoginView;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginController {
    User u;
    ArrayList<User> users = new ArrayList<>();



    private String username = "";
    private String password = "";

    public void getUsername(){
        username = new Scanner(System.in).nextLine();
    }

    public void getPassword() {
        password = new Scanner(System.in).nextLine();
    }

    public boolean checkDetails() {
        createUsers();
        for (User u : users) {
            if (u.getUsername().equalsIgnoreCase(username) &&
                    u.getPassword().equals(password)) {
                this.u = u;
                return true;
            }
        }
        return false;
    }
    private void createUsers() {
        users.add(new User("Jan", "Lewis", 1234, "J", "J", true));
        users.add(new User("Fran", "Brewis", 1235, "FBrew1", "FranPass1", false));
        users.add(new User("Stan", "Chewis", 1236, "SChew1", "StanPass1", false));

    }

    public void printMenu() {
        new StockController(u);
    }
}