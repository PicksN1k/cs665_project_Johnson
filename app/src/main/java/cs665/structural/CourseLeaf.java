package cs665.structural;

public class CourseLeaf implements ConcentrationComponent {

    private String code;
    private String title;
    private String description;

    public CourseLeaf(String code, String title, String description) {
        this.code = code;
        this.title = title;
        this.description = description;
    }

    @Override
    public String getName() {
        return code + " - " + title;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String format() {
        return "Course: " + code + " - " + title + "\n"
             + "    Description: " + description + "\n";
    }
}