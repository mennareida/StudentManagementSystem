import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> students = new ArrayList<>();

        Student s1 = new Student("Ali Ahmed", 20, 1001);
        s1.addGrade(85);
        s1.addGrade(90);

        Student s2 = new Student("Sara Omar", 21, 1002);
        s2.addGrade(92);
        s2.addGrade(88);

        GraduateStudent g1 = new GraduateStudent("Mohamed Salem", 25, 2001, "Artificial Intelligence");
        g1.addGrade(88);
        g1.addGrade(94);

        GraduateStudent g2 = new GraduateStudent("Layla Hassan", 26, 2002, "Network Security");
        g2.addGrade(97);
        g2.addGrade(91);

        students.add(s1);
        students.add(s2);
        students.add(g1);
        students.add(g2);

        for (Person p : students) {
            System.out.println("----------------------------");
            p.displayInfo();
        }
        System.out.println("----------------------------");
    }
}
