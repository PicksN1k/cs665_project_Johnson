package cs665.creational.factory;

public class FactoryMain {

    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("Factory Pattern Demo");
        System.out.println("====================================\n");

        ProgramFactory factory = new ProgramFactory();

        Program p1 = factory.createProgram("BSCS");
        Program p2 = factory.createProgram("MSDA");
        Program p3 = factory.createProgram("WEB");

        System.out.println("Created Programs:");
        System.out.println("  " + p1.getProgramDetails());
        System.out.println("  " + p2.getProgramDetails());
        System.out.println("  " + p3.getProgramDetails());
    }
}