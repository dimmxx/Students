package students;
import java.util.Random;

public class Group {

    private int groupID;
    private final int GROUPSIZE = 25;
    private Student[] membership = new Student[GROUPSIZE];
    private int quantity = 0;
    private Student groupLeader;
    private int[] leaderThreshold = {50, 50, 50}; //{performance, attendance, activity}


    public Group(int groupID){
        this.groupID = groupID;
    }

    public void addStudent(Student student){
        this.membership[quantity] = student;
        this.quantity++;
        student.setGroup(groupID);
    }







    public void printGroup(){
        System.out.println("Group " + this.groupID + ":");
        for(int i = 0; i < this.membership.length; i++) {
            if(membership[i] != null) System.out.println(i + 1 + ". "
                    + this.membership[i].getfName() + " " + this.membership[i].getsName());
        }
    }
    // Elect Group Leader: the first round of elections.
    int leaderCandSize = 0;
    Student[] leaderCandidate = new Student[GROUPSIZE];
    public void selectLeaderFirstRound(){
        for(int i = 0; i < this.quantity; i++){
            if(this.membership[i].getPerformance() >= leaderThreshold[0]
                    & this.membership[i].getAttendance() >= leaderThreshold[1]
                    & this.membership[i].getPerformance() >= leaderThreshold[2]){
                leaderCandidate[leaderCandSize] = membership[i];
                leaderCandSize++;
            }
        }
        if (leaderCandSize == 1){
            this.groupLeader = leaderCandidate[0];
            System.out.println("The leader of the Group " + this.groupID + " is " +
                    this.groupLeader.getfName() + " " + this.groupLeader.getsName());
        } else{
            System.out.println("The list of candidates: ");
            for(int i = 0; i < leaderCandSize; i++)
                System.out.println(leaderCandidate[i].getfName() + " " + leaderCandidate[i].getsName());
        }
    }

// Elect Group Leader: the second round of elections.
    public void selectLeaderSecondRound() {
        Random rnd = new Random();
        if (leaderCandSize == 0) {
            int num = rnd.nextInt(quantity);
            this.groupLeader = this.membership[num];
        } else {
            int num = rnd.nextInt(leaderCandSize);
            this.groupLeader = leaderCandidate[num];
        }
        System.out.println("The leader of the Group "
                + this.groupID + " is " + groupLeader.getfName() + " " + groupLeader.getsName());
    }




}








