# Chain of Responsibility Design Pattern:
    
   ## Intent:
   - Gives object to translate between different internal states dynamically
   
   - To simulate an object-oriented state machine
    
   ## UML Diagram
   ![Image][uml-diagram]

   ## Problem:
   Imagine you have a `Context` which holds an internal `State` representing its current state and you need to change the state of the based on some events dynamically and other states might add up in the future. 
   
   ## Solution:
   There is two solution for this problem:
   
   - Changing states using a switch-case approach which demands for hard coding the translation between different states in the source code of our application.
   
   - Using `State` design pattern to tackle this problem in more neat way.
   
[uml-diagram]: https://github.com/navid9675/DesignPatternsPractice/blob/State/src/State/UML-Diagram.png
