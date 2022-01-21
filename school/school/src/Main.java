//run the codes
public class Main {
    public static void main(String[] args) {

        //information about teachers
        Teacher newTeacher = new Teacher("John", "Carter", "English");
        Teacher teacher1 = new Teacher("Ronald", "Reagan", "Math");
        Teacher teacher2 = new Teacher("Douglas","MacArthur","Social Studies");


        // adds information about students
        Student newStudent = new Student(1, 10, "United", "States");
        Student student1 = new Student(2, 10, "Canada","Kanata");
        Student student2 = new Student(3,10,"Kaiser", "Reich");
        Student student3 = new Student(4, 10,"Austro","Hungarian");
        Student student4 = new Student(5, 10, "Great", "Britain");
        Student student5 = new Student(6, 10, "Nippon", "Japan");
        Student student6 = new Student(7, 10, "China", "Qing");
        Student student7 = new Student(8, 10, "Spain", "Spain");
        Student student8 = new Student(9, 10, "South", "Korea");
        Student student9 = new Student(10, 10 , "Burma", "Myanmar");

        //creates a school
        School school = new School("UHill", "Rose Dr.", 2015);


        // adds teachers to the array list
        school.addTeacher(newTeacher);
        school.addTeacher(teacher1);
        school.addTeacher(teacher2);

        // adds students to the array list
        school.addStudent(newStudent);
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        school.addStudent(student4);
        school.addStudent(student5);
        school.addStudent(student6);
        school.addStudent(student7);
        school.addStudent(student8);
        school.addStudent(student9);

        //prints both lists
        school.showTeacher();
        school.showStudent();

        //deletes a teacher from the list
        school.deleteTeacher(newTeacher);

        //deletes three students from the list
        school.deleteStudent(newStudent);
        school.deleteStudent(student5);
        school.deleteStudent(student9);

        //prints the new lists
        school.showTeacher();
        school.showStudent();

    }
}
