/* Abstraction in Java
Data abstraction is the process of hiding certain details and showing only essential information to the user.

Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

The abstract keyword is a non-access modifier, used for classes and methods


 */

abstract class Payment{
    abstract void pay(double amount); //abstract method

    //non-abstract method
    void paymentSuccessful(){
        System.out.println("Payment successful!");
    }
}

class UPI extends Payment{
    @Override
    void pay(double amount){
        System.out.println(amount + " using UPI");
    }
}

class CreditCard extends Payment{
    @Override
    void pay(double amount){
        System.out.println(amount + " using Credit Card");
    }
}

public class abstraction{
    public static void main(String[] args){
        Payment p1=new UPI();  //here we are using polymorphism, we can use the parent class reference to refer to the child class object.

        p1.pay(500);
        p1.paymentSuccessful();

        System.out.println();


        // Payment using Credit Card
        Payment p2 = new CreditCard();

        p2.pay(1000);
        p2.paymentSuccessful();System.out.println();


        
    }
}

/*
                 Payment
                    │
             abstract pay()
                    │
          ┌─────────┴─────────┐
          ↓                   ↓
         UPI              CreditCard
          │                   │
     implements           implements
       pay()                 pay()
          │                   │
       UPI logic          Card logic




 */