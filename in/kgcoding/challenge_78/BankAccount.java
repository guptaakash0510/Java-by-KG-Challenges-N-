package in.kgcoding.challenge_78;

public class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public void depositeMoney(double money) {
        if (money < 0) {
            System.out.println("Invalid Deposite");
        } else {
            balance += money;
        }
    }

    public double WithdrawMoney(double money) {
        if (money <= 0) {
            System.out.println("invalid withdraw");
        }

        else if(balance >= money) {
            balance -= money;
        }

        else{
            money = balance;
            balance = 0;
        }
        return money;
    }
}
