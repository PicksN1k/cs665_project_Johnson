package cs665.common;

import cs665.behavioral.Observer;

public class Chairperson extends Faculty implements Observer {

    public Chairperson(String name) {
        super(name, name.toLowerCase().replace(" ", ".") + "@cs.edu");
    }

    public Chairperson(String name, String email) {
        super(name, email);
    }

    @Override
    public int maxCoursesPerSemester() {
        return 1;
    }

    @Override
    public void update(String message) {
        System.out.println("[Chairperson Alert] " + getName() + ": " + message);
    }
}