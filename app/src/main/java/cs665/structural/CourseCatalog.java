package cs665.structural;

import java.util.ArrayList;
import java.util.List;

public class CourseCatalog {

    private List<CourseRecord> courses;

    public CourseCatalog() {
        courses = new ArrayList<>();
    }

    public void addCourse(CourseRecord course) {
        courses.add(course);
        System.out.println("Course added: " + course.getCode() + " - " + course.getTitle());
    }

    public List<CourseRecord> getCourses() {
        return courses;
    }
}