package com.cardona.maturana.gofpatterns.user.nodirector.together;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

  private User(
      int id,
      String firstName,
      String secondName,
      String firstSurname,
      String secondSurname,
      int age,
      String address,
      String phoneNumber,
      String profession,
      List tags,
      int yearsOfService) {
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
    return "User{"
        + "id="
        + id
        + ", firstName='"
        + firstName
        + '\''
        + ", secondName='"
        + secondName
        + '\''
        + ", firstSurname='"
        + firstSurname
        + '\''
        + ", secondSurname='"
        + secondSurname
        + '\''
        + ", age="
        + age
        + ", address='"
        + address
        + '\''
        + ", phoneNumber='"
        + phoneNumber
        + '\''
        + ", profession='"
        + profession
        + '\''
        + ", tags="
        + tags
        + ", yearsOfService="
        + yearsOfService
        + '}';
  }

  public static class UserBuilder {
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

    public UserBuilder setYearsOfService(int yearsOfService) {
      this.yearsOfService = yearsOfService;
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

    public UserBuilder setProfession(String profession) {
      this.profession = profession;
      return this;
    }

    public UserBuilder setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }

    public UserBuilder setAddress(String address) {
      this.address = address;
      return this;
    }

    public UserBuilder setAge(int age) {
      this.age = age;
      return this;
    }

    public UserBuilder setSecondSurname(String secondSurname) {
      this.secondSurname = secondSurname;
      return this;
    }

    public UserBuilder setFirstSurname(String firstSurname) {
      this.firstSurname = firstSurname;
      return this;
    }

    public UserBuilder setSecondName(String secondName) {
      this.secondName = secondName;
      return this;
    }

    public UserBuilder setFirstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public UserBuilder setId(int id) {
      this.id = id;
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
}
