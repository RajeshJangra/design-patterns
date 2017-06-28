#### Chain of Responsibility Design Pattern

##### Definition

* Consists of a command objects and a series of processing objects.
* Each processing processes its logic on the command; then passes it to the next processing object in the chain. 
* A mechanism also exists for adding new processing objects to the end of this chain.

In a variation of chain-of-responsibility pattern, some handlers may act as dispatchers, capable of sending commands out in a variety 
of directions, forming a tree of responsibility.
