public class Thread2 implements Runnable{

    BankAccount bankAccount = new BankAccount(10000D);

    @Override
    public void run() {
        bankAccount.deposit(5D);
        bankAccount.withdraw(6000D);
    }
}
