package prac.basics.java.codes.multithreading;

import prac.basics.java.codes.Employee;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {


    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getAge() - e2.getAge();
    }
}
