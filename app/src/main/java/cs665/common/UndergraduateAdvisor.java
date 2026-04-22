package cs665.common;

public class UndergraduateAdvisor implements Advisor {
    private FullTimeFaculty faculty;

    public UndergraduateAdvisor(FullTimeFaculty faculty) {
        this.faculty = faculty;
    }

    @Override
    public String getAdvisorName() {
        return faculty.getName() + " (Undergraduate Advisor)";
    }

    @Override
    public FullTimeFaculty getFaculty() {
        return faculty;
    }
}