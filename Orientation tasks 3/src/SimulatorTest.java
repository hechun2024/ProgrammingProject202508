// task 3_7
import java.util.*;
import distributions.Negexp;   // 第六题用到的分布类

// 顾客类
class Customer {
    double arrivalTime;

    Customer(double arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
}

// 服务点类
class ServicePoint {
    Queue<Customer> queue = new LinkedList<>();

    // 顾客进入队列
    void addCustomer(Customer c) {
        queue.add(c);
    }

    // 处理队列中的顾客，计算在系统中的停留时间
    void processCustomers(double currentTime) { //没有写修饰符 = 默认包访问权限 (package-private)。
        while (!queue.isEmpty()) {
            Customer c = queue.poll();
            double timeInSystem = currentTime - c.arrivalTime;
            System.out.println("Customer stayed in system: " + timeInSystem);
        }
    }
}

// 事件类
class Event {
    double time;
    String type;

    Event(double time, String type) {
        this.time = time;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Event{" + "time=" + time + ", type='" + type + '\'' + '}';
    }
}

// 事件列表
class EventList7 extends ArrayList<Event> {}

// ArrivalProcess（第六题改造版）
class ArrivalProcess7 {
    private String eventType;
    private Negexp generator;

    public ArrivalProcess7(String eventType, double mean) {
        this.eventType = eventType;
        this.generator = new Negexp(mean);
    }

    public void addNextArrival(EventList list, double currentTime) {
        double interval = generator.sample();
        double newTime = currentTime + interval;
        list.add(new Event(newTime, eventType));
    }
}

// 模拟测试（第七题）
public class SimulatorTest {
    public static void main(String[] args) {
        Clock clock = Clock.getInstance(); // 单例时钟
        EventList events = new EventList();
        ArrivalProcess ap = new ArrivalProcess("Arrival", 5.0); // 平均到达间隔 = 5
        ServicePoint sp = new ServicePoint();

        // 1. 生成 10 个到达事件
        double time = 0.0;
        for (int i = 0; i < 10; i++) {
            ap.addNextArrival(events, time);
            time = events.get(events.size() - 1).time; // 更新到最后一个事件时间
        }

        // 2. 设置时钟到最后一个事件的时间
        clock.setTime(time);
        System.out.println("Clock time after events: " + clock.getTime());

        // 3. 把顾客加到服务点队列
        for (Event e : events) {
            sp.addCustomer(new Customer(e.time));
        }

        // 4. 时钟往后走 5 单位时间
        clock.setTime(clock.getTime() + 5);

        // 5. 清空队列，打印顾客在系统中的停留时间
        sp.processCustomers(clock.getTime());
    }
}

