package cs665.creational.singleton;

public class Department {

    private static Department instance;

    private String name;

    // private constructor prevents direct creation
    private Department() {
        this.name = "Computer Science Department";
    }

    // global access point
    public static Department getInstance() {
        if (instance == null) {
            instance = new Department();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void displayMessage() {
        System.out.println("Managing operations for: " + name);
    }
}