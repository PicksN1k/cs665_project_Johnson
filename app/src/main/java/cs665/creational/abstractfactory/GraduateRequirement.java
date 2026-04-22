package cs665.creational.abstractfactory;

public class GraduateRequirement implements RequirementProduct {

    @Override
    public String getDetails() {
        return "Requirement: Graduate thesis in final semester";
    }
}