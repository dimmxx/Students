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





    public void printStudent(){
        System.out.println("First name: " + fName);
        System.out.println("Second name: " + sName);
        System.out.println("Group ID: " + groupId);
        System.out.println("Performance: " + performance);
        System.out.println("Attendance: " + attendance);
        System.out.println("Activity: " + activity);

    }
}



