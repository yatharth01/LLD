public class Student implements Prototype{
    private String name;
    private int age;
    private String branch;
    private double cgpa;

    public Student(Student student){
        this.name = student.name;
        this.age = student.age;
        this.branch = student.branch;
        this.cgpa = student.cgpa;
    }
    public Student(String name, int age, String branch, double cgpa) {
        this.name = name;
        this.age = age;
        this.branch = branch;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public Student clone(){
        return new Student(this);
    }
}
