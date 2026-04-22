package cs665.creational.abstractfactory;

public class GraduateFactory implements AcademicFactory {

    @Override
    public ProgramProduct createProgram() {
        return new GraduateProgram();
    }

    @Override
    public AdvisorProduct createAdvisor() {
        return new GraduateAdvisorProduct();
    }

    @Override
    public RequirementProduct createRequirement() {
        return new GraduateRequirement();
    }
}