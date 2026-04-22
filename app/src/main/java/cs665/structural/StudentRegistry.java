package cs665.structural;

import java.util.ArrayList;
import java.util.List;

public class StudentRegistry {

    private List<StudentRecord> students;

    public StudentRegistry() {
        students = new ArrayList<>();
    }

    public void addStudent(StudentRecord student) {
        students.add(student);
        System.out.println("Student registered: " + student.getName());
    }

    public List<StudentRecord> getStudents() {
        return students;
    }
}