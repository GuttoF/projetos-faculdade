public class ContadorThread extends Thread {
    private int numero;

    // Constructor
    public ContadorThread(int numero){
        this.numero = numero;
    }

    // Método run
    @Override
    public void run(){
        System.out.println("Thread " + numero + " iniciado");
        for(int i = 0; i < 10; i++){
            System.out.println("Thread " + numero + " valor: " + i);
            try{
                sleep(1000);
                // sleep((long)(Math.random() * 1000));
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Thread " + numero + " finalizado");
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            new ContadorThread(i).start(); // Inicia a Thread
        }
    }
}