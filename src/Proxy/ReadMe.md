# Chain of Responsibility Design Pattern:
    
   ## Intent:
   - Provide a surrogate or placeholder for another object to control access to it.
    
   - Use an extra level of indirection to support distributed, controlled, or intelligent access.
    
   - Add a wrapper and delegation to protect the real component from undue complexity.

   ## UML Diagram
   ![alt text](https://github.com/navid9675/DesignPatternsPractice/tree/master/src/Proxy/UML-Diagram.png "Proxy UML"

   ### Note:
   
   There are 3 different type of proxy design pattern:
   
   - `Virtual Proxy`: A virtual proxy is a `place-holder` for an object which is "expensive to create" the 
   real object is only created when the client wants to access it.(kind of lazy instantiation). 
   We can also provide some kind of caching system in between.
   
   - `Remote Proxy`: A remote proxy provides local representation of a remote resource to enhance performance.
    
   - `Protective Proxy`: A protective proxy controls the access to a resource by checking the caller permission.
   
   ### Note:  
   In this example we are going to implement `Remote Proxy`.
   
   ## Problem:
   Imagine we have need to create a Http connection with a web server and fetch some data if we need from web server.
   
   Creating a connection is expensive and we might not even use the web server at all.
    
   ## Solution:
   We can use Proxy to enhance the performance so that when ever we need some information from server it will
   instantiate a connection to the server and fetches the information and also it can cache the data so we won't 
   make another call to the server again and save some time.
   