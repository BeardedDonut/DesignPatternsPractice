# Bridge Design Pattern:
    
    ## Intent:
       - Decouple an abstraction from its implementation so that the two can vary independently.
       - Publish interface in an inheritance hierarchy, and bury implementation in its own inheritance hierarchy.
       - Beyond encapsulation, to insulation
    
    ## Problem:
        In a Fantasy World imagine we have different types of vehicles with different types of accelator.
        For example a submarine uses a Propeller as an accelerator mechanism or a space-ship uses Jet as an 
        accelerator mechanism. 
        We need our system to be flexible when we add a new vehicle or we add a new acceleration mechanism.
        For example we might want some submarine with Jet!
    
    ## Solution:
    There are two solution: 
        1- not using bridge design pattern.
        2- using Bridge Design pattern.
    
        1- We can use inheritance but it could end up too much complicated.
        if we want every vehicle with every accelerator we would have classes as below 
        (although it might sound a bit stupid):
            - SubMarineWithPropeller, 
            - SubMarineWithJet, 
            - SpacshipWithPropeller, 
            - SpaceshipWithJet
            
        Now all of sudden we decided to add a new vehicle like a Car then our classes would grow exponentially.
        So as you can see this is not a proper solution.
        
        TODO: explain the benefits of using bridge.
    