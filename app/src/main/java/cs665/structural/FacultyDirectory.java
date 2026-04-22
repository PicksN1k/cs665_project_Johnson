package cs665.structural;

import java.util.ArrayList;
import java.util.List;

public class FacultyDirectory {

    private List<FacultyRecord> facultyMembers;

    public FacultyDirectory() {
        facultyMembers = new ArrayList<>();
    }

    public void addFaculty(FacultyRecord faculty) {
        facultyMembers.add(faculty);
        System.out.println("Faculty added: " + faculty.getName());
    }

    public List<FacultyRecord> getFacultyMembers() {
        return facultyMembers;
    }
}