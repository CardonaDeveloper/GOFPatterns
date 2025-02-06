package com.cardona.maturana.gofpatterns.withdirector.separated;

import java.util.List;

public interface UserBuilderInferface {

  public UserBuilderInferface setId(int id);

  public UserBuilderInferface setFirstName(String firstName);

  public UserBuilderInferface setSecondName(String secondName);

  public UserBuilderInferface setFirstSurname(String firstSurname);

  public UserBuilderInferface setSecondSurname(String secondSurname);

  public UserBuilderInferface setAge(int age);

  public UserBuilderInferface setAddress(String address);

  public UserBuilderInferface setPhoneNumber(String phoneNumber);

  public UserBuilderInferface setProfession(String profession);

  public UserBuilderInferface setTags(List tags);

  public UserBuilderInferface setTags(String tag);

  public UserBuilderInferface setYearsOfService(int yearsOfService);

  public UserBuilderInferface addDetails();

  public User build();
}
