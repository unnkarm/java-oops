import java.util.Scanner;

public class userinput{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Please enter my name:  ");
        String name= sc.nextLine();
        
        
        System.out.println(name);
        

        System.out.print("Enter your age:  ");
        int age= sc.nextInt();

        System.out.println(age);
    }
}

//next() → one word
//nextInt() → one integer
//nextDouble() → one decimal
//nextLine() → the whole line