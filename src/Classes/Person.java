package Classes;

import Contracts.IPerson;

public class Person extends Eating implements IPerson {

    private String name;
    private int age;


    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String Eat() {
        return String.format("%s eating right now!", this.name);
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Age: %s", this.name, this.age);
    }

    @Override
    public int CanCalculate(int a, int b) {
        return a + b;
    }

    @Override
    public boolean CanEat() {
        return true;
    }
}
