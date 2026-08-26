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
