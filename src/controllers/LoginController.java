package controllers;

import java.util.Scanner;

public class LoginController {

    private String username = "";
    private String password = "";

    public void getUsername() {
        username = new Scanner(System.in).nextLine();
    }

    public void getPassword() {
        password = new Scanner(System.in).nextLine();
    }



}

