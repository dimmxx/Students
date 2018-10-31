package students;
import java.util.Scanner;
import java.util.Arrays;

public class testStudents {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Now we are going to generate a random list of 50 students. Every student has next fields:\n" +
                           "First name, Second Name and numeric characteristics (0 - 100) - Performance, Attendance and Activity.\n" +
                           "The field Group ID is null because students have not been assigned to any group yet");
        pause();

        Generate.generateStudent(50);
        Student.printStudentList();

        System.out.println("The list of students is generated. You can scroll up and have a look at it.\n" +
                           "Now we are going to create 2 groups: Group1 and Group2 and fill them with students (25 to every group).\n" +
                           "And print out the membership of every group.");
        pause();

        Group group1 = new Group(1);
        Group group2 = new Group(2);

        for(int i = 0; i < 25; i++){
            group1.addStudent(Generate.getStudentArray()[i]);
        }
        for(int i = 25; i < 50; i++){
            group2.addStudent(Generate.getStudentArray()[i]);
        }

        group1.printGroup();
        System.out.println();
        group2.printGroup();

        System.out.println();
        System.out.println("We can print out the list of all the students with Group ID defined.");
        pause();

        Student.printStudentList();

        System.out.println("Now we are going to hold elections of leaders of the groups.\n" +
                "The elections are expected to take 2 rounds. During the first round candidates will be \n" +
                "estimated on their personal characteristics - performance, attendance and activity.\n" +
                "Thresholds of personal characteristics values are 50-50-50 (Performance/Attemdance/Activity).\n" +
                "In case there are 0 or >1 candidates after the first round - the second round will be held\n" +
                "If there is only 1 candidate - he(she) will be elected as the leader of the group");

        pause();
        System.out.println("Group1: The first round elections results:\n");

        group1.selectLeaderFirstRound();
        System.out.println("The number of candidates: " + group1.leaderCandSize + "\n");

        System.out.println("Group2: The first round elections results:\n");

        group2.selectLeaderFirstRound();
        System.out.println("The number of candidates: " + group2.leaderCandSize + "\n");

        pause();
        System.out.println("Now starting the second round of elections. The candidates will cast lots to define a leader.\n");

        pause();

        group1.selectLeaderSecondRound();
        group2.selectLeaderSecondRound();


        System.out.println();
        System.out.println("Now we are inviting 2 professors - professor1 and professor2 and assign groups to them.");
        pause();

        Professor professor1 = new Professor("Maxwell");
        professor1.addGroupToProf(group1);
        professor1.printProf();

        System.out.println();

        Professor professor2 = new Professor("Newton");
        professor2.addGroupToProf(group2);
        professor2.printProf();

        System.out.println();
        System.out.println("Professors are starting lessons in Group 1 and Group 2.");
        pause();

        group1.startLesson();
        System.out.println(group1.getNumberAbsent() + " student(s) is(are) absent today in Group " + group1.getGroupID());
        //System.out.println(Arrays.toString(group1.getAbsentArray()));

        group2.startLesson();
        System.out.println(group2.getNumberAbsent() + " student(s) is(are) absent today in Group " + group2.getGroupID());

        pause();


        System.out.println(professor1.getSurname() + " is taking attendance in Group " + professor1.getGroupToProf()[0].getGroupID());

        professor1.checkAttandance();

        System.out.println();
        System.out.println(professor2.getSurname() + " is taking attendance in Group " + professor2.getGroupToProf()[0].getGroupID());

        professor2.checkAttandance();



    }


    public static void pause(){
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Press ENTER to continue...");
        String temp = scan.nextLine();

    }

}
