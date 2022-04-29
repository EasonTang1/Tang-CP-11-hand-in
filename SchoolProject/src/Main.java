public class Main {
    public static void main(String[] args) {
        //add 3 teachers to teacher list
        Teacher BillGates = new Teacher("Bill", "Gates", "Programming Teacher");
        Teacher ChristopherNolan = new Teacher("Christopher", "Nolan", "Media Arts Teacher");
        Teacher CharlesDarwin = new Teacher("Charles", "Darwin", "Biology Teacher");

        //Add 10 students to student list
        Student AlbertEinstein = new Student("Albert", "Einstein", "12");
        Student JRRTolkien = new Student("JRR", "Tolkien", "11");
        Student MichaelJordan = new Student("Michael", "Jordan", "10");
        Student PythagorasofSamos = new Student("Pythagoras", "of Samos", "9");
        Student Aristotle = new Student("Aristotle", "", "8");
        Student NikolaTesla = new Student("Nikola", "Tesla", "9");
        Student DmitriMendeleev = new Student("Dmitri", "Mendeleev", "10");
        Student ThomasEdison = new Student("Thomas", "Edison", "11");
        Student GeorgeWashington = new Student("George", "Washington", "12");
        Student AbrahamLincoln = new Student("Abraham", "Lincoln", "11");

        //Add 10 students to student list
        //add 3 teachers to teacher list
        School school = new School();
        school.addTeacher(BillGates);
        school.addTeacher(ChristopherNolan);
        school.addTeacher(CharlesDarwin);
        school.addStudent(AlbertEinstein);
        school.addStudent(JRRTolkien);
        school.addStudent(MichaelJordan);
        school.addStudent(PythagorasofSamos);
        school.addStudent(Aristotle);
        school.addStudent(NikolaTesla);
        school.addStudent(DmitriMendeleev);
        school.addStudent(ThomasEdison);
        school.addStudent(GeorgeWashington);
        school.addStudent(AbrahamLincoln);


        //display both lists
        school.printTeachers();

        //remove 1 teacher
        school.removeTeacher(ChristopherNolan);

        //display both lists
        school.printTeachers();

        //display both lists
        school.printStudents();

        //remove 2 students
        school.removeStudent(PythagorasofSamos);
        school.removeStudent(Aristotle);

        //display both lists
        school.printStudents();
    }
}
