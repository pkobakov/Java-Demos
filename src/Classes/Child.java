package Classes;
//inheritance, method override
public class Child extends Person {

    int age;
    public Child(String name, int age){
        super(name, age);


    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Class: %s", this.getClass().getSimpleName());
    }
}
