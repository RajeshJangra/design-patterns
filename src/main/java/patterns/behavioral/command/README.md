#### Command Design Patterns

##### Definition

Command pattern decouples the object that invokes the operation from the one that knows how to perform it. 
* The base class contains an execute() method; this is the only method clients of receiver knows.
* Receiver contains appropriate command that defines its action.
* Receiver is mapped to an command, when execute is invoked on receiver receiver takes appropriate action on the command. 

