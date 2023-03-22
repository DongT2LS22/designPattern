package org.example.builderPattern;

public class StudentConcreteBuilder implements StudentBuilder{

    private String ID;
    private String firstName;
    private String lastName;
    private String birth;
    private String school;
    @Override
    public StudentBuilder setID(String ID) {
        this.ID= ID;
        return this;
    }

    @Override
    public StudentBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public StudentBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public StudentBuilder setBirth(String birth) {
        this.birth = birth;
        return this;
    }

    @Override
    public StudentBuilder setSchool(String school) {
        this.school = school;
        return this;
    }

    @Override
    public Student build() {
        return new Student(ID,firstName,lastName,birth,school);
    }
}
