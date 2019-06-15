package practice07;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return this.klass == null ?
                super.introduce() + " I am a Teacher. I teach No Class."
                : super.introduce() + " I am a Teacher. I teach " + this.klass.getDisplayName() + ".";
    }

    public String introduceWith(Student student) {
        return student.getKlass() == this.klass ?
                super.introduce() + " I am a Teacher. I teach " + student.getName() + "."
                : super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";

    }
}
