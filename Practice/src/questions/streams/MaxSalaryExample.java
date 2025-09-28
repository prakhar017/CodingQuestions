package streams;

import java.util.*;
import java.util.stream.IntStream;

class EmployeeMaxSalary {
    private String name;
    private double salary;

    public EmployeeMaxSalary(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " (" + salary + ")";
    }
}


public class MaxSalaryExample {
    public static void main(String[] args) {
        List<EmployeeMaxSalary> employees = Arrays.asList(
                new EmployeeMaxSalary("John", 50000),
                new EmployeeMaxSalary("Jane", 60000),
                new EmployeeMaxSalary("Jack", 45000),
                new EmployeeMaxSalary("Jill", 75000)
        );

        Random random = new Random();
        IntStream randStream = random.ints(5);
        randStream.forEach(System.out::println);

        Optional<EmployeeMaxSalary> maxSalaryEmployee = employees.stream()
                .max(Comparator.comparingDouble(EmployeeMaxSalary::getSalary));

        //.sorted(Comparator)
        //.max(Comparator)
        //Collectors.minBy(Comparator)
        //.max(Integer :: compare)

        maxSalaryEmployee.ifPresent(employee ->
                System.out.println("Employee with max salary: " + employee));

        Double doubleSalary = employees.stream().map(EmployeeMaxSalary::getSalary).max(Double::compare).get();

        employees.stream().filter(e -> e.getSalary() == doubleSalary).forEach(System.out :: println);
    }
}



