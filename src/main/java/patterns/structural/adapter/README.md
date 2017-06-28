#### Adapter Design Pattern

##### Definition

Allows the interface of an existing class to be used as another interface

* Allows otherwise incompatible classes to work together by converting the interface of one class into an 
interface expected by the clients.
* Adapter is about creating an intermediary abstraction that translates, or maps, the old component to the new system. 
* Clients call methods on the Adapter object which redirects them into calls to the legacy component. 
* This strategy can be implemented either with inheritance or with aggregation.
