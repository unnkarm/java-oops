/*
A constructor in Java is a special method that is used to initialize objects.

The constructor is called when an object of a class is created.

It can be used to set initial values for object attributes:

!!! All classes have constructors by default.

A normal method:

can have a return type
can have any name
must be called explicitly

A constructor:

has no return type
has the same name as the class
runs when an object is created

 */

//encapsulation + constructor

class Student{
    private String name;
    private int age;

    Student(String name, int age){ //constructor
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age>=5 && age<=100){
            this.age=age;
    }
        else{
            System.out.print("Invalid age");
        }
} 

}

public class constructor{
    public static void main(String[] args){
        Student s1= new Student("Alice", 10);

        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
}

/*
CREATE
   ↓
Constructor
   ↓
Student("Alice", 20)
   ↓
Object exists
   ↓
GET → getAge()
   ↓
READ

SET → setAge(21)
   ↓
CHANGE
*/
 

