import de.neuefische.controlflow.model.Student;

public class StudentExample {

    public static void main(String[] args) {

        Student student1 = new Student("Peter Rabbit", 12345678, "Biology");
        Student student2 = new Student("Tina Turner", 87654321, "Chemistry");
        Student student3 = new Student("Otto von Bismarck", 24681357, "Sociology");


        /*Student student1 = new Student();
        student1.setName("Richie Rich");
        student1.setStudentId(10023456);
        student1.setDegreeProgram("Computer Science");
        toString(student1);

        Student student2 = new Student();
        student2.setName("Barbra Streisand");
        student2.setStudentId(10064729);
        student2.setDegreeProgram("Business Management");
        toString(student2);

        Student student3 = new Student();
        student3.setName("Rachel Green");
        student3.setStudentId(10075638);
        student3.setDegreeProgram("Hospitality Management");
        toString(student3);

        printStudents(student1);
        printStudents(student2);
        printStudents(student3);*/

    }

    private static void printStudents(Student student1) {
        System.out.println(student1);

    }
}
