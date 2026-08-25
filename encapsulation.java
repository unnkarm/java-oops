//encapsulation in java-> The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users

//1. declare class variables/attributes as private
//2. provide public get and set methods to access and update the value of a private variable

//Don't let outside code directly mess with your object's data.

class Student{
    private String name;
    private int age;

    //getter method
    public String getName(){  //() does not need any info from you.
        return name;
    }

    //setter method
    public String setName(String name){ // "Alice" -> setName(String name)  [i.e parameter]
        this.name=name;
        return name;
    }

    //getter method
    public int getAge(){
        return age;
    }
  
    public void setAge(int age) {
        if (age >= 5 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    

}

public class encapsulation{
    public static void main(String[] args){
        Student s1=new Student();
        s1.setName("Alice");
        s1.setAge(20);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
}


