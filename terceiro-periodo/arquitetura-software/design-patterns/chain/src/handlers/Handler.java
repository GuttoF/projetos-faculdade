package handlers;

public interface Handler {
    void setNext(Handler handler);
    void handleRequest(String requestType);
}
