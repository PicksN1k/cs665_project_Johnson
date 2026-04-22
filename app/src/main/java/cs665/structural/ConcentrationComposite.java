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
        return formatWithIndent(0);
    }

    private String formatWithIndent(int level) {
        StringBuilder sb = new StringBuilder();
        String indent = "  ".repeat(level);

        sb.append(indent).append("Concentration: ").append(name).append("\n");
        sb.append(indent).append("Description: ").append(description).append("\n");

        for (ConcentrationComponent child : children) {
            if (child instanceof ConcentrationComposite composite) {
                sb.append(composite.formatWithIndent(level + 1));
            } else {
                sb.append(indent).append("  ").append(child.format());
            }
        }

        return sb.toString();
    }
}