package practice09;


import java.util.ArrayList;
import java.util.List;

public class Klass {
    private Integer number;
    private Student leader;
    private List<Student> members = new ArrayList<>();;

    public Klass() {
    }

    public Klass(Integer number) {
        this.number = number;
    }

    public void assignLeader(Student student) {
        if(members.contains(student)) {
            this.leader = student;
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public Integer getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }

    public String getDisplayName() {
        return "Class " + this.number;
    }

    public void appendMember(Student student) {
        members.add(student);
    }
}
