package cs665.behavioral;

import java.util.HashMap;
import java.util.Map;

public class StudentStrategy {
    private String name;
    private Map<String, Character> grades;
    private GpaStrategy strategy;

    public StudentStrategy(String name, GpaStrategy strategy) {
        this.name = name;
        this.strategy = strategy;
        this.grades = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(String course, char grade) {
        grades.put(course, grade);
    }

    public double calculateGpa() {
        return strategy.calculate(grades);
    }
}