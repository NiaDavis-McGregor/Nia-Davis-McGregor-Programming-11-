import java.util.ArrayList;
/* This represents a school and contains the school's name, location, date founded, and lists of students,
teachers, and courses offered. I made the default my school as an example.
 */

public class School {
    // Fields:
    private String schoolName;
    private String location;
    private int dateFounded;

    // ArrayLists of students, teachers, and courses:
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Teacher> teachers = new ArrayList<>();
    private ArrayList<String> courses = new ArrayList<>();

    // Constructors:
    School() {
        schoolName = "Alpha Secondary School";
        location = "Burnaby";
        dateFounded = 1950;
    }

    School(String schoolName, String location, int dateFounded) {
        this.schoolName = schoolName;
        this.location = location;
        this.dateFounded = dateFounded;

    }

    // Getters and setters:
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getDateFounded() {
        return dateFounded;
    }

    public void setDateFounded(int dateFounded) {
        this.dateFounded = dateFounded;
    }

    // Methods for adding and deleting a teacher:
    public void addTeacher() {
        teachers.add(new Teacher());
    }

    public void deleteTeacher() {
        teachers.remove(teachers.size() - 1);
    }

    // Methods for adding and deleting a student:
    public void addStudent() {
        students.add(new Student());
    }

    public void deleteStudent() {
        students.remove(students.size() - 1);
    }

    // Method for showing all teachers:
    public ArrayList<Teacher> showTeachers() {
        return teachers;
    }

    // Method for showing all students:
    public ArrayList<Student> showStudents() {
        return students;
    }
}
