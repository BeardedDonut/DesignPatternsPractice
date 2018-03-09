# Chain of Responsibility Design Pattern:
    
   ## Intent:
   - Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
    
   - The "View" part of Model-View-Controller.
    
   - Add a wrapper and delegation to protect the real component from undue complexity.

   ## UML Diagram
   ![Image][uml-diagram]
   
   ## Problem:
   - the `updating` problem is quite well-known among programmers.
   
   - Imagine we have an object of `Subject` class and each `Subject` instance contains a number which represents its state we want to show the state number of some instances in different format such as `Hex` format, and we also want to keep it update in other words we want to change the our representation of some `Subject` instances whenever the accroding `Subject` state number changes.
   
   ## Solution:
   - We can use a `Polling` mechanism to make sure we stay up to date or we can benefit from `Observer` design pattern.
   
   - In `Observer` design pattern we have two main `Entities`:
        1. **Publisher** (*Observable* / *Subject*): This is the `Entity` which gets changes overtime like a Magazine publisher which publisher new Editions from time to time.
        
        2. **Subscriber** (*Observer*): This is the `Entity` which wants to be updated whenever it's desired `Subjects` changes.
   
   
   
[uml-diagram]: https://github.com/navid9675/DesignPatternsPractice/blob/Observer/src/Observer/UML-Diagram.png
