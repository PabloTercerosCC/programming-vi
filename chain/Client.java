package chain;

public class Client {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();

        handlerA.setNextHandler(handlerB);

        Request request1 = new Request(1);
        Request request2 = new Request(2);

        handlerA.handleRequest(request1);
        handlerA.handleRequest(request2);
    }
}
