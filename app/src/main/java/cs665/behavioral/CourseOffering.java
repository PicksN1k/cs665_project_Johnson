package cs665.behavioral;

import java.util.*;

public class CourseOffering {

    private Course course;
    private List<Student> enrolled = new ArrayList<>();
    private Queue<Student> waitlist = new LinkedList<>();

    public CourseOffering(Course course) {
        this.course = course;
    }

    public void enroll(Student s) {
        if (enrolled.size() < course.getCapacity()) {
            enrolled.add(s);
            System.out.println(s.getName() + " enrolled in " + course.getName());

            if (enrolled.size() == course.getCapacity()) {
                course.notifyObservers("Course FULL: " + course.getName());
            }

        } else {
            waitlist.add(s);
            System.out.println(s.getName() + " waitlisted");
        }
    }

    public void drop(Student s) {
        if (enrolled.remove(s)) {
            System.out.println(s.getName() + " dropped");

            if (!waitlist.isEmpty()) {
                Student next = waitlist.poll();
                enrolled.add(next);
                next.notifyStudent("You are now enrolled!");
                course.notifyObservers("Seat opened for " + next.getName());
            }
        }
    }
}