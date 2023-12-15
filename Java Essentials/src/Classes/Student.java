package Classes;

//inheritance

public class Student extends Person {
    String univercity;
    public Student(String name, int age, String university){
        super(name, age);
        this.univercity = university;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Class: %s", this.getClass().getSimpleName());
    }
}
