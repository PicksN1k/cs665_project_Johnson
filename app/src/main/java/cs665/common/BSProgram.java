package cs665.common;

public class BSProgram extends Program {

    public BSProgram(String name) {
        super(name, 4, 24, 8, true);
    }

    @Override
    public String getProgramType() {
        return "Undergraduate Degree";
    }
}