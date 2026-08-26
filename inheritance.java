// Inheritance means one class can acquire the properties and methods of another class.

/*
ENCAPSULATION
→ Protect data

ABSTRACTION
→ Hide implementation

INHERITANCE
→ Reuse/extend classes

POLYMORPHISM
→ Same interface, different behavior
*/

class Employee{
    String name;
    double salary;

    void work(){
        System.out.println("Employee is working");   
    }
}

class Developer extends Employee{
    void writeCode(){
        System.out.println("Developer is writing code.");
    }
}

class Manager extends Employee{
    void manageTeam(){
        System.out.println("Manager is managing the team.");
    }
}

public class inheritance{
    public static void main(String[] args){
        Developer d = new Developer();

        d.name="Alice";
        d.salary=50000;

        d.work(); // Employee's method
        d.writeCode(); // Developer's method

        System.out.println(d.name);
        System.out.println(d.salary);

    }

}



 
