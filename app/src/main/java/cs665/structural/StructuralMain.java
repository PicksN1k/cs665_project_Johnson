package cs665.structural;

public class StructuralMain {

    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("Structural Pattern Demonstration");
        System.out.println("1. Composite Pattern");
        System.out.println("2. Facade Pattern");
        System.out.println("====================================\n");

        runCompositeDemo();

        System.out.println();

        runFacadeDemo();
    }

    private static void runCompositeDemo() {
        System.out.println("----- Composite Pattern Demo -----");

        ConcentrationComposite programmingLanguages =
                new ConcentrationComposite("Programming Languages",
                        "Top-level concentration for programming languages");

        ConcentrationComposite oop =
                new ConcentrationComposite("Object Oriented Languages",
                        "Sub-concentration for object-oriented languages");

        ConcentrationComposite functional =
                new ConcentrationComposite("Functional Languages",
                        "Sub-concentration for functional languages");

        CourseLeaf cs342 =
                new CourseLeaf("CS342", "Java Programming",
                        "Covers classes, inheritance, interfaces, and polymorphism.");

        CourseLeaf cs447 =
                new CourseLeaf("CS447", "Object-Oriented Design",
                        "Covers design principles and object-oriented modeling.");

        CourseLeaf cs455 =
                new CourseLeaf("CS455", "Functional Programming",
                        "Covers higher-order functions and immutable programming.");

        oop.add(cs342);
        oop.add(cs447);
        functional.add(cs455);

        programmingLanguages.add(oop);
        programmingLanguages.add(functional);

        System.out.println(programmingLanguages.format());
    }

    private static void runFacadeDemo() {
        System.out.println("----- Facade Pattern Demo -----");

        DepartmentFacade facade = new DepartmentFacade();

        StudentRecord alice = new StudentRecord("S1001", "Alice");
        FacultyRecord smith = new FacultyRecord("F2001", "Prof. Smith");
        CourseRecord cs101 = new CourseRecord("CS101", "Intro to Programming");

        facade.registerStudent(alice);
        facade.addFaculty(smith);
        facade.addCourse(cs101);
        facade.assignFacultyToCourse(smith, cs101);
        facade.enrollStudentInCourse(alice, cs101);

        System.out.println();
        facade.printSummary();
    }
}