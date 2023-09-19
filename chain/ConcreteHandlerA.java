package chain;

public class ConcreteHandlerA implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getLevel() <= 1) {
            System.out.println("Request handled by ConcreteHandlerA");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
