package students;


public class testStudents {


    public static void main(String[] args) {

        Student student1 = new Student("John", "Smith");
        student1.printStudent();

        Group group1 = new Group(1);

        group1.addStudent(student1);

        group1.printGroup();






    }

}
