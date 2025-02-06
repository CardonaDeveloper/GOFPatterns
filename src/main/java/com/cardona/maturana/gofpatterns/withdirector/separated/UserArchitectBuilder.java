package com.cardona.maturana.gofpatterns.withdirector.separated;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserArchitectBuilder implements UserBuilderInferface {
  private int id;
  private String firstName;
  private String secondName;
  private String firstSurname;
  private String secondSurname;
  private int age;
  private String address;
  private String phoneNumber;
  private String profession;
  private List tags;
  private int yearsOfService;
  private int responsibilityLevel;

    @Override
    public String toString() {
        return "UserArchitectBuilder{" +
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

    public UserArchitectBuilder setId(int id) {
    this.id = id;
    return this;
  }

  public UserArchitectBuilder setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public UserArchitectBuilder setSecondName(String secondName) {
    this.secondName = secondName;
    return this;
  }

  public UserArchitectBuilder setFirstSurname(String firstSurname) {
    this.firstSurname = firstSurname;
    return this;
  }

  public UserArchitectBuilder setSecondSurname(String secondSurname) {
    this.secondSurname = secondSurname;
    return this;
  }

  public UserArchitectBuilder setAge(int age) {
    this.age = age;
    return this;
  }

  public UserArchitectBuilder setAddress(String address) {
    this.address = address;
    return this;
  }

  public UserArchitectBuilder setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  public UserArchitectBuilder setProfession(String profession) {
    this.profession = profession;
    return this;
  }

  public UserArchitectBuilder setTags(List tags) {
    this.tags = tags;
    this.tags.add("Architect");
    return this;
  }

  public UserArchitectBuilder setTags(String tag) {
    if (Objects.isNull(this.tags)) {
      this.tags = new ArrayList();
      this.tags.add("Architect");
      this.tags.add(tag);
    } else {
      this.tags.add(tag);
    }
    return this;
  }

  public UserArchitectBuilder setYearsOfService(int yearsOfService) {
    this.yearsOfService = yearsOfService;
    return this;
  }

  @Override
  public UserBuilderInferface addDetails() {
    this.responsibilityLevel = 15;
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
