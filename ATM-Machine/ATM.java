public class ATM {
    private double balance;
    private double depositAmount;
    private double withdrawAmount;

    // Default constructor
    public ATM() {
        this.balance = 0.0;
        this.depositAmount = 0.0;
        this.withdrawAmount = 0.0;
    }

    public double getBalance() {
    throw new UnsupportedOperationException("Unimplemented method 'getBalance'");

    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
}