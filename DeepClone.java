/*
Create a program that will deepclone an object that has 2 variables.
Show that the 2 objects' variables are independent of each other
by changing one variable
Give the classes, objects and variables actual names.

*/
class Dog implements Cloneable{ 
    
    String dogtype;
    String bark; 
    
    public Object clone() throws CloneNotSupportedException { 
            
            Dog puppy = (Dog)super.clone();
            
            return puppy; 
    } 
} 
public class DeepClone{ 
    
    public static void main(String args[]) throws CloneNotSupportedException{ 
      
        Dog labrador = new Dog(); 
        labrador.dogtype = "Mother labrador"; 
        labrador.bark = "Bark one"; 
  
        Dog labrador2  = (Dog)labrador.clone(); 
        // Creating a clone of labrador and passing it to labrador2 
       
        labrador2.dogtype = "Second labrador"; 
        labrador2.bark = "Bark 2"; 
  
        System.out.println("Original " + labrador.dogtype + " its bark\n" + labrador.bark + "\n" ); 
        System.out.println("Copy "+ labrador2.dogtype + " its bark2 \n " + labrador2.bark + "\n" ); 
    } 
}