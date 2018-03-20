# Mediator Design Pattern:
    
   ## Intent:
   - Design a middle component to decouple and maintain other components interaction.
   
   - Promotes the many-many relation between interacting peers to "full object status".
   
   - Something like using a dedicated server instead of using the p2p architecture in multi-player online games architecture. 
   
   ## UML Diagram
   ![Image][uml-diagram]
   
   ## Problem:
   Imagine we have some `Colleague`s in an application. `Colleague`s can send messages to each other or do other interactions. New `Colleague`s will be added dynamically to our system. 
   
   ## Solution:
   As you know to storing the `Colleague`s list in each `Colleague` is not efficient so we introduce an intermediary component which holds the address of all the `Colleague`s and we let handle the interaction.
    
    
  ### NOTE:
  Be careful using this pattern since it could result in a monolith sort of mediator which would become so big that makes it hard to maintain.
   
[uml-diagram]: https://github.com/navid9675/DesignPatternsPractice/blob/master/src/Mediator/UML-Diagram.png
