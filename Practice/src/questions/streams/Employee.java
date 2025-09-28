package prac.basics.streams;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee {
    int id;

    String name;

    int age;

    String gender;

    String department;

    int yearOfJoining;

    double salary;

    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Id : " + id
                + ", Name : " + name
                + ", age : " + age
                + ", Gender : " + gender
                + ", Department : " + department
                + ", Year Of Joining : " + yearOfJoining
                + ", Salary : " + salary;
    }
}

class Employee_Main {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

/*
     Query 3.1 : How many male and female employees are there in the organization?

     For queries such as above where you need to group the input elements,
     use the Collectors.groupingBy() method. In this query, we use Collectors.groupingBy() method which takes two arguments.
     We pass Employee::getGender as first argument which groups the input elements based on gender and Collectors.counting()
     as second argument which counts the number of entries in each group.
*/

        Map<String, Long> noOfMaleAndFemaleEmployees=
                employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println(noOfMaleAndFemaleEmployees);
        // {Male=11, Female=6}

/*
        Query 3.2 : Print the name of all departments in the organization?
        Use distinct() method after calling map(Employee::getDepartment) on the stream. It will return unique departments.
*/
        employeeList.stream().map(Employee::getDepartment).distinct().forEach(e -> System.out.println(e));


/*      Query 3.3 : What is the average age of male and female employees?
        Use same method as query 3.1 but pass Collectors.averagingInt(Employee::getAge) as the second argument to Collectors.groupingBy().
*/

        Map<String, Double> avgAgeOfMaleAndFemaleEmployees=
                employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));

        System.out.println(avgAgeOfMaleAndFemaleEmployees);
        // {Male=30.181818181818183, Female=27.166666666666668}

        //Query 3.4 : Get the details of highest paid employee in the organization?

        Double maxSalary = employeeList.stream().map(Employee::getSalary).max(Double::compare).get();
        employeeList.stream().filter(( e -> e.getSalary() == maxSalary)).forEach(System.out :: println);

        /*Query 3.5 : Get the names of all employees who have joined after 2015?
        For such queries which require filtering of input elements, use Stream.filter() method which filters input elements according to supplied Predicate.
        */

        employeeList.stream()
                .filter(e -> e.getYearOfJoining() > 2015)
                .map(Employee::getName)
                .forEach(System.out::println);

        //Query 3.6 : Count the number of employees in each department?

        Map<String, Long> map = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(map);

        // Query 3.7 : What is the average salary of each department?
        Map<String, Double> map1= employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee :: getSalary)));
        System.out.println(map1);

        //Query 3.8 : Get the details of youngest male employee in the product development department?

        Integer integer = employeeList.stream()
                .filter(e -> e.getGender() == "Male" && e.getDepartment() == "Product Development")
                .map(Employee::getAge).min(Integer::compare).get();
        
                employeeList.stream().filter( e -> e.getAge() == integer).forEach(System.out ::println);


        // Query 3.9 : Who has the most working experience in the organization?

        Integer integer1 = employeeList.stream().map(Employee::getYearOfJoining).min(Integer::compare).get();
        employeeList.stream().filter( e-> e.getYearOfJoining() == integer1).forEach(System.out :: println);

        System.out.println("------------------------------------------------------------------------------");




        // Group employees by department

        Map<String, List<Employee>> byDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        byDept.forEach((d,l) -> System.out.println(d + "--> " + l));


        //  Group employees by gender and then by department

        Map<String, Map<String, List<Employee>>> byGenDept = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.groupingBy(Employee::getDepartment)));

        byGenDept.forEach(  (g, d) -> {
            System.out.println(g + "::");
                d.forEach( (de,le) -> System.out.println(de + "-->" + le)) ;
        });

        // Count employees in each department

        Map<String, Long> countEmp = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        countEmp.forEach((d,c) -> System.out.println( d + "-->" + c));

        // Find the oldest employee in each department

        Map<String, Optional<Employee>> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getAge))));
        collect.forEach((d,e) -> System.out.println( d + "-->" + e.get()));

        // Partition employees into two groups: age > 30 and age <= 30

        Map<Boolean, List<Employee>> partitioned = employeeList.stream()
                .collect(Collectors.partitioningBy(e -> e.getAge() > 30));

        partitioned.forEach((isOlder, list) ->
                System.out.println((isOlder ? "Age > 30" : "Age <= 30") + ": " + list));


        // Join all employee names into a single comma-separated string
        String names = employeeList.stream()
                .map(Employee::getName)
                .collect(Collectors.joining(", "));


        //  Get the name of the youngest employee in each department

        Map<String, Optional<Employee>> collect1 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.minBy(Comparator.comparing(Employee::getAge))));

        collect1.forEach((d,e) -> System.out.println(d + "-->" + e.get()));


        // Get a map of department to set of employee names
        Map<String, Set<String>> deptToNames = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getName, Collectors.toSet())));

        deptToNames.forEach((dept, namesSet) ->
                System.out.println(dept + ": " + namesSet));

        // Group employees by age bucket: "<30", "30–50", ">50"
        Map<String, List<Employee>> ageGroups = employeeList.stream().collect(Collectors.groupingBy(e -> {
            if (e.getAge() < 30) return "<30";
            else if (e.getAge() <= 50) return "30-50";
            else return ">50";
        }));

        ageGroups.forEach((bucket, list) ->
                System.out.println(bucket + ": " + list));


        // Sort employees by department and then by age
        List<Employee> sorted = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getDepartment)
                        .thenComparing(Employee::getAge))
                .collect(Collectors.toList());

        System.out.println("Sorted Employees:");
        sorted.forEach(System.out::println);

        //List of names sorted by age (asc), collected in a LinkedList
        LinkedList<String> sortedNames = employeeList.stream()
                .sorted(Comparator.comparingInt(Employee::getAge))
                .map(Employee::getName)
                .collect(Collectors.toCollection(LinkedList::new));
        System.out.println("Sorted Names by Age: " + sortedNames);



        //Check if all employees are above age 18
        boolean allAdults = employeeList.stream()
                .allMatch(emp -> emp.getAge() > 18);

        System.out.println("All employees > 18: " + allAdults);

        //Find the youngest female employee
        Optional<Employee> youngestFemale = employeeList.stream()
                .filter(e -> e.getGender().equalsIgnoreCase("Female"))
                .min(Comparator.comparingInt(Employee::getAge));

        System.out.println("Youngest Female: " + youngestFemale.orElse(null));



        //Create a map of department to average age of male employees only
        Map<String, Double> avgAgeOfMalesByDept = employeeList.stream()
                .filter(e -> e.getGender().equalsIgnoreCase("Male"))
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingInt(Employee::getAge)));

        avgAgeOfMalesByDept.forEach((dept, avg) ->
                System.out.println(dept + ": " + avg));

       // Concatenate employee names per department
        Map<String, String> nameListByDept = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getName, Collectors.joining(", "))));

        nameListByDept.forEach((dept, name) ->
                System.out.println(dept + ": " + name));


        //Find department with the maximum number of employees

        Map<String, Long> deptCount = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        Long maxCount = deptCount.values().stream()
                .max(Long::compare)
                .orElse(0L);

        List<String> topDepartments = deptCount.entrySet().stream()
                .filter(e -> e.getValue().equals(maxCount))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("Max count: " + maxCount);
        System.out.println("Departments with max count: " + topDepartments);


    }



}
