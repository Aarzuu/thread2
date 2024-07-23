public class Main {
    public static void main(String[] args) {
        Threadm1 th1 = new Threadm1();
        Threadm2 th2 = new Threadm2();

        th1.start();
        th2.start();
    }
}
