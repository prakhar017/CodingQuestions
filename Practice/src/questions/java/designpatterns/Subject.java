package java.designpatterns;

import java.util.ArrayList;
import java.util.List;

public interface Subject {

    void addObservers(Observer o);

    void removeObservers(Observer o);

    void notifyObservers();

}

interface Observer {

    void update();


}

class ConcreteSubject implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }

    @Override
    public void addObservers(Observer o) {
        observers.add(o);

    }

    @Override
    public void removeObservers(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers)
            o.update();

    }
}


class ConcreteObserver implements Observer {
    private ConcreteSubject subject;
    private String name;

    public ConcreteObserver(ConcreteSubject subject, String name) {
        this.subject = subject;
        this.name = name;
        this.subject.addObservers(this);
    }

    @Override
    public void update() {
        System.out.println("Observer" + name + "recieved state : " + subject.getState());

    }
}

class PatterMain{

    public static void main(String[] args) {

        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer1 = new ConcreteObserver(subject, "Observer 1");
        ConcreteObserver observer2 = new ConcreteObserver(subject, "Observer 2");
        subject.setState("Msg 1");
        subject.setState("Msg 2");


    }
}