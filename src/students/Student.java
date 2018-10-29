package students;

public class Student {

     public Student(String fName, String sName) {
        this.fName = fName;
        this.sName = sName;
    }

    public Student(String fName, String sName, int group, int performance, int attendance, int activity) {
        this.fName = fName;
        this.sName = sName;
        this.group = group;
        this.performance = performance;
        this.attendance = attendance;
        this.activity = activity;
    }

    private String fName;
    private String sName;
    private int group;
    private int performance;
    private int attendance;
    private int activity;


    public String getfName() {
        return fName;
    }

    public String getsName() {
        return sName;
    }


    public void printStudent(){
        System.out.println("First name: " + fName);
        System.out.println("Second name: " + sName);
        System.out.println("Group number: " + group);
        System.out.println("Performance: " + performance);
        System.out.println("Attendance: " + attendance);
        System.out.println("Activity: " + activity);

    }
}



