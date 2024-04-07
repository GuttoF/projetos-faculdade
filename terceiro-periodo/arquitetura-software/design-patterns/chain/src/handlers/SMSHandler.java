package handlers;

public class SMSHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public void handleRequest(String requestType) {
        if ("SMS".equals(requestType)) {
            System.out.println("SMSHandler: Handling SMS request.");
        } else if (next != null) {
            next.handleRequest(requestType);
        }
    }
}