import java.util.Random;
import java.util.ArrayList;

public class Student {
    //first name
    String firstname;

    //last name
    String lastname;

    //grade
    String grade;

    //unique student number created on construction
    int studentnumber = 0;


    Student(String firstname, String lastname, String grade) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.grade = grade;
        this.studentnumber = studentnumber();
    }

    //student number
    private int studentnumber(){
        Random rnd = new Random();
        return studentnumber = rnd.nextInt(999999);
    }

    //When printed "Name: name Grade: grade
    //and studentnumber i'm assuming?
    public String toString() {
        return "Name: " + this.firstname + " " + this.lastname + " Grade: " + this.grade + " Student number: " + studentnumber;
    }

    //getters as per criteria
    public String getFirstname(){
        return this.firstname;
    }

    public String getLastname(){
        return this.lastname;
    }

    public String getGrade(){
        return this.grade;
    }

    //setters as per criteria
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public void setGrade(String grade){
        this.grade = grade;
    }
}
