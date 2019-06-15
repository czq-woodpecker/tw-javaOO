package practice11;

import java.util.Objects;

public class Person {
    private Integer id;
    private String name;
    private Integer age;

    public Person() {
    }

    public Person(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        return this.id == ((Person) obj).getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String introduce() {
        return "My name is " + this.name + ". I am " + this.age + " years old.";
    }
}
