package chainOfResponsibility;


//责任链使用场景，其实涉及到 层次性的处理，或者依次性的处理（filter），都可以向这个模式靠拢。会使整体代码层次清晰不少

public interface Handler {
    void handleRequest(int n);

    void setNextHandler(Handler next);
}
