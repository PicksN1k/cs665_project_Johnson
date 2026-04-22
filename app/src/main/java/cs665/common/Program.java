package cs665.common;

public abstract class Program {
    private String name;
    private int durationYears;
    private int coreCourseCount;
    private int electiveCourseCount;
    private boolean thesisRequired;

    public Program(String name, int durationYears, int coreCourseCount,
                   int electiveCourseCount, boolean thesisRequired) {
        this.name = name;
        this.durationYears = durationYears;
        this.coreCourseCount = coreCourseCount;
        this.electiveCourseCount = electiveCourseCount;
        this.thesisRequired = thesisRequired;
    }

    public String getName() {
        return name;
    }

    public int getDurationYears() {
        return durationYears;
    }

    public int getCoreCourseCount() {
        return coreCourseCount;
    }

    public int getElectiveCourseCount() {
        return electiveCourseCount;
    }

    public boolean isThesisRequired() {
        return thesisRequired;
    }

    public abstract String getProgramType();
}