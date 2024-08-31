public class Student {
    final String name;
    final int age;
    final String address;
    final   String bloodGroup;
    String subject;

    Student(StudentBuilder studentBuilder){
        this.name = studentBuilder.name;
        this.age = studentBuilder.age;
        this.address = studentBuilder.address;
        this.bloodGroup = studentBuilder.bloodGroup;
        this.subject = studentBuilder.subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
