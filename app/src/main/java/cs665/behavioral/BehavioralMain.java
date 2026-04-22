package cs665.behavioral;

import cs665.common.Student;
import cs665.common.Course;
import cs665.common.CourseOffering;

public class BehavioralMain {

    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("Behavioral Pattern Demonstration");
        System.out.println("1. Observer Pattern");
        System.out.println("2. Strategy Pattern");
        System.out.println("====================================\n");

        runObserverDemo();

        System.out.println();

        runStrategyDemo();
    }

    private static void runObserverDemo() {
        System.out.println("----- Observer Pattern Demo -----");

        Chairperson chair = new Chairperson("Dr. Rao");
        Course course = new Course("CS101", 2);
        course.addObserver(chair);

        CourseOffering offering = new CourseOffering(course);

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Student s3 = new Student("Carol");

        offering.enroll(s1);
        offering.enroll(s2);
        offering.enroll(s3);

        System.out.println("\nBob drops the course...");
        offering.drop(s2);
    }

    private static void runStrategyDemo() {
        System.out.println("----- Strategy Pattern Demo -----");

        StudentStrategy student = new StudentStrategy("David", new StandardGpaStrategy());

        student.addGrade("CS201", 'A');
        student.addGrade("CS202", 'B');
        student.addGrade("CS203", 'A');

        System.out.println("Student: " + student.getName());
        System.out.printf("Calculated GPA: %.2f%n", student.calculateGpa());
    }
}