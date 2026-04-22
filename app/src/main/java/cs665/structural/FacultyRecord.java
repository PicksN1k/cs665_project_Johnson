package cs665.structural;

public class FacultyRecord {

    private String facultyId;
    private String name;

    public FacultyRecord(String facultyId, String name) {
        this.facultyId = facultyId;
        this.name = name;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public String getName() {
        return name;
    }
}