## Prototype
A company wants to generate invoices, order forms, and notices for each new client.
To visualize the model, it is useful to create a class diagram. In this case, the "Prototype" class serves as the main class that allows creating new copies. 
The Invoice, OrderForm, and Notice classes are specific subclasses, each with its own attributes. The clone() method returns a copy of the object. Implement this model.
## Composite
 Files, shortcuts, and directories are contained within directories and each has a name. 
 A shortcut can refer to either a file or a directory. Within a given directory, a name can only identify a single item (file, subdirectory, or shortcut).
 ## Adapter
This allows us to adapt employees to the client model without changing the "User" interface or existing logic.
The Adapter ensures that calling the "DisplayUser" method shows the client's name, and for employees, their name followed by their current position.
