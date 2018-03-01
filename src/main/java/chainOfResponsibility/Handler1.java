package chainOfResponsibility;

public class Handler1 implements Handler {

    //用于存储下一个链接者
    private Handler next;

    public void handleRequest(int n) {
        if (n < 10) {
            System.out.println("handler1 handles the request . n:" + n);
            return;
        }
        if (next == null) {
            throw new NullPointerException("next handler not exists");
        } else {
            next.handleRequest(n);
        }
    }

    public void setNextHandler(Handler next) {
        this.next = next;
    }
}
