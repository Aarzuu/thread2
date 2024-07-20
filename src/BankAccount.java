public class BankAccount {

    private Double balance;

    public BankAccount(Double balance) {
        this.balance = balance;
    }

    public synchronized void deposit(Double deposit){
        balance = balance + deposit;
        System.out.println("deposit added, now your balance is: ");
        System.out.println(balance);
    }

    public synchronized void withdraw(Double withdraw){
        if (withdraw > balance){
            System.out.println("insufficient balance");
        }
        else {
            balance = balance - withdraw;
            System.out.println("withdraw added, now your balance is: ");
            System.out.println(balance);
        }

    }
}
