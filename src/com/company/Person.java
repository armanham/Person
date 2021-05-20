package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String sex;
    private String passportId;

    public Person(String firstName, String lastName, int age, String sex, String passportId) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSex(sex);
        setPassportId(passportId);
    }

    public Person() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() >= 3 && firstName.length() <= 15) {
            this.firstName = firstName;
        } else {
            System.out.println("Invalid first name!");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() >= 6 && lastName.length() <= 20) {
            this.lastName = lastName;
        } else {
            System.out.println("Invalid last name!");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 99) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (sex.equals("male") || sex.equals("female")) {
            this.sex = sex;
        }else {
            System.out.println("Invalid sex!");
        }
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        if (passportId.length() == 6) {
            this.passportId = passportId;
        } else {
            System.out.println("Invalid passport ID!");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", passportId='" + "AN" + passportId + '\'' +
                '}';
    }
}
