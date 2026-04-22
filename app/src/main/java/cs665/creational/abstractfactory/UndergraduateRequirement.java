package cs665.creational.abstractfactory;

public class UndergraduateRequirement implements RequirementProduct {

    @Override
    public String getDetails() {
        return "Requirement: Senior thesis/capstone in final semester";
    }
}