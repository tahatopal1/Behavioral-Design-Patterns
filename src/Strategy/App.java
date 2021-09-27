package Strategy;

public class App {
    public static void main(String[] args) {

        Student student = new Student(Division.MATHEMATICAL);
        String priorityOrder = student.getPriorityOrder();
        System.out.println(priorityOrder);

        System.out.println("------------------------");

        student = new Student(Division.VERBAL);
        priorityOrder = student.getPriorityOrder();
        System.out.println(priorityOrder);

    }
}
