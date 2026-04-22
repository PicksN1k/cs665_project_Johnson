package cs665.structural;

import java.util.ArrayList;
import java.util.List;

public class CourseRecord {

    private String code;
    private String title;
    private FacultyRecord assignedFaculty;
    private List<StudentRecord> enrolledStudents;

    public CourseRecord(String code, String title) {
        this.code = code;
        this.title = title;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public FacultyRecord getAssignedFaculty() {
        return assignedFaculty;
    }

    public void setAssignedFaculty(FacultyRecord assignedFaculty) {
        this.assignedFaculty = assignedFaculty;
    }

    public List<StudentRecord> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void enrollStudent(StudentRecord student) {
        enrolledStudents.add(student);
    }
}