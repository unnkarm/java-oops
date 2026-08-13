import java.awt.*; //* means all

public class PrimvsNonprimMem {
    public static void main(String[] args) {
        Point a=new Point (1,2);
        Point b=a;
        a.x=3;
        System.out.println(b); //Output will be x=3, y=2;
    }
}

//Without awt any value written after b=a won't affect the value of a.