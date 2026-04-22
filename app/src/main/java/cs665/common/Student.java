package cs665.common;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Student extends Person {
    private String studentId;
    private Program program;
    private Advisor advisor;
    private Thesis thesis;
    private Map<Semester, List<Course>> semesterCourses;
    private Map<Course, Grade> grades;

    public Student(String studentId, String name, Program program, Advisor advisor) {
        super(name, name.toLowerCase().replace(" ", ".") + "@student.edu");
        this.studentId = studentId;
        this.program = program;
        this.advisor = advisor;
        this.semesterCourses = new LinkedHashMap<>();
        this.grades = new LinkedHashMap<>();
    }

    public Student(String name) {
        super(name, name.toLowerCase().replace(" ", ".") + "@student.edu");
        this.semesterCourses = new LinkedHashMap<>();
        this.grades = new LinkedHashMap<>();
    }

    public String getStudentId() {
        return studentId;
    }

    public Program getProgram() {
        return program;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public Thesis getThesis() {
        return thesis;
    }

    public void setThesis(Thesis thesis) {
        this.thesis = thesis;
    }

    public void addCourse(Semester semester, Course course) {
        semesterCourses.computeIfAbsent(semester, k -> new ArrayList<>()).add(course);
    }

    public void dropCourse(Semester semester, Course course) {
        List<Course> list = semesterCourses.get(semester);
        if (list != null) {
            list.remove(course);
        }
    }

    public Map<Semester, List<Course>> getSemesterCourses() {
        return semesterCourses;
    }

    public void recordGrade(Course course, Grade grade) {
        grades.put(course, grade);
    }

    public Map<Course, Grade> getGrades() {
        return grades;
    }

    public void notifyStudent(String message) {
        System.out.println("[Student] " + getName() + ": " + message);
    }
}