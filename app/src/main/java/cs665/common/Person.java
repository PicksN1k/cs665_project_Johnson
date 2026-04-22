package cs665.common;

public abstract class Person {
    private String name;
    private String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void sendQuery(Person recipient, String message) {
        System.out.println(name + " sent query to " + recipient.getName() + ": " + message);
    }
}