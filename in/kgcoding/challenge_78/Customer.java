package in.kgcoding.challenge_78;

public class Customer {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("001", "Akash Gupta");
        account.depositeMoney(100);
        System.out.println(account.WithdrawMoney(200));
        account.depositeMoney(-40);
        account.WithdrawMoney(0);

    }
}
