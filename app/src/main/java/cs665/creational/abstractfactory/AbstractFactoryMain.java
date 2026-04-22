package cs665.creational.abstractfactory;

public class AbstractFactoryMain {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("Abstract Factory Pattern Demo");
        System.out.println("====================================\n");

        runUndergraduateDemo();

        System.out.println();

        runGraduateDemo();
    }

    private static void runUndergraduateDemo() {

        System.out.println("----- Undergraduate Family -----");

        AcademicFactory factory = new UndergraduateFactory();

        ProgramProduct program = factory.createProgram();
        AdvisorProduct advisor = factory.createAdvisor();
        RequirementProduct requirement = factory.createRequirement();

        System.out.println(program.getDetails());
        System.out.println(advisor.getDetails());
        System.out.println(requirement.getDetails());
    }

    private static void runGraduateDemo() {

        System.out.println("----- Graduate Family -----");

        AcademicFactory factory = new GraduateFactory();

        ProgramProduct program = factory.createProgram();
        AdvisorProduct advisor = factory.createAdvisor();
        RequirementProduct requirement = factory.createRequirement();

        System.out.println(program.getDetails());
        System.out.println(advisor.getDetails());
        System.out.println(requirement.getDetails());
    }
}