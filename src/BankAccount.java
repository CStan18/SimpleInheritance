import java.util.Scanner;

public class BankAccount {

    private String firstName;
    private String lastName;
    private int accountID;
    private double balance;

    BankAccount() {
        balance = 0;
    }

    // Takes in double parameter
    // Adds parameter to bank account balance
    public void deposit(double depositAmount) {
        this.balance += depositAmount;
    }

    // Takes in double parameter
    // Subtracts parameter from bank account balance
    public void withdrawal(double withdrawalAmount) {
        this.balance -= withdrawalAmount;
    }

    // Takes in String parameter
    // Sets private variable firstName to String parameter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Takes in String parameter
    // Sets private variable lastName to String parameter
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Takes in int parameter
    // Sets private variable accountID to int parameter
    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    // Returns private variable firstName
    public String getFirstName() {
        return firstName;
    }

    // Returns private variable lastName
    public String getLastName() {
        return lastName;
    }

    // Returns private variable accountID
    public int getAccountID() {
        return accountID;
    }

    // Returns private variable balance
    public double getBalance() {
        return balance;
    }

    // Prints to console all private variables
    public void accountSummary() {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("ID: " + getAccountID());
        System.out.println("Balance: " + getBalance());
    }
}
