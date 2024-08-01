import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ArrayBlockingQueue;

public class Thread5 implements Runnable {
    private String filePath;
    private ArrayBlockingQueue ArrayBlockingQueue;

    public Thread5(String filePath, ArrayBlockingQueue ArrayBlockingQueue) {
        this.filePath = filePath;
        this.ArrayBlockingQueue = ArrayBlockingQueue;
    }

    public void run() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String mark = reader.readLine();
            Vehicle auto = new Auto(mark, 2);
            reader.close();
//            ArrayBlockingQueue.put(auto);
            ArrayBlockingQueue.add(auto);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

