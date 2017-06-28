#### Memento Design Patterns
##### Definition

Provides the ability to restore an object to its previous state i.e. undo functionality

The memento pattern is implemented with three objects: the originator, a caretaker and a memento. 
* Originator is some object that has an internal state. 
* Caretaker is the object that interacts with originator to change its internal state and undo some operations 
* Memento stores previous states of originator. Memento is contained in originator.
