package cs665.behavioral;

public interface Subject {
    void addObserver(Observer o);
    void notifyObservers(String message);
}