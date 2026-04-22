package cs665.creational.abstractfactory;

public class GraduateAdvisorProduct implements AdvisorProduct {

    @Override
    public String getDetails() {
        return "Advisor Type: Graduate Advisor";
    }
}