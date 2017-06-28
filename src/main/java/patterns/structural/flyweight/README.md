#### Flyweight Design Pattern

##### Definition

Use sharing to support large numbers of fine-grained objects efficiently.

* Flyweight objects must be immutable.
* Each "flyweight" object is divided into two pieces: 
    * State dependent external part: Extrinsic state is stored client objects, and passed to the flyweight
    * State independent internal part: Intrinsic state is stored in the Flyweight object. 
    
