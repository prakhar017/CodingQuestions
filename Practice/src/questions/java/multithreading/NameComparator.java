package java.multithreading;

import java.Employee;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {


    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}
