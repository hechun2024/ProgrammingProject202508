
## Task 3_3 (W) — Singleton and `new`
A Singleton prevents multiple objects from being created:

- Its constructor is **private**.
- The single instance is accessed through a **static `getInstance()`** method.
- Since outside code cannot call `new`, only one object is ever created.