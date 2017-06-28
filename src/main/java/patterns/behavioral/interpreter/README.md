#### Interpreter Design Patterns

##### Definition

Interpreter pattern is a design pattern that specifies how to evaluate expressions in a language. 
* There are handlers for each symbol (terminal or non-terminal) which evaluate the expression. 
* Non terminal expression invoke other expressions to evaluate the expression
* Result is calculated when all the evaluation is completed.