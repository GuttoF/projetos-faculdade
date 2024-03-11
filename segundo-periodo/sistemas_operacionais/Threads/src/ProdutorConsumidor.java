import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProdutorConsumidor {
    public static void main(String[] args) {
        BlockingQueue<Integer> buffer = new ArrayBlockingQueue<>(10); // Buffer com tamanho limitado

        // Produtor
        Thread produtor = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    buffer.put(i); // Insere um item no buffer
                    System.out.println("Produtor: inseriu " + i);
                    Thread.sleep(100); // Simula produção
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Consumidor
        Thread consumidor = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    int item = buffer.take(); // Remove um item do buffer
                    System.out.println("Consumidor: consumiu " + item);
                    Thread.sleep(1000); // Simula consumo
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        produtor.start();
        consumidor.start();
    }
}
