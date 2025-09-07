// task 3_5

public class Clock {
    private static Clock instance;
    private double time;

    private Clock() {
        this.time = 0.0;
    }

    public static Clock getInstance() {
        if (instance == null) {  // Check if the instance has not been created yet.
            instance = new Clock();
        }
        return instance;
    }

    public void setTime(double t) {
        this.time = t;
    }

    public double getTime() {
        return time;
    }

    // Test program
    public static void main(String[] args) {
        Clock clock = Clock.getInstance();
        clock.setTime(5.0);  // Set the clock's current time to 5.0 (for example, 5 units of simulated time).
        System.out.println("Current time: " + clock.getTime());
    }
}
