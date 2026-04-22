package cs665.creational.abstractfactory;

public class GraduateProgram implements ProgramProduct {

    @Override
    public String getDetails() {
        return "Graduate Program: M.S. in Computer Science (2 years)";
    }
}