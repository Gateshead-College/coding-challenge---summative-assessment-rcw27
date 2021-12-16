package models;

import java.util.ArrayList;

public class User<Account> {

    private String forename;
    private String surname;
    private int employeeID;
    private String username;
    private String password;
    private boolean isAdmin;
    ArrayList<Account> accounts;

    public User(String forename, String surname, int employeeID, String username, String password, boolean isAdmin) {
        this.forename = forename;
        this.surname = surname;
        this.employeeID = employeeID;
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
        this.accounts = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

