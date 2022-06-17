import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static ArrayList<CheckingAccount> checkingAccountArrayList = new ArrayList<>();


    public static int getUserChoice() {
        Scanner scnr = new Scanner(System.in);
        int userChoice = 0;

        try {
            System.out.println("""
                Please make a selection 1 through 5:\s
                 1. Deposit
                 2. Withdrawal
                 3. Get Balance
                 4. Account Summary
                 5. Quit""");
            userChoice = scnr.nextInt();
        }
        catch (Exception e) {
            System.out.println("An error occurred.");
        }
        return userChoice;
    }

    public static void implementUserChoice(int userChoice) {
        Scanner scnr = new Scanner(System.in);
        double despoitAmount;
        double withdrawalAmount;

        switch (userChoice) {
            case 1 -> {
                System.out.println("Case 1: Deposit");
                System.out.println("Enter deposit amount: ");
                despoitAmount = scnr.nextDouble();
                checkingAccountArrayList.get(0).deposit(despoitAmount);
                System.out.println("New Balance: " +
                        checkingAccountArrayList.get(0).getBalance());
                implementUserChoice(getUserChoice());

            }
            case 2 -> {
                System.out.println("Case 2: Withdrawal");
                System.out.println("Enter withdrawal amount: ");
                withdrawalAmount = scnr.nextDouble();
                checkingAccountArrayList.get(0).withdrawal(withdrawalAmount);
                System.out.println("New Balance: " +
                        checkingAccountArrayList.get(0).getBalance());
                checkingAccountArrayList.get(0).processWithdrawal();
                implementUserChoice(getUserChoice());

            }
            case 3 -> {
                System.out.println("Case 3: Get Balance");
                System.out.println(checkingAccountArrayList.get(0).getBalance());
                implementUserChoice(getUserChoice());

            }
            case 4 -> {
                System.out.println("Case 4: Account Summary");
                checkingAccountArrayList.get(0).displayAccount();
                implementUserChoice(getUserChoice());

            }
            case 5 -> {
                System.out.println("Case 5: Quit");
                System.out.println("Goodbye.");

            }
        }
    }

    public static CheckingAccount createAccount() {
        Scanner scnr = new Scanner(System.in);

        CheckingAccount ca = new CheckingAccount();
        String userInputString;
        int userInputInt;
        double userInputDouble;

        System.out.println("Please fill out the following: ");
        System.out.println("First name: ");
        userInputString = scnr.next();
        ca.setFirstName(userInputString);

        System.out.println("Last name: ");
        userInputString = scnr.next();
        ca.setLastName(userInputString);

        System.out.println("Account ID: ");
        userInputInt = scnr.nextInt();
        ca.setAccountID(userInputInt);

        System.out.println("Interest rate: ");
        userInputDouble = scnr.nextDouble();
        ca.setInterestRate(userInputDouble);

        return ca;

    }


    public static void main(String[] args) {
        checkingAccountArrayList.add(createAccount());
        implementUserChoice(getUserChoice());
    }
}