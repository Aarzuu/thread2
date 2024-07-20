//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Thread th1 = new Thread(new Thread1());
        Thread th2 = new Thread(new Thread2());

        th1.start();
        th2.start();

    }
}