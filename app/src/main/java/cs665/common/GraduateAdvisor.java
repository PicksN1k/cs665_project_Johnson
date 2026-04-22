package cs665.common;

public class GraduateAdvisor implements Advisor {
    private FullTimeFaculty faculty;

    public GraduateAdvisor(FullTimeFaculty faculty) {
        this.faculty = faculty;
    }

    @Override
    public String getAdvisorName() {
        return faculty.getName() + " (Graduate Advisor)";
    }

    @Override
    public FullTimeFaculty getFaculty() {
        return faculty;
    }
}