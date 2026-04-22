package cs665.common;

public class Course {
    private String code;
    private String title;
    private String description;
    private String syllabus;
    private Faculty faculty;
    private Concentration concentration;
    private int enrollmentLimit;

    public Course(String code, String title, String description, String syllabus,
                  Faculty faculty, Concentration concentration, int enrollmentLimit) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.syllabus = syllabus;
        this.faculty = faculty;
        this.concentration = concentration;
        this.enrollmentLimit = enrollmentLimit;
    }

    public Course(String code, int enrollmentLimit) {
        this(code, code, "", "", null, null, enrollmentLimit);
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getSyllabus() {
        return syllabus;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public Concentration getConcentration() {
        return concentration;
    }

    public int getEnrollmentLimit() {
        return enrollmentLimit;
    }

    public String format() {
        return "<div class='course'><h3>" + code + ": " + title + "</h3>"
                + "<p>" + description + "</p>"
                + "<p><strong>Syllabus:</strong> " + syllabus + "</p>"
                + "</div>";
    }

    @Override
    public String toString() {
        return code + " - " + title;
    }
}