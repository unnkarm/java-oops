public class course {
    static class Course {
        private String cName;
        private String cCode;

        Course(String code, String name) {
            cCode = code;
            cName = name;
        }

        Course() {
            cCode = "";
            cName = "";
        }

        void setCourse(String code, String name) {
            cCode = code;
            cName = name;
        }

        String getCourse() {
            return cCode + " | " + cName;
        }
    }

    public static void main(String[] args) {
        String code;
        String name;

        if (args.length >= 2) {
            code = args[0];
            name = args[1];
        } else {
            code = "CS101";
            name = "Programming";
        }

        Course c1 = new Course(code, name);

        if (args.length >= 4) {
            code = args[2];
            name = args[3];
        } else {
            code = "CS102";
            name = "Data Structures";
        }

        Course c2 = new Course(code, name);

        System.out.println("Courses: ");
        System.out.println(c1.getCourse());
        System.out.println(c2.getCourse());
    }
}


