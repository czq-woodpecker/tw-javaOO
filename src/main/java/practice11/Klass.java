package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private Integer number;
    private Student leader;
    private List<Student> members = new ArrayList<>();
    private Teacher.TeacherListen teacherListen;


    public void setTeacherListen(Teacher.TeacherListen teacherListen) {
        this.teacherListen = teacherListen;
    }

    public Klass(Integer number) {
        this.number = number;
    }

    public void assignLeader(Student student) {
        if(members.contains(student)) {
            this.leader = student;
            if (teacherListen != null) {
                teacherListen.sendStudentLeaderMessage(this);
            }
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
        if(teacherListen != null) {
            teacherListen.sendStudentJoinMessage(student, this);
        }
    }


    public boolean isIn(Student student) {
        for (Student stu : members) {
            if(stu == student) {
                return true;
            }
        }
        return false;
    }


}
