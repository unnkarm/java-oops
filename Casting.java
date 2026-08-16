public class Casting{
    public static void main(String[] args){
        /*long a=10;
        int b=a;*/ //correct

        long a = 10;
        int b = (int) a;     //byte > short > int > long > float > double (BSILFD)

        int x = Integer.parseInt("5");

        System.out.println(x);

    }
}