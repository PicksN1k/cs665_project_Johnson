package cs665.structural;

public class StudentRecord {

    private String studentId;
    private String name;

    public StudentRecord(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }
}