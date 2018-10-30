package students;

public class Student {

    public Student(String fName, String sName, int performance, int attendance, int activity) {
        this.fName = fName;
        this.sName = sName;
        this.performance = performance;
        this.attendance = attendance;
        this.activity = activity;
    }

    private String fName;
    private String sName;
    private int groupId;
    private int performance;
    private int attendance;
    private int activity;


    public String getfName() {
        return fName;
    }

    public String getsName() {
        return sName;
    }

    public void setGroup(int group){
        this.groupId = group;
    }

    public int getPerformance() {
        return performance;
    }

    public int getAttendance() {
        return attendance;
    }

    public int getActivity() {
        return activity;
    }

    public void printStudent(){
        System.out.println("First name: " + fName);
        System.out.println("Second name: " + sName);
        System.out.println("Group ID: " + groupId);
        System.out.println("Performance: " + performance);
        System.out.println("Attendance: " + attendance);
        System.out.println("Activity: " + activity);

    }


    public static void printStudentList() {
        for (int i = 0; i < Generate.getStudentArraySize(); i++) {

            System.out.println(i + 1);
            System.out.println("First name: " + Generate.getStudentArray()[i].fName);
            System.out.println("Second name: " + Generate.getStudentArray()[i].sName);
            System.out.println("Group ID: " + Generate.getStudentArray()[i].groupId);
            System.out.println("Performance: " + Generate.getStudentArray()[i].performance);
            System.out.println("Attendance: " + Generate.getStudentArray()[i].attendance);
            System.out.println("Activity: " + Generate.getStudentArray()[i].activity);
            System.out.println();
        }
    }



}



