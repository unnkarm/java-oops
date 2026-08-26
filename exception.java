import java.util.*;

public class exception{
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();
    int b= sc.nextInt();
    
    try{
       System.out.println("division is: "+(a/b));
    }
    catch(Exception e){
       System.out.println("Error");
   }
   }
}

/*
Exception Handling in Java

Error/Exception	Description
ArithmeticError	Occurs when a numeric calculation goes wrong
ArrayIndexOutOfBoundsException	Occurs when trying to access an index number that does not exist in an array
ClassFormatError	Occurs when a class file cannot be accessed
ClassNotFoundException	Occurs when trying to access a class that does not exist
ConcurrentModificationException	Occurs when an element is added or removed from iterables
FileNotFoundException	Occurs when a file cannot be accessed
IncompatibleClassChangeError	Occurs when there's been a change in a base class after a child class has already been initialized
InputMismatchException	Occurs when entering wrong input (e.g. text in a numerical input)
InterruptedException	Occurs when a Thread is interrupted while waiting/sleeping
InvalidClassException	Occurs when the Serialization runtime observes a problem with a class
IOException	Occurs when an input or output operation fails
NegativeArraySizeException	Occurs when trying to create an array with negative size
NoClassDefFoundError	Occurs when the class is not found at runtime
NoSuchFieldException	Occurs when trying to access a class field/variable that does not exist
NoSuchMethodException	Occurs when trying to access a class method that does not exist
NullPointerException	Occurs when trying to access an object referece that is null
NumberFormatException	Occurs when it is not possible to convert a specified string to a numeric type
RuntimeException	Occurs when an exception occurs at runtime
StringIndexOutOfBoundsException	Occurs when trying to access a character in a String that does not exist
TypeNotPresentException	Occurs when a type cannot be found
IllegalArgumentException	Occurs when when an illegal argument is passed to a method
IllegalStateException	Occurs when when a method is called at an illegal time 
*/
