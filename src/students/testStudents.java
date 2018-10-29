package students;


public class testStudents {


    public static void main(String[] args) {

        Student student0 = new Student("John", "Smith", 70, 100, 10);
        Student student1 = new Student("Peter", "Williams", 40, 80, 90);
        Student student2 = new Student("Jane", "Jones", 10, 100, 70);
        Student student3 = new Student("Alice", "Taylor", 50, 50, 80);
        Student student4 = new Student("Michael", "Moore", 40, 75, 90);
        Student student5 = new Student("John", "King", 90, 90, 100);
        Student student6 = new Student("Liza", "Smith", 80, 85, 20);
        Student student7 = new Student("Mary", "Walker", 60, 20, 80);
        Student student8 = new Student("Jack", "Turner", 70, 95, 70);
        Student student9 = new Student("Kate", "Morgan", 100, 100, 10);





        student1.printStudent();

        Group group1 = new Group(1);

        group1.addStudent(student1);

        group1.printGroup();

        student1.printStudent();






    }

}
