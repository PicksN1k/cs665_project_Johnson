package cs665.common;

public class Chairperson extends Faculty {

    public Chairperson(String name, String email) {
        super(name, email);
    }

    public Chairperson(String name) {
        super(name, name.toLowerCase().replace(" ", ".") + "@cs.edu");
    }

    @Override
    public int maxCoursesPerSemester() {
        return 1;
    }

    public void receiveNotification(String message) {
        System.out.println("[Chairperson Notification] " + getName() + ": " + message);
    }
}