public class Arr{
    public static void main(String[] args){
        int[]  marks= new int[4]; //or new int{50,40,30,20};
        marks[0]= 50;
        marks[1]= 40;
        marks[2]= 30;
        marks[3]= 20;
        System.out.println(marks[0]);

        int[][] newMarks= new int[][] {{40,30}, {50,60}};
        System.out.println(newMarks[0][1]);
        
        



    }
}