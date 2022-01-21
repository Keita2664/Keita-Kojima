// this class stores information about students
public class Student {
    private String firstName;
    private String lastName;
    private int grade;
    private int id;

    /**
     * Constructor this collects the information about student
     * @param id the ID of the student
     * @param grade the grade of the student
     * @param firstName first name of the student
     * @param lastName last name of the student
     */
// Constructor
    public Student(int id, int grade, String firstName, String lastName){
        this.id = id;
        this. grade = grade;
        this. firstName = firstName;
        this.lastName = lastName;

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
        return firstName + " " + lastName;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getGrade(){
        return grade;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

    /**
     *
     * @return the format of the students' information
     */
    public String toString(){
        return "Name: " + getName() + " grade: " + getGrade();
    }
}
