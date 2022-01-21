import java.util.ArrayList;

// this class stores the array list of both teachers and students
// this class also stores the information about school
public class School {

        // this creates the array list for teachers and students
        ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();


        private String name;
        private String address;
        private int years;

        /**
         * Constructor holds students' and teachers' array list
         * @param name the name of the new school
         * @param address school address of the new school
         * @param years school year
         */
        //Constructor
        public School(String name, String address, int years) {
                this.name = name;
                this.address = address;
                this.years = years;
        }

        public String getName(){
                return name;
        }

        public void setName(String name){
                this.name = name;
        }

        public String getAddress(){
                return address;
        }

        public void setAddress(String address){
                this.address = address;
        }

        public int getYears(){
                return years;
        }

        public void setYears(int years){
                this.years = years;
        }

        /**
         *
         * @param newTeacher this will add a teacher to the array list
         */
        //
        public void addTeacher(Teacher newTeacher){
                teachers.add(newTeacher);
        }

        /**
         *
         * @param deleteTeacher this will delete a teacher from the array list
         */
        public void deleteTeacher(Teacher deleteTeacher){
                teachers.remove(deleteTeacher);
        }

        /**
         * this prints the teachers
         */
        public void showTeacher(){
                System.out.println("");
                System.out.println("Teachers list");
                for (int i = 0; i < teachers.size(); i++){
                        System.out.println(teachers.get(i));
                }
        }

        /**
         *
         * @param newStudent add student to the array list
         */
        public void addStudent(Student newStudent){
                students.add(newStudent);
        }

        /**
         *
         * @param deleteStudent deletes a student from the list
         */
        // deletes a student from the list
        public void deleteStudent(Student deleteStudent){
                students.remove(deleteStudent);
        }


        /**
         * prints the students list
         */
        public void showStudent(){
                System.out.println("");
                System.out.println("Students list");
                for (int i = 0; i < students.size(); i++){
                        System.out.println(students.get(i));
                }
        }


}