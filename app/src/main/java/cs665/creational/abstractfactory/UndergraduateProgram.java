package cs665.creational.abstractfactory;

public class UndergraduateProgram implements ProgramProduct {

    @Override
    public String getDetails() {
        return "Undergraduate Program: B.S. in Computer Science (4 years)";
    }
}