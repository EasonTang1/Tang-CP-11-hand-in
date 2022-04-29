import java.util.ArrayList;

public class School {
    //Holds an ArrayList of Teachers
    private ArrayList<Teacher> teachers = new ArrayList<>();
    //Holds an ArrayList of students
    private ArrayList<Student> students = new ArrayList<>();
    //Holds an ArrayList of Courses
    private ArrayList<String> courses = new ArrayList<>();

    //Add a teacher to list
    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    //Show all Teachers
    public void printTeachers() {
        System.out.println();
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println(teachers.get(i));
        }
    }

    // Delete teacher from list
    public void removeTeacher(Teacher teacher) {
        this.teachers.remove(teacher);
    }

    //Add a student to list
    public void addStudent(Student student) {
        this.students.add(student);
    }

    //Show all Students
    public void printStudents() {
        System.out.println();
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }

    // Delete student from list
    public void removeStudent(Student student) {
        this.students.remove(student);
    }
}
