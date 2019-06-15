package practice10;

public class Student extends Person {
    private Klass klass;

    public Student(Integer id, String name, Integer age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
        klass.appendMember(this);
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return this.klass.getLeader() == this ?
                super.introduce() + " I am a Student. I am Leader of " + this.klass.getDisplayName() + "."
                : super.introduce() + " I am a Student. I am at " + this.klass.getDisplayName() + ".";
    }
}
