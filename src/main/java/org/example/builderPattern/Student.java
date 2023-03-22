package org.example.builderPattern;

public class Student {
    private String ID;
    private String firstname;
    private String lastname;
    private String birth;
    private String school;

    public Student(String ID, String firstname, String lastname, String birth, String school) {
        this.ID = ID;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birth = birth;
        this.school = school;
    }

    @Override
    public String toString() {
        return "Xin chao "+firstname+""+lastname;
    }

    public static void main(String[] args) {
        StudentConcreteBuilder builder = new StudentConcreteBuilder();
        Student student = builder.setID("20200156").setFirstName("Pham").setLastName("Dong").build();
        System.out.println(student.toString());
    }


}
