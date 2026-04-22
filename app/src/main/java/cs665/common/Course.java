package cs665.common;

import cs665.behavioral.Observer;
import java.util.ArrayList;
import java.util.List;

public class Course {
    private String code;
    private String title;
    private String description;
    private String syllabus;
    private Faculty faculty;
    private Concentration concentration;
    private int enrollmentLimit;

    private List<Observer> observers = new ArrayList<>();

    public Course(String code, String title, String description, String syllabus,
                  Faculty faculty, Concentration concentration, int enrollmentLimit) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.syllabus = syllabus;
        this.faculty = faculty;
        this.concentration = concentration;
        this.enrollmentLimit = enrollmentLimit;
    }

    public Course(String code, int enrollmentLimit) {
        this(code, code, "", "", null, null, enrollmentLimit);
    }

    public String getCode() {
        return code;
    }

    public int getEnrollmentLimit() {
        return enrollmentLimit;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}