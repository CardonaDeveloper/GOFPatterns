package com.cardona.maturana.gofpatterns.withdirector.separated;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserDeveloperBuilder  implements  UserBuilderInferface{
    private  int id;
    private  String firstName;
    private  String secondName;
    private  String firstSurname;
    private  String secondSurname;
    private  int age;
    private  String address;
    private  String phoneNumber;
    private  String profession;
    private  List tags;
    private  int yearsOfService;
    private int responsibilityLevel;

    @Override
    public String toString() {
        return "UserDeveloperBuilder{" +
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
                ", responsibilityLevel=" + responsibilityLevel +
                '}';
    }

    public UserDeveloperBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public UserDeveloperBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserDeveloperBuilder setSecondName(String secondName) {
        this.secondName = secondName;
        return this;
    }

    public UserDeveloperBuilder setFirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
        return this;
    }

    public UserDeveloperBuilder setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
        return this;
    }

    public UserDeveloperBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public UserDeveloperBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public UserDeveloperBuilder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public UserDeveloperBuilder setProfession(String profession) {
        this.profession = profession;
        return this;
    }

    public UserDeveloperBuilder setTags(List tags) {
        this.tags = tags;
        this.tags.add("Developer");
        return this;
    }

    public UserDeveloperBuilder setTags(String tag) {
        if (Objects.isNull(this.tags)) {
            this.tags = new ArrayList();
            this.tags.add("Developer");
            this.tags.add(tag);
        } else {
            this.tags.add(tag);
        }
        return this;
    }

    public UserDeveloperBuilder setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
        return this;
    }

    @Override
    public UserBuilderInferface addDetails() {
        this.responsibilityLevel = 2;
        return this;
    }

    public User build() {
        return new User(
                this.id,
                this.firstName,
                this.secondName,
                this.firstSurname,
                this.secondSurname,
                this.age,
                this.address,
                this.phoneNumber,
                this.profession,
                this.tags,
                this.yearsOfService,
                this.responsibilityLevel);
    }

}
