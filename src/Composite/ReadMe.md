# Composite Design Pattern:
    
   ## Intent:
   - Compose objects into tree structures to represent whole-part hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.
    
   - Recursive composition. 
    
   - "Directories contain entries, each of which could be a directory."

   ## UML Diagram
   ![Image][uml-diagram]
   
   ## Problem:
   OS file system can be a proper example. In an OS we have `File`s.
   `File`s can be of different type like `Text`, `Shortcut`, `Executable` and also `Folder`s.
   
   `Folder`s could contain a bunch of `File`s.
    
   ## Solution:
   You have noticed that there is a recursive composition involved in this problem. To tackle this problem we can use `Composite` design pattern. 
   
[uml-diagram]: hhttps://github.com/navid9675/DesignPatternsPractice/blob/master/src/Composite/UML-Diagram.png
