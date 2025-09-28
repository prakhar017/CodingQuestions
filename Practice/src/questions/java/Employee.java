package java;

public class Employee {

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    private int age;
    private String name;

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
