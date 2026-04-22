package cs665.structural;

public class DepartmentFacade {

    private StudentRegistry studentRegistry;
    private CourseCatalog courseCatalog;
    private FacultyDirectory facultyDirectory;

    public DepartmentFacade() {
        studentRegistry = new StudentRegistry();
        courseCatalog = new CourseCatalog();
        facultyDirectory = new FacultyDirectory();
    }

    public void registerStudent(StudentRecord student) {
        studentRegistry.addStudent(student);
    }

    public void addCourse(CourseRecord course) {
        courseCatalog.addCourse(course);
    }

    public void addFaculty(FacultyRecord faculty) {
        facultyDirectory.addFaculty(faculty);
    }

    public void assignFacultyToCourse(FacultyRecord faculty, CourseRecord course) {
        course.setAssignedFaculty(faculty);
        System.out.println("Assigned " + faculty.getName() + " to " + course.getCode());
    }

    public void enrollStudentInCourse(StudentRecord student, CourseRecord course) {
        course.enrollStudent(student);
        System.out.println("Enrolled " + student.getName() + " in " + course.getCode());
    }

    public void printSummary() {
        System.out.println("Department facade operations completed successfully.");
        System.out.println("The facade simplified student registration, course setup,");
        System.out.println("faculty assignment, and student enrollment into one interface.");
    }
}