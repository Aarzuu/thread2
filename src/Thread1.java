public class Thread1 implements Runnable{

    BankAccount bankAccount = new BankAccount(10000D);

    @Override
    public void run() {
        bankAccount.deposit(10D);
        bankAccount.withdraw(1000D);
    }
}
