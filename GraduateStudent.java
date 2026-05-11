public class GraduateStudent extends Student {

    private String researchTitle;

    public GraduateStudent(String name, int age, int studentId, String researchTitle) {
        super(name, age, studentId);
        this.researchTitle = researchTitle;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Research Title: " + researchTitle);
    }
}
