package students;

public class Group {

    private int groupID;
    private Student[] membership = new Student[25];
    private int quantity = 0;

    public Group(int groupID){
        this.groupID = groupID;
    }

    public void addStudent(Student student){
        this.membership[quantity] = student;
        this.quantity++;
    }

    public void printGroup(){
        System.out.println("Group " + this.groupID + ":");
        for(int i = 0; i < this.membership.length; i++) {
            if(membership[i] != null) System.out.println(i + 1 + ". "
                    + this.membership[i].getfName() + " " + this.membership[i].getsName());
        }
    }


    public Student selectLeader(){
        for(int i = 0; i < this.membership.length; i++){

        }




        return null;
    }






}
