package practice06;

public class Teacher extends Person {
    private Integer klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Integer getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return this.klass == null ?
                super.introduce() + " I am a Teacher. I teach No Class."
                : super.introduce() + " I am a Teacher. I teach Class " + this.klass + ".";
    }
}
