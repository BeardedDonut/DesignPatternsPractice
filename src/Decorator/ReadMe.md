# Decorator Design Pattern:
    
   ## Intent:
   - Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.
    
   - Client-specified embellishment of a core object by recursively wrapping it.    
    
   - Wrapping a gift, putting it in a box, and wrapping the box.

   ## UML Diagram
   ![Image][uml-diagram]
   
   ## Problem:
   Imagine we have a base gun which we can add up different accessories and we can also add up accessories to those accessories.
   
   For example imagine we have a base space gun and then we add a 4x scope to it also we want to add an extra mag to it... 
    
   ## Solution:
   Here we can benefit from the Decorator design pattern to to `Decorate` the base class and leverage the quality of our program and make it more maintainable
   
[uml-diagram]: https://github.com/navid9675/DesignPatternsPractice/blob/Decorator/src/Decorator/UML-Diagram.png
