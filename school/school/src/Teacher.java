// this class provides information about teachers
public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;

    /**
     * constructor this collects the information about teachers
     * @param firstName puts teacher's first name into the array list
     * @param lastName puts teacher's last name into the array list
     * @param subject  puts the subject into the array list
     */
    public Teacher(String firstName, String lastName, String subject){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    public String getFirstName(){
        return firstName;
    }


    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getName(){
        return firstName  + " " + lastName;
    }

    public String getSubject(){
        return subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    /**
     *
     * @return formats the teachers' information
     */
    public String toString(){
        return "Name: " + getName() + " Subject: " + getSubject();
    }
}
