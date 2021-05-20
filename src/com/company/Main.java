package com.company;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Arman");
        person.setLastName("Hambardzumyan");
        person.setAge(19);
        person.setSex("male");
        person.setPassportId("123456");

//        System.out.println(person.getFirstName());
//        System.out.println(person.getLastName());
//        System.out.println(person.getAge());
//        System.out.println(person.getSex());
//        System.out.println(person.getPassportId());

        System.out.println(person.toString());
    }
}
