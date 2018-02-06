# Chain of Responsibility Design Pattern:
    
   ## Intent:
   - Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle 
   the request. Chain the receiving objects and pass the request along the chain until an object handles it.
   
   - Launch-and-leave requests with a single processing pipeline that contains many possible handlers.
   
   - An object-oriented linked list with recursive traversal.
    
   ## Problem:
   Imagine a Web-Service which handle different types of request and generate a response accordingly.
   For example if a request wants a JSON media type as Response format our web-service should respond in
   JSON format also if another request wants a XML media type as Response our web-service should respond
   in XML format.
    
   ## Solution:
   We use chain of responsibility to generate desired format of response for each request!
   