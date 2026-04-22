package cs665.behavioral;

public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void notifyStudent(String message) {
        System.out.println("[Student] " + name + ": " + message);
    }
}