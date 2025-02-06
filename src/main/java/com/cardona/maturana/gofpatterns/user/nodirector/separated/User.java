package com.cardona.maturana.gofpatterns.user.nodirector.separated;

import java.util.List;

public class User {
    private final int id;
    private final String firstName;
    private final String secondName;
    private final String firstSurname;
    private final String secondSurname;
    private final int age;
    private final String address;
    private final String phoneNumber;
    private final String profession;
    private final List tags;
    private final int yearsOfService;

    public User(int id, String firstName, String secondName, String firstSurname, String secondSurname, int age, String address, String phoneNumber, String profession, List tags, int yearsOfService) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.firstSurname = firstSurname;
        this.secondSurname = secondSurname;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.profession = profession;
        this.tags = tags;
        this.yearsOfService = yearsOfService;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public List getTags() {
        return tags;
    }

    public String getProfession() {
        return profession;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public String getSecondSurname() {
        return secondSurname;
    }

    public String getFirstSurname() {
        return firstSurname;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", firstSurname='" + firstSurname + '\'' +
                ", secondSurname='" + secondSurname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", profession='" + profession + '\'' +
                ", tags=" + tags +
                ", yearsOfService=" + yearsOfService +
                '}';
    }
}
