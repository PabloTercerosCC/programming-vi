package chain;

public class ConcreteHandlerB implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getLevel() <= 2) {
            System.out.println("Request handled by ConcreteHandlerB");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}