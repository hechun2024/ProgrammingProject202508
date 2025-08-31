// task 1.6

public class OrientationTask1_6 {
    public static void main(String[] args) {
        ServicePoint6 sp = new ServicePoint6();
        CustomerGenerator generator = new CustomerGenerator(sp, 5);
        sp.serve();
        System.out.println("Average service time = " + sp.getAverageServiceTime() + " ms");
    }
}

class ServicePoint6 extends ServicePoint {
    private long totalServiceTime = 0;
    private int servedCount = 0;

    @Override
    public void serve() {
        while (!queue.isEmpty()) {
            Customer c = removeFromQueue();
            long serviceTime = (long) (Math.random() * 1000);
            try { Thread.sleep(serviceTime); } catch (InterruptedException e) {}
            totalServiceTime += serviceTime;
            servedCount++;
            c.setEndTime(System.currentTimeMillis());
            System.out.println("Served Customer " + c.getId() + " | Service time = " + serviceTime + " ms");
        }
    }

    public double getAverageServiceTime() {
        return (servedCount == 0) ? 0 : (double) totalServiceTime / servedCount;
    }
}
