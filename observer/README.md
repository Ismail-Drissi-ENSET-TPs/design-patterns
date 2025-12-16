## Observer Pattern

**Definition:** The Observer pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

![Observer pattern architecture](../screenshots/observer.png)

**Description:** This implementation shows the Observer pattern where a Channel notifies its Subscribers when data changes, maintaining a list of observers and calling their update methods.
