package cs665.common;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseOffering {
    private Course course;
    private Semester semester;
    private List<Student> enrolledStudents;
    private Queue<Student> waitList;

    public CourseOffering(Course course, Semester semester) {
        this.course = course;
        this.semester = semester;
        this.enrolledStudents = new ArrayList<>();
        this.waitList = new LinkedList<>();
    }

    public CourseOffering(Course course) {
        this(course, new Semester("Default Semester"));
    }

    public Course getCourse() {
        return course;
    }

    public Semester getSemester() {
        return semester;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public Queue<Student> getWaitList() {
        return waitList;
    }

    public void enroll(Student student) {
        if (enrolledStudents.contains(student)) {
            System.out.println(student.getName() + " is already enrolled in " + course.getCode());
            return;
        }

        if (enrolledStudents.size() < course.getEnrollmentLimit()) {
            enrolledStudents.add(student);
            student.addCourse(semester, course);
            System.out.println(student.getName() + " enrolled in " + course.getCode());
        } else {
            waitList.offer(student);
            System.out.println(student.getName() + " waitlisted");
        }
    }

    public void drop(Student student) {
        if (enrolledStudents.remove(student)) {
            student.dropCourse(semester, course);
            System.out.println(student.getName() + " dropped");

            if (!waitList.isEmpty()) {
                Student next = waitList.poll();
                enrolledStudents.add(next);
                next.addCourse(semester, course);
                next.notifyStudent("You are now enrolled!");
            }
        }
    }
}