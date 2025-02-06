package com.cardona.maturana.gofpatterns.user.nodirector.separated;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserBuilder {
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

    public UserBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public UserBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserBuilder setSecondName(String secondName) {
        this.secondName = secondName;
        return this;
    }

    public UserBuilder setFirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
        return this;
    }

    public UserBuilder setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
        return this;
    }

    public UserBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public UserBuilder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public UserBuilder setProfession(String profession) {
        this.profession = profession;
        return this;
    }

    public UserBuilder setTags(List tags) {
        this.tags = tags;
        return this;
    }

    public UserBuilder setTags(String tag) {
        if (Objects.isNull(this.tags)) {
            this.tags = new ArrayList();
            this.tags.add(tag);
        } else {
            this.tags.add(tag);
        }
        return this;
    }

    public UserBuilder setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
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
                this.yearsOfService);
    }

}
