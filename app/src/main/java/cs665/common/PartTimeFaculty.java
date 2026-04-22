package cs665.common;

public class PartTimeFaculty extends Faculty {

    public PartTimeFaculty(String name, String email) {
        super(name, email);
    }

    public PartTimeFaculty(String name) {
        super(name, name.toLowerCase().replace(" ", ".") + "@cs.edu");
    }

    @Override
    public int maxCoursesPerSemester() {
        return 1;
    }
}