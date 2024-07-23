public class Main3 {
    public static void main(String[] args) {
        String cumle = "Bu pisiyin bu saatda bu evde ne isi var?";

        java.lang.Thread th = new java.lang.Thread(new Thread3(cumle));
        th.start();
    }
}
