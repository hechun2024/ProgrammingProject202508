//task 1.4

import java.util.LinkedList;
import java.util.Scanner;

public class OrientationTask1_4 {
    public static void main(String[] args) throws InterruptedException {
        LinkedList<Customer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose action: 1=Queue customer, 2=Dequeue customer, 3=Exit");
            int choice = scanner.nextInt();

            if (choice == 1) {
                Customer c = new Customer();
                queue.addFirst(c);
                System.out.println("Queued Customer " + c.getId());
            } else if (choice == 2) {
                if (!queue.isEmpty()) {
                    Customer c = queue.removeLast();
                    c.setEndTime(System.nanoTime());
                    System.out.println("Dequeued Customer " + c.getId() +
                            ", time spent = " + c.timeSpent() + " ns");
                } else {
                    System.out.println("Queue is empty.");
                }
            } else break;
        }
    }
}
