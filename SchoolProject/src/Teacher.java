public class Teacher {
    // This class represents a teacher by their name and subject they teach.

    // Fields:
    private String firstName;
    private String lastName;
    private String subject;

    // Default constructor:
    Teacher() {
        firstName = "";
        lastName = "";
        subject = "";
    }

    // Constructor:
    Teacher(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    /* This method is here so that when a teacher is printed, it will return "Name: (the teacher's name)
    Subject: (the teacher's subject)", instead of the teacher's location in memory:
     */

    public String toString() {
        return "Name: " + this.firstName + " " + this.lastName + "   Subject: " + this.subject;
    }

    // Getters and setters:
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
