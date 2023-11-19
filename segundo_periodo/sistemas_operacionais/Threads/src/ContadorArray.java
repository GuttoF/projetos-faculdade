import java.util.concurrent.atomic.AtomicInteger;

public class ContadorArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numThreads = array.length / 2; // Número de threads é a metade do tamanho do array

        AtomicInteger sum = new AtomicInteger(0); // Usando um AtomicInteger para soma paralela

        Thread[] threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            final int threadNum = i;
            threads[i] = new Thread(() -> {
                int start = threadNum * 2;
                int end = start + 1;
                int partialSum = 0;

                for (int j = start; j <= end; j++) {
                    partialSum += array[j];
                }

                System.out.println("Thread " + (threadNum + 1) + " somou " + partialSum);

                sum.addAndGet(partialSum);
            });
        }

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join(); // Aguarda o término de todas as threads
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Soma: " + sum.get());
    }
}
