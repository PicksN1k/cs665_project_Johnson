package cs665.common;

import java.util.ArrayList;
import java.util.List;

public class FullTimeFaculty extends Faculty {
    private List<Student> advisees;

    public FullTimeFaculty(String name, String email) {
        super(name, email);
        this.advisees = new ArrayList<>();
    }

    public FullTimeFaculty(String name) {
        super(name, name.toLowerCase().replace(" ", ".") + "@cs.edu");
        this.advisees = new ArrayList<>();
    }

    @Override
    public int maxCoursesPerSemester() {
        return 3;
    }

    public void addAdvisee(Student student) {
        advisees.add(student);
    }

    public List<Student> getAdvisees() {
        return advisees;
    }
}