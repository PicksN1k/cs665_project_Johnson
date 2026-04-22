package cs665.common;

public class Thesis {
    private String title;
    private FullTimeFaculty advisor;

    public Thesis(String title, FullTimeFaculty advisor) {
        this.title = title;
        this.advisor = advisor;
    }

    public String getTitle() {
        return title;
    }

    public FullTimeFaculty getAdvisor() {
        return advisor;
    }
}