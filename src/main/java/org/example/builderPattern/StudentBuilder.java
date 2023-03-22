package org.example.builderPattern;

public interface StudentBuilder {
    StudentBuilder setID(String ID);
    StudentBuilder setFirstName(String firstName);
    StudentBuilder setLastName(String lastName);
    StudentBuilder setBirth(String birth);
    StudentBuilder setSchool(String school);
    Student build();
}
