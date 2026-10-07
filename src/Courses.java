public class Courses {
    private String courseName;
    private String[] students;
    private int numberOfStudents;

    // Constructor
    public Courses(String courseName) {
        this.courseName = courseName;
        students = new String[10];
        numberOfStudents = 0;
    }

    // Get course name
    public String getCourseName() {
        return courseName;
    }

    // Add student
    public void addStudent(String student) {

        // If array is full, create a larger array
        if (numberOfStudents >= students.length) {

            String[] newStudents =
                    new String[students.length * 2];

            for (int i = 0; i < students.length; i++) {
                newStudents[i] = students[i];
            }

            students = newStudents;
        }

        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    // Drop student
    public void dropStudent(String student) {

        for (int i = 0; i < numberOfStudents; i++) {

            if (students[i].equals(student)) {

                // Shift students to the left
                for (int j = i; j < numberOfStudents - 1; j++) {
                    students[j] = students[j + 1];
                }

                students[numberOfStudents - 1] = null;
                numberOfStudents--;

                break;
            }
        }
    }

    // Get students
    public String[] getStudents() {
        return students;
    }

    // Get number of students
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}
