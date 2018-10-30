package students;


public class testStudents {


    public static void main(String[] args) {
/*
        Student student0 = new Student("John", "Smith", 95, 100, 90);
        Student student1 = new Student("Peter", "Williams", 40, 80, 90);
        Student student2 = new Student("Jane", "Jones", 10, 100, 70);
        Student student3 = new Student("Alice", "Taylor", 100, 60, 90);
        Student student4 = new Student("Michael", "Moore", 40, 75, 90);
        Student student5 = new Student("John", "King", 90, 90, 100);
        Student student6 = new Student("Liza", "Smith", 80, 85, 20);
        Student student7 = new Student("Mary", "Walker", 60, 20, 80);
        Student student8 = new Student("Jack", "Turner", 70, 95, 70);
        Student student9 = new Student("Kate", "Morgan", 100, 100, 10);

        Group group1 = new Group(1);

        group1.addStudent(student0);
        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.addStudent(student3);
        group1.addStudent(student4);

        group1.printGroup();

        group1.selectLeaderFirstRound();
        group1.selectLeaderSecondRound();

*/
    Generate.generateStudent(10);
    Student.printStudentList();


    Group group1 = new Group(1);
    Group group2 = new Group(2);

    for(int i = 0; i < 5; i++){
        group1.addStudent(Generate.getStudentArray()[i]);
    }

     for(int i = 5; i < 10; i++){
        group2.addStudent(Generate.getStudentArray()[i]);
    }

    group1.printGroup();
    group2.printGroup();
    Student.printStudentList();

    group1.selectLeaderFirstRound();
    System.out.println(group1.leaderCandSize);

    group2.selectLeaderFirstRound();
    System.out.println(group2.leaderCandSize);

    group1.selectLeaderSecondRound();
    group2.selectLeaderSecondRound();

    Professor professor1 = new Professor();
    professor1.addGroupToTeach(group1);













    }

}
