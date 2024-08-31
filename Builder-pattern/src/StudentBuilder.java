public class StudentBuilder {

    String name;
    int age;
    String address;
    String bloodGroup;
    String subject;

    StudentBuilder setName(String name){
        this.name = name;
        return this;
    }

    StudentBuilder setAge(int age){
        this.age = age;
        return this;
    }

    StudentBuilder setAddress(String address){
        this.address = address;
        return this;
    }

    StudentBuilder setBloodGroup(String bloodGroup){
        this.bloodGroup = bloodGroup;
        return this;
    }

    StudentBuilder setSubject(String subject){
        this.subject = subject;
        return this;
    }

    Student build(){
        return new Student(this);
    }
}
