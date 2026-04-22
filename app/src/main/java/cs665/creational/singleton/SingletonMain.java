package cs665.creational.singleton;

public class SingletonMain {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("Singleton Pattern Demo");
        System.out.println("====================================\n");

        Department dept1 = Department.getInstance();
        Department dept2 = Department.getInstance();

        dept1.displayMessage();

        System.out.println();

        if (dept1 == dept2) {
            System.out.println("Both references point to the SAME instance.");
        } else {
            System.out.println("Different instances exist (ERROR).");
        }
    }
}