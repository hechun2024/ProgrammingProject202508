// task 1.3

public class OrientationTask1_3 {
    public static void main(String[] args) throws InterruptedException {
        Customer c1 = new Customer();
        Thread.sleep(100); // simulate time passing
        c1.setEndTime(System.currentTimeMillis());
        System.out.println("Customer " + c1.getId() + " spent: " + c1.timeSpent() + " ms");
    }
}

class Customer {
    private static int counter = 0;
    private int id;
    private long startTime;
    private long endTime;

    public Customer() {
        this.id = ++counter;
        this.startTime = System.currentTimeMillis();
    }

    public int getId() { return id; }
    public long getStartTime() { return startTime; }
    public long getEndTime() { return endTime; }
    public void setEndTime(long endTime) { this.endTime = endTime; }
    public long timeSpent() { return endTime - startTime; }
}
