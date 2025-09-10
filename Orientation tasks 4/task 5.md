## Task 5 (W) – Meaning of phases and coding

**A-phase coding**

- Advances simulation time and selects the next event.

- Implemented in classes like EventList that manage events chronologically.

**B-phase coding**

- Executes bound (scheduled) events such as arrivals and completions.

- Implemented in methods of the Event class that update the state and schedule new events.

**C-phase coding**

- Executes conditional events that depend on system state (e.g., server starts if idle and queue is non-empty).

- Implemented in classes like ServicePoint or Queue where conditions are checked and new B-events scheduled.

**Summary:**

- A-phase = event scheduling/time advance

- B-phase = process scheduled events

- C-phase = conditional logic execution