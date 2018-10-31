package students;

public class Professor {

    private String surname;
    private Group[] groupToProf = new Group[1];

    public Professor(String surname) {
        this.surname = "Professor " + surname;
    }


    public Group[] getGroupToProf() {
        return groupToProf;
    }

    public String getSurname() {
        return surname;
    }

    public void addGroupToProf(Group group){
        this.groupToProf[0] = group;
    }

    public void printProf(){
        System.out.println(this.surname);
        System.out.println("is allotted to Group " + this.groupToProf[0].getGroupID());
    }

    public void checkAttandance(){
        Group group = this.groupToProf[0];
        System.out.println("The full list of Group " + group.getGroupID() + ":");
        group.printGroup();
        System.out.println();
        System.out.println(group.getQuantity() + " students in the group in total.");
        System.out.println(group.getAbsentArray().length + " student(s) is(are) absent today:");
        for (int i = 0; i < group.getAbsentArray().length; i++){
            System.out.println(group.getMembership()[group.getAbsentArray()[i]].getfName() +
                    " " + group.getMembership()[group.getAbsentArray()[i]].getsName());
        }
        System.out.println(group.getQuantity() - group.getAbsentArray().length +
                " student(s) is(are) present in the class today.");
    }
}





