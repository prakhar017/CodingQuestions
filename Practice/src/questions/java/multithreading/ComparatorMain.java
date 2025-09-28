package java.multithreading;

import java.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorMain {

    public static void main(String[] args) {



        List<Employee> list = new ArrayList<>();
        Employee e1 = new Employee(29,"Prakhar");
        Employee e2 = new Employee(30, "Zoja");
        list.add(e1);
        list.add(e2);

        Collections.sort(list, new NameComparator().thenComparing(new AgeComparator()));
        for(Employee e : list){
            System.out.println( e.getAge() + " -->" + e.getName());
        }
    }
}
