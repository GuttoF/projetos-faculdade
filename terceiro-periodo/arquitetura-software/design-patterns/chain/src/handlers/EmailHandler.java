package handlers;

public class EmailHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public void handleRequest(String requestType) {
        if ("Email".equals(requestType)) {
            System.out.println("EmailHandler: Handling email request.");
        } else if (next != null) {
            next.handleRequest(requestType);
        }
    }
}

