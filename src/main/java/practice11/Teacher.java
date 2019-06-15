package practice11;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    private List<Klass> classes = new ArrayList<>();
    private TeacherListen teacherListen = new TeacherListen();

    public Teacher(Integer id, String name, Integer age, List<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        for(Klass klass : classes) {
            klass.setTeacherListen(teacherListen);
        }
    }

    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        if (classes.size() == 0) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        StringBuffer stringBuffer = new StringBuffer(super.introduce() + " I am a Teacher. I teach Class");
        for (Klass klass : classes) {
            stringBuffer.append(" " + klass.getNumber() + ",");
        }
        stringBuffer.delete(stringBuffer.length() - 1, stringBuffer.length());
        stringBuffer.append(".");
        return stringBuffer.toString();
    }

    public boolean isTeaching(Student student) {
        for (Klass klass : classes) {
            if (klass.isIn(student)) {
                return true;
            }
        }
        return false;
    }

    public List<Klass> getClasses() {
        return classes;
    }

    public String introduceWith(Student student) {
        return isTeaching(student) ?
                super.introduce() + " I am a Teacher. I teach " + student.getName() + "."
                : super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";

    }

    class TeacherListen {
        void sendStudentLeaderMessage(Klass klass) {
            System.out.print("I am " + getName() + ". I know " + klass.getLeader().getName() + " become Leader of Class " + klass.getNumber() + ".\n");
        }

        void sendStudentJoinMessage(Student student, Klass klass) {
            System.out.print("I am " + getName() + ". I know " + student.getName() + " has joined Class " + klass.getNumber() + ".\n");
        }
    }

}
