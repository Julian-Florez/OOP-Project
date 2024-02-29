package taskManager;

public class Main {

    public static void main(String[] args) {
        Task task1 = new Task("Task 1", "This is the first task",false, "2021-10-01", 0.0);
        Task task2 = new Task("Task 2", "This is the second task",false, "2021-10-02", 0.0);
        Task task3 = new Task("Task 3", "This is the third task",false, "2021-10-03", 0.0);
        Task task4 = new Task("Task 4", "This is the fourth task",false, "2021-10-04", 0.0);
        Task task5 = new Task("Task 5", "This is the fifth task",false, "2021-10-05", 0.0);

        System.out.println(task1);
        System.out.println(task2);
        System.out.println(task3);
        System.out.println(task4);
        System.out.println(task5);

        task1.setStatus(true);
        task2.setGrade(100.0);
        task3.setStatus(true);
        task4.setGrade(100.0);

        System.out.println(task1);
        System.out.println(task2);
        System.out.println(task3);
        System.out.println(task4);
        System.out.println(task5);


    }
}