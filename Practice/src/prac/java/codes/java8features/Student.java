package prac.basics.java.codes.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Student {
    
    private int age;

    public int getAge() {
        return age;
    }

    public Student(int age, String gender, int salary) {
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }

    private String gender;
    private int salary;
}

 class TestStudent{

     public static void main(String[] args) {
         
         List<Student> listOfStudent = new ArrayList<>();
         listOfStudent.add(new Student(28,"Male", 120 ));
         listOfStudent.add(new Student(29,"Female", 100 ));
         listOfStudent.add(new Student(30,"Male", 150 ));


         Integer maxSalary = listOfStudent.stream().map(Student::getSalary).max(Integer::compare).get();
         //System.out.println(maxSalary);
         listOfStudent.stream().filter(s -> s.getSalary() == maxSalary).forEach(System.out::println);

         Optional<Integer> reduce = listOfStudent.stream().map(Student::getSalary).reduce(Integer::sum);
         reduce.ifPresent(System.out::println);

         Map<String, Long> collect = listOfStudent.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
         System.out.println(collect);

     }
    
}
