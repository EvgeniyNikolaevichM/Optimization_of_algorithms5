import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock2  implements Runnable {
    private Vehicle vehicle;
    private ReentrantLock reentrantLock;

    public ReentrantLock2(Vehicle vehicle, ReentrantLock reentrantLock) {
        this.vehicle=vehicle;
        this.reentrantLock = reentrantLock;
    }

    public void run (){
        reentrantLock.lock();
        try {
            for (int i = 0; i < vehicle.getSizeModelArray(); i++) {
                System.out.println("Threed1: " + vehicle.getAllModelNames()[i]);
            }
        }
        finally {
            reentrantLock.unlock();
        }
    }
}
