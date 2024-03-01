package schoolPackage;
public class School {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("John Doe", 1);
        Subject math = new Subject("Math", teacher1);
        Classroom classroom1 = new Classroom(101);
        Student student1 = new Student("Jane Doe", 1, classroom1);
        Student student2 = new Student("John Smith", 2, classroom1);
        Schedule schedule1 = new Schedule("Monday", "9:00", math, classroom1);
        System.out.println(schedule1);
        Grade grade1 = new Grade(math, 90, student1);
        Grade grade2 = new Grade(math, 85, student2);
        System.out.println(grade1);
        System.out.println(grade2);
        System.out.println(classroom1);

    }
}
