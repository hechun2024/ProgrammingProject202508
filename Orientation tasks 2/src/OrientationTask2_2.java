// OrientationTask2_2

import java.util.PriorityQueue;

class Event implements Comparable<Event> {
    private int time;  // when the event happens

    public Event(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    @Override
    public int compareTo(Event other) {
        return this.time - other.time; // earlier time = higher priority
    }

    @Override
    public String toString() {
        return "Event at " + time;
    }
}

class EventList {
    private PriorityQueue<Event> queue = new PriorityQueue<>();

    public void addEvent(Event e) {
        queue.add(e);
    }

    public Event getNextEvent() {
        return queue.poll(); // removes and returns earliest event
    }

    public void printEvents() {
        // PriorityQueue doesn’t print in order, so copy and sort
        PriorityQueue<Event> copy = new PriorityQueue<>(queue);
        while (!copy.isEmpty()) {
            System.out.println(copy.poll());
        }
    }
}

// TestEvents
public class OrientationTask2_2 {
    public static void main(String[] args) {
        EventList list = new EventList();

        list.addEvent(new Event(10));
        list.addEvent(new Event(5));
        list.addEvent(new Event(20));

        System.out.println("Next event: " + list.getNextEvent());
        System.out.println("Remaining events in order:");
        list.printEvents();
    }
}
