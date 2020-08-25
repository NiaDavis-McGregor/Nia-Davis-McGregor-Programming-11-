public class Student {
    // This class represents a student and it holds the information of their name, grade, and a unique student number.

    // Fields:
    private String firstName;
    private String lastName;
    private int grade;
    static int studentNum = 1;
    private int studentId;

    // Default constructor:
    Student() {
        firstName = "";
        lastName = "";
        grade = 8;
        studentId = studentNum;
        studentNum++;
    }

    // Another constructor:
    Student(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studentId = studentNum;
        studentNum++;
    }

    /* This method is here so that when a student is printed, it will return "Name: (the student's name)
    Grade: (the student's grade)", instead of the student's location in memory:
     */
    public String toString() {
        return "Name: " + this.firstName + " " + this.lastName + "   Grade: " + this.grade;
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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
