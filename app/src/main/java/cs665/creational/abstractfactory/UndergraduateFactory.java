package cs665.creational.abstractfactory;

public class UndergraduateFactory implements AcademicFactory {

    @Override
    public ProgramProduct createProgram() {
        return new UndergraduateProgram();
    }

    @Override
    public AdvisorProduct createAdvisor() {
        return new UndergraduateAdvisorProduct();
    }

    @Override
    public RequirementProduct createRequirement() {
        return new UndergraduateRequirement();
    }
}