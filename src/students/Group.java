package students;

public class Group {

    private int groupID;
    private final int GROUPSIZE = 25;
    private Student[] membership = new Student[GROUPSIZE];
    private int quantity = 0;
    private int[] leaderThreshold = {80, 90, 90}; //{performance, attendance, activity}

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

    public Student[] selectLeader(){
        Student[] leaderCandidate = new Student[GROUPSIZE];
        int leaderCandSize = 0;
        for(int i = 0; i < this.membership.length; i++){
            if(this.membership[i].getPerformance() >= leaderThreshold[0]
                    & this.membership[i].getAttendance() >= leaderThreshold[1]
                    & this.membership[i].getPerformance() >= leaderThreshold[0]){
                leaderCandidate[leaderCandSize] = membership[i];
                leaderCandSize++;
            }
        }
        if (leaderCandSize == 1){
            System.out.println("The leader of the Group " + this.groupID + " is " +
                    leaderCandidate[0].getfName() + " " + leaderCandidate[0].getsName());
            return  null;
        } else return leaderCandidate;
    }






}
