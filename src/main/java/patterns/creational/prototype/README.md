#### Prototyping Design Pattern

##### Definition

Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype

* One instance acts as the source of all future instances
* Avoid subclasses of an object creator in the client application, like the abstract factory pattern does.
* Avoid the inherent cost of creating a new object in the standard way (e.g., using new) when 
it is prohibitively expensive

