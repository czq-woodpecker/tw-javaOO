package practice08;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(Integer id, String name, Integer age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        return this.klass == null ?
                super.introduce() + " I am a Teacher. I teach No Class."
                : super.introduce() + " I am a Teacher. I teach " + this.klass.getDisplayName() + ".";
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduceWith(Student student) {
        return student.getKlass() == this.klass ?
                super.introduce() + " I am a Teacher. I teach " + student.getName() + "."
                : super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";

    }
}
