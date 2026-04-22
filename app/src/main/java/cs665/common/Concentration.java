package cs665.common;

public class Concentration {
    private String name;
    private String description;

    public Concentration(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Concentration(String name) {
        this(name, "");
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}