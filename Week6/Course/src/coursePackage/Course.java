package coursePackage;
import java.util.ArrayList;

public class Course {

    /**
     * Course class
     * @param MAX_STUDENTS: Maximum number of students
     * @param num_students: Number of students
     * @param students: List of students
     */

    private int MAX_STUDENTS = 30;
    private int num_students = 0;
    private ArrayList<Student> students;

    public Course() {

        /**
         * Constructor
         * @param students: List of students
         */

        this.students = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        
        /**
         * Adds a student to the course
         * @param student: Student object
         * @return void
         * @exception Maximum number of students reached
         */

        if (num_students < MAX_STUDENTS) {
            students.add(student);
            num_students++;
            System.out.println("Student "+ student.getName() + " " + student.getSurname() + " added successfully!");
        } else {
            System.out.println("Maximum number of students reached");
        }
    }

    public ArrayList<String> getStudents() {

        /**
         * Returns a list with the students' names and surnames
         * @return ArrayList<String>
         */

        ArrayList<String> studentsInfo = new ArrayList<String>();
        for (Student student : students) {
            studentsInfo.add(student.getName() + " " + student.getSurname());
        }
        return studentsInfo;
    }

    public Double calculate_course_average(){

        /**
         * Calculates the average grade of all students
         * @return Double
         */

        Double total = 0.0;
        int total_grades = 0;
        for (Student student : students) {
            for (Double grade : student.getGrades()) {
                total += grade;
                total_grades++;
            }
        }
        return total/total_grades;
    }

    public Double calculate_student_average(int index){

        /**
         * Calculates the average grade of a student
         * @param index: Index of the student in the list
         * @return Double
         */

        Double total = 0.0;
        for (Double grade : students.get(index).getGrades()) {
            total += grade;
        }
        return total/students.get(index).getGrades().size();
    }

    public String get_student_with_highest_grade(){

        /**
         * Returns the student with the highest grade
         * @return String
         */

        int index = 0;
        Double highest_grade = 0.0;
        for(int i = 0; i < students.size(); i++){
            if (calculate_student_average(i) >= highest_grade){
                highest_grade = calculate_student_average(i);
                index = i;
            }
        }
        return students.get(index).getName() + " " + students.get(index).getSurname();
    }

    public String get_student_with_lowest_grade(){

        /**
         * Returns the student with the lowest grade
         * @return String
         */

        int index = 0;
        Double lowest_grade = 100.0;
        for(int i = 0; i < students.size(); i++){
            if (calculate_student_average(i) <= lowest_grade){
                lowest_grade = calculate_student_average(i);
                index = i;
            }
        }
        return students.get(index).getName() + " " + students.get(index).getSurname();
    }
}
