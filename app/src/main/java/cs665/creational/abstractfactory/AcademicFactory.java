package cs665.creational.abstractfactory;

public interface AcademicFactory {
    ProgramProduct createProgram();
    AdvisorProduct createAdvisor();
    RequirementProduct createRequirement();
}