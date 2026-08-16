public class Strings { //file name=class name
    public static void main(String[] args) {
        String str1 = "Hello"; //variable declaration and initialization
        String str2 = "World"; //variable declaration and initialization
        String str3 = str1 + " " + str2; //concatenation of strings

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("Concatenated String: " + str3);
        System.out.println(str1.contains("llo"));
    }
}