public class Main {
    public static void main(String[] args) {
        System.out.println("Example of Builder pattern");

        Student student = new StudentBuilder().setName("Raj").setAge(23).setAddress("Ranchi,Jharkhand").setSubject("Maths").setBloodGroup("B+ve").build();

        System.out.println("Student info "+ student.toString());
    }
}