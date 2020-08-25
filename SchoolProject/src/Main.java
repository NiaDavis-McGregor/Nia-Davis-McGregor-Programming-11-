public class Main {
    public static void main(String[] args) {

        School example = new School();

        // Adding 10 students to the student list:
        for(int i = 0; 10 > i; i++) {
            example.addStudent();
        }

        // Adds 3 teachers to the teacher list:
        for(int i = 0; 3 > i; i++) {
            example.addTeacher();
        }

        // Display both lists:
        System.out.println(example.showTeachers());
        System.out.println(example.showStudents());

        // Remove 2 students:
        for(int i = 0; 2 > i; i++) {
            example.deleteStudent();
        }

        // Remove 1 teacher:
        example.deleteTeacher();

        // Display both lists again:
        System.out.println(example.showTeachers());
        System.out.println(example.showStudents());
    }
}
