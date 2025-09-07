// task 3_6

import distributions.Negexp;
import java.util.ArrayList;

class Event7 {
    double time;
    String type;
    Event7(double time, String type) {
        this.time = time;
        this.type = type;
    }
    @Override
    public String toString() {
        return "Event{" + "time=" + time + ", type='" + type + '\'' + '}';
    }
}

class EventList extends ArrayList<Event> {}

public class ArrivalProcess {
    private String eventType;
    private Negexp generator; // 使用 Negexp

    public ArrivalProcess(String eventType, double mean) {
        this.eventType = eventType;
        this.generator = new Negexp(mean); // 平均间隔 = mean
    }

    public void addNextArrival(EventList list, double currentTime) {
        double interval = generator.sample(); // 从分布里取随机间隔
        double newTime = currentTime + interval;
        list.add(new Event(newTime, eventType));
    }

    public static void main(String[] args) {
        EventList events = new EventList();
        ArrivalProcess ap = new ArrivalProcess("CustomerArrival", 5.0);

        double time = 0.0;
        for (int i = 0; i < 10; i++) {
            ap.addNextArrival(events, time);
            time = events.get(events.size() - 1).time;
        }

        for (Event e : events) {
            System.out.println(e);
        }
    }
}
