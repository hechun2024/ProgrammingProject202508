//task1.5
import java.util.LinkedList;

public class OrientationTask1_5 {
    public static void main(String[] args) {
        ServicePoint sp = new ServicePoint();
        CustomerGenerator generator = new CustomerGenerator(sp, 5); // generate 5 customers
        sp.serve();
    }
}

class ServicePoint {
    protected LinkedList<Customer> queue = new LinkedList<>();

    public void addToQueue(Customer a) {
        queue.addFirst(a);
    }

    public Customer removeFromQueue() {
        return queue.removeLast();
    }

    public void serve() {
        while (!queue.isEmpty()) {
            Customer c = removeFromQueue();
            long serviceTime = (long) (Math.random() * 1000); // up to 1s
            try { Thread.sleep(serviceTime); } catch (InterruptedException e) {}
            c.setEndTime(System.currentTimeMillis());
            System.out.println("Served Customer " + c.getId() +
                    " | Response time = " + c.timeSpent() + " ms" +
                    " | Service time = " + serviceTime + " ms");
        }
    }
}

class CustomerGenerator {
    public CustomerGenerator(ServicePoint sp, int count) {
        for (int i = 0; i < count; i++) {
            sp.addToQueue(new Customer());
        }
    }
}
