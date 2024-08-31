public class Main {
    public static void main(String[] args) {

    Student student = new Student("Manish",25,"CSE",7.8);

    Student copyStudent = student.clone();
    System.out.println("Copy student branch is "+ copyStudent.getCgpa());
    }
}