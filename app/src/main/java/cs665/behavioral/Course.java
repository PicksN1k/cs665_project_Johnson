package cs665.behavioral;

import java.util.ArrayList;
import java.util.List;

public class Course implements Subject {

    private String name;
    private int capacity;
    private List<Observer> observers = new ArrayList<>();

    public Course(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }
}