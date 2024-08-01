public class Thread12 extends Thread{

    private final Vehicle vehicle;

    public Thread12(Vehicle vehicle) {
        this.vehicle=vehicle;
    }
    public void run (){
        try {
            System.out.println("flow " + Thread.currentThread().getName()  + " run");
            for (int i = 0; i < vehicle.getSizeModelArray(); i++) {
                System.out.println(Thread.currentThread().getName() + " out price " + vehicle.getAllModelPrices()[i]);
            }
        } catch (Exception e) {
            throw new RuntimeException();
        } finally {
            System.out.println(Thread.currentThread().getName() + "  end work");
        }
    }
}
