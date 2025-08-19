package prac.basics.java.codes.designpatterns;

public interface Factory_Animal {

    void makeSound();
}

class Dog implements Factory_Animal{


    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}


class Catt implements  Factory_Animal{


    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}


abstract class AnimalFactory{

    abstract Factory_Animal createAnimal();

    void describeAnimal(){
        Factory_Animal factory_animal = createAnimal();
        factory_animal.makeSound();
    }
}

class DogFactory extends AnimalFactory{


    @Override
    Factory_Animal createAnimal() {
        return new Dog();
    }
}

class CatFactory extends  AnimalFactory{



    @Override
    Factory_Animal createAnimal() {
        return new Catt();
    }
}


class MainFactory {

    public static void main(String[] args) {

        AnimalFactory animalFactory = new DogFactory();
        animalFactory.describeAnimal();
    }
}