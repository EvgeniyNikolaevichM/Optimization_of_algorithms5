import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread4 implements Runnable {
    private Vehicle vehicle;
    public Thread4(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void run() {
            try {
                    System.out.println("Flow " + vehicle.getMark());
            } catch (Exception e) {
                throw new RuntimeException();
            }
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
    }
}