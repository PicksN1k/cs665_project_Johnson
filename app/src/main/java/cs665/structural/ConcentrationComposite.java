package cs665.structural;

import java.util.ArrayList;
import java.util.List;

public class ConcentrationComposite implements ConcentrationComponent {

    private String name;
    private String description;
    private List<ConcentrationComponent> children;

    public ConcentrationComposite(String name, String description) {
        this.name = name;
        this.description = description;
        this.children = new ArrayList<>();
    }

    public void add(ConcentrationComponent component) {
        children.add(component);
    }

    public void remove(ConcentrationComponent component) {
        children.remove(component);
    }

    public List<ConcentrationComponent> getChildren() {
        return children;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String format() {
        StringBuilder sb = new StringBuilder();
        sb.append("<div class='concentration'>");
        sb.append("<h2>").append(name).append("</h2>");
        sb.append("<p>").append(description).append("</p>");

        for (ConcentrationComponent child : children) {
            sb.append(child.format());
        }

        sb.append("</div>");
        return sb.toString();
    }
}