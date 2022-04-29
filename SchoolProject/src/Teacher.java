public class Teacher {
    //first name
    String firstname;

    //last name
    String lastname;

    //subject
    String subject;

    //setters and getters
    //Appropriate Constructor
    Teacher(String firstname,String lastname,String subject){
    this.firstname = firstname;
    this.lastname = lastname;
    this.subject = subject;
    }

    //When teacher object printed Name: name Subject: subject
    public String toString() {
        return "Name: " + this.firstname + " " + this.lastname + " Subject: " + this.subject;
    }

    //getters as per criteria
    public String getFirstname(){
        return this.firstname;
    }

    public String getLastname(){
        return this.lastname;
    }

    public String getSubject(){
        return this.subject;
    }

    //setters as per criteria
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public void SetLastname(String lastname){
        this.lastname = lastname;
    }

    public void getSubject(String subject){
        this.subject = subject;
    }
}
