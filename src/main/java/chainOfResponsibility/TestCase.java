package chainOfResponsibility;

public class TestCase {

    public static void main(String[] args) {
        Handler h1, h2, h3;
        h1 = new Handler1();
        h2 = new Handler2();
        h3 = new Handler3();
        h1.setNextHandler(h2);
        h2.setNextHandler(h3);
        h1.handleRequest(1);
        h1.handleRequest(20);
        h1.handleRequest(100);
    }
}
