package cs665.common;

public class MSProgram extends Program {

    public MSProgram(String name) {
        super(name, 2, 8, 4, true);
    }

    @Override
    public String getProgramType() {
        return "Graduate Degree";
    }
}