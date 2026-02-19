class StudentData {
    private int marks;   // data hiding

    // Setter method
    public void setMarks(int m) {
        marks = m;
    }

    // Getter method
    public int getMarks() {
        return marks;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        StudentData s = new StudentData();
        s.setMarks(85);
        System.out.println("Marks: " + s.getMarks());
    }
}
