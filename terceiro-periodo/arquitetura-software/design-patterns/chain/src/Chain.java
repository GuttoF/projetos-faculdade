import handlers.EmailHandler;
import handlers.SMSHandler;
import handlers.Handler;

public class Chain {
    public static void main(String[] args) {
        // Criar os handlers
        Handler emailHandler = new EmailHandler();
        Handler smsHandler = new SMSHandler();

        // Configurar a cadeia
        emailHandler.setNext(smsHandler);
  

        // Enviar solicitações
        emailHandler.handleRequest("Email");
        emailHandler.handleRequest("SMS");
    }
}