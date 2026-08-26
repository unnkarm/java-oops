// Polymorphism in Java

// Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.

// to perform reusability : reuse attributes and methods of an existing class when you create a new class.

class Animal{
    void sound(){
        System.out.print("Animal makes a sound");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.print("Dog barks");
    }
}

class Cat extends Animal{
    @Override
    void sound(){
        System.out.print("Cat meows");
    }
}

public class polymorph{
    public static void main(String[] args){
        Animal a1=new Dog(); //polymorphism : parent class reference variable can refer to child class object   
        Animal a2=new Cat();

        a1.sound();
        a2.sound();


    }
}

/*
Inheritance
     ↓
Dog extends Animal
     ↓
Dog can override sound()
     ↓
Polymorphism
     ↓
Animal a = new Dog()
     ↓
a.sound()
     ↓
Dog's sound() executes
*/



