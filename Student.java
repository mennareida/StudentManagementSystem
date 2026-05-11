import java.util.ArrayList;

public class Student extends Person {

    protected int studentId;
    protected ArrayList<Integer> grades;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double calculateAverage() {
        int total = 0;
        for (int g : grades) {
            total += g;
        }
        return (double) total / grades.size();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println("Average: " + calculateAverage());
    }
}
