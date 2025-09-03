// OrientationTask2_3


import java.util.PriorityQueue;

enum EventType {
    ARRIVAL,
    EXIT
}

// class Event implements Comparable<Event>
class Event3 implements Comparable<Event3> {
    private int time;
    private EventType type;

    public Event3(int time, EventType type) {
        this.time = time;
        this.type = type;
    }

    public int getTime() { return time; }
    public EventType getType() { return type; }

    @Override
    public int compareTo(Event3 other) {
        return this.time - other.time;
    }

    @Override
    public String toString() {
        return type + " event at " + time;
    }
}


//

class EventList3 {
    private PriorityQueue<Event3> queue = new PriorityQueue<>();

    public void addEvent(Event3 e) {
        queue.add(e);
    }

    public Event3 getNextEvent() {
        return queue.poll(); // removes and returns earliest event
    }

    public void printEvents() {
        // PriorityQueue doesn’t print in order, so copy and sort
        PriorityQueue<Event3> copy = new PriorityQueue<>(queue);
        while (!copy.isEmpty()) {
            System.out.println(copy.poll());
        }
    }
}

// TestEvents
class test {
    public static void main(String[] args) {
        EventList3 list = new EventList3();

        list.addEvent(new Event3(10, EventType.ARRIVAL));
        list.addEvent(new Event3(5, EventType.EXIT));
        list.addEvent(new Event3(20, EventType.EXIT));

        System.out.println("Next event: " + list.getNextEvent());
        System.out.println("Remaining events in order:");
        list.printEvents();
    }
}