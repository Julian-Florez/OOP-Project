package coursePackage;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){

        // Example usage: 
        
        Course course = new Course();
        Student student1 = new Student("John", "Doe", "123456789", new ArrayList<Double>(Arrays.asList(80.0, 85.0, 90.0, 75.0, 95.0, 88.0, 92.0, 87.0, 84.0, 89.0)));
        Student student2 = new Student("Jane", "Smith", "987654321", new ArrayList<Double>(Arrays.asList(70.0, 75.0, 80.0, 65.0, 85.0, 78.0, 82.0, 77.0, 74.0, 79.0)));
        course.addStudent(student1);
        course.addStudent(student2);
        System.out.println("Course List: " + course.getStudents());
        System.out.println("Course Average Grade: " + course.calculate_course_average());
        System.out.println("Average Grade for "+ course.getStudents().get(0) + ": " + course.calculate_student_average(0));
        System.out.println("Student with highest grade: " + course.get_student_with_highest_grade());
        System.out.println("Student with lowest grade: " + course.get_student_with_lowest_grade());
    }
}
