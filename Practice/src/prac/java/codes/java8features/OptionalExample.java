package prac.basics.java.codes.java8features;

import java.util.Optional;

public class OptionalExample {
    public static void main(String args[]) {

        Optional<Cat> cat = findMyCat("Julie");

/*      Not checking null:
        Cat cat1 = cat.get();
        cat1.getName();
        cat1.getAge();
*/

/*      Checking null:
        if(cat.isPresent()){
            Cat cat1 = cat.get();
            cat1.getName();
            cat1.getAge();
        }
*/


/*      If cat is null, returns Else part
        Cat cat1 = cat.orElse(new Cat("Mary", 5));
        System.out.println(cat1.getName());
        System.out.println(cat1.getAge());
*/


        Integer age = cat.map(Cat::getAge).orElse(0);
        System.out.println(age);
    }

    private static Optional<Cat> findMyCat(String name) {

        Cat cat = new Cat(name, 3);
        return Optional.ofNullable(cat);
    }


}


class Cat {

    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}