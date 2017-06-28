#### Observer Design Pattern

##### Definition

Defines a one-to-many dependency between objects so that when one object changes state, 
all its dependents are notified and updated automatically.

* Subject, maintains a list of its dependents, called observers, and 
* Subject notifies observers automatically of any state changes, usually by calling one of their methods.
* It is mainly used to implement distributed event handling systems, in "event driven" software. 
