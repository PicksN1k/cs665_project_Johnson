package cs665.common;

public abstract class Faculty extends Person {

    public Faculty(String name, String email) {
        super(name, email);
    }

    public abstract int maxCoursesPerSemester();
}