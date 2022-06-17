import java.util.ArrayList;
import java.util.Scanner;

public class TempCodeBackup {
//    import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;
//
//    public class Main {
//
//        public static int getUserChoice() {
//            Scanner scnr = new Scanner(System.in);
//            int userChoice;
//
//            System.out.println("""
//                Please make a selection 1 through 6:\s
//                 1. Create Account
//                 2. Deposit
//                 3. Withdrawal
//                 4. Get Balance
//                 5. Account Summary
//                 6. Quit""");
//            userChoice = scnr.nextInt();
//
//            while ((userChoice < 1) || (userChoice > 5)) {
//                System.out.println("Invalid input, please try again. ");
//                userChoice = scnr.nextInt();
//            }
//            return userChoice;
//        }
//
//        public static String[] displayCheckingAccounts() {
//
//            String[] checkingAccountsArr = new String[totalCheckingAccounts];
//            int i = 0;
//
//            try {
//                for (CheckingAccount checkingAccount : checkingAccountsList) {
//                    if (checkingAccount.getAccountID() != 0) {
//                        checkingAccountsArr[i] = checkingAccount.getFirstName() +
//                                " " + checkingAccount.getLastName() + " " + checkingAccount.getAccountID()
//                                +  " " + checkingAccount.getBalance();
//                        ++i;
//                    }
//                }
//            }
//            catch (Exception e) {
//                System.out.println("An error has occurred");
//            }
//            return checkingAccountsArr;
//        }
//
//        public static void createAccount() {
//            Scanner scnr = new Scanner(System.in);
//            String firstName;
//            String lastName;
//            int accountID;
//            double interestRate;
//
//            System.out.println("Please fill out the following information. ");
//            System.out.println("First Name: ");
//            firstName = scnr.next();
//            System.out.println("Last Name: ");
//            lastName = scnr.next();
//            System.out.println("Account ID: ");
//            accountID = scnr.nextInt();
//            System.out.println("Interest Rate: ");
//            interestRate = scnr.nextDouble();
//
//            for (CheckingAccount checkingAccount : checkingAccountsList) {
//                if (checkingAccount.getFirstName() == null) {
//                    checkingAccount.setFirstName(firstName);
//                    checkingAccount.setLastName(lastName);
//                    checkingAccount.setAccountID(accountID);
//                    checkingAccount.setInterestRate(interestRate);
//                    break;
//                }
//            }
//            totalCheckingAccounts++;
//            implementUserChoice(getUserChoice());
//        }
//
//        public static void implementUserChoice(int userChoice) {
//            switch (userChoice) {
//                case 1 -> {
//                    System.out.println("Case 1: Create a new account");
//                    createAccount();
//                }
//                case 2 -> {
//                    System.out.println("Case 2: Deposit");
//                    pleaseChooseAccount();
//                    implementUserChoice(getUserChoice());
//                }
//                case 3 -> System.out.println("Case 3: Withdrawal");
//                case 4 -> System.out.println("Case 4: Get Balance");
//                case 5 -> {
//                    System.out.println("Case 5: Account Summary");
//                    System.out.println("Please select account: ");
//                    for (int i = 0; i < displayCheckingAccounts().length; ++i) {
//                        System.out.println(displayCheckingAccounts()[i]);
//                    }
//
//                }
//                case 6 -> System.out.println("Case 6: Quit");
//            }
//        }
//
//        public static void pleaseChooseAccount() {
//            System.out.println("Please select account: ");
//            for (int i = 0; i < displayCheckingAccounts().length; ++i) {
//                System.out.println(displayCheckingAccounts()[i]);
//            }
//        }
//
//        public static void main(String[] args) {
//            checkingAccountsList.add(CA1);
//            checkingAccountsList.add(CA2);
//            checkingAccountsList.add(CA3);
//            checkingAccountsList.add(CA4);
//            checkingAccountsList.add(CA5);
//            checkingAccountsList.add(CA6);
//            checkingAccountsList.add(CA7);
//            checkingAccountsList.add(CA8);
//            checkingAccountsList.add(CA9);
//            checkingAccountsList.add(CA10);
//
//            implementUserChoice(getUserChoice());
//
//        }
//    }
}
