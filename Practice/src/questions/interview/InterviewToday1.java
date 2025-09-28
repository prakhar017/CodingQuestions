package interview;

import java.util.*;
import java.util.stream.Collectors;

public class InterviewToday1 {

    public static void main(String[] args) {

/*        Group & Sort by salary in Desc order for list of employee using java8

        Employee
        - firstname (String)
        - Salary(Float)

        Input Data
        dyz  [50000.00]
        abc  [20000.00]
        dfg  [30000.00]
        xyz  [40000.00]
        cde  [30000.00]

        Output data

        50000.00 -> dyz
        40000.00 -> xyz
        30000.00 -> [cde,dfg]
        20000.00 -> abc*/

/*        List<Employee1> emplList = new ArrayList<>();
        Employee1 emp1 = new Employee1("dyz", 50000L);
        Employee1 emp2 = new Employee1("abc", 20000L);
        Employee1 emp3 = new Employee1("dfg", 30000L);
        Employee1 emp4 = new Employee1("xyz", 40000L);
        Employee1 emp5 = new Employee1("cde", 30000L);
        emplList.add(emp1);
        emplList.add(emp2);
        emplList.add(emp3);
        emplList.add(emp4);
        emplList.add(emp5);*/

        List<Employee1> emplList =  Arrays.asList(
                new Employee1("dyz", 50000L),
                new Employee1("abc", 20000L),
                new Employee1("dfg", 30000L),
                new Employee1("xyz", 40000L),
                new Employee1("cde", 30000L));

        LinkedHashMap<Long, List<Employee1>> map = emplList.stream().sorted(Comparator.comparing(Employee1::getSalary).reversed())
                .collect(Collectors.groupingBy(Employee1::getSalary, LinkedHashMap::new, Collectors.toList()));


        map.forEach((x,y) -> {
            System.out.println(x + " -->" + y);
        });



    }
}
