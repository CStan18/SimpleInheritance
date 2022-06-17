public class CheckingAccount extends BankAccount {

    double interestRate;

    public void processWithdrawal() {
        if (this.getBalance() < 0) {
            withdrawal(30);
            System.out.println("Balance negative: a $30 overdraft fee has been applied.");
            System.out.println("Balance: " + getBalance());

        }
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void displayAccount() {
        super.accountSummary();
        System.out.println("Interest Rate: " + getInterestRate() + "\n");
    }
}
