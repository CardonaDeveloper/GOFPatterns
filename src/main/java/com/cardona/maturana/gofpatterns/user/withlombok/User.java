package com.cardona.maturana.gofpatterns.user.withlombok;

import lombok.Builder;
import lombok.ToString;

import java.util.List;

@Builder
@ToString
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

}
