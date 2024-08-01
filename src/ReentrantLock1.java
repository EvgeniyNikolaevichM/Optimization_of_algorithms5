import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock1  implements Runnable {
    private final Vehicle vehicle;
    private ReentrantLock reentrantLock;

    public ReentrantLock1(Vehicle vehicle, ReentrantLock reentrantLock) {
        this.vehicle=vehicle;
        this.reentrantLock = reentrantLock;
    }

    public void run (){
        reentrantLock.lock();
        try {
            for (int i = 0; i < vehicle.getSizeModelArray(); i++) {
                System.out.println("Threed2: " + vehicle.getAllModelPrices()[i]);
            }
        }
        finally {
            reentrantLock.unlock();
        }
    }
}