package com.cardona.maturana.gofpatterns.withdirector.separated;

public class Director {

    public void makeUser(UserBuilderInferface builder){
        builder.setId(1)
                .addDetails()
                .setFirstName("Juan")
                .setSecondName("Carlos")
                .setFirstSurname("Cardona")
                .setSecondSurname("Gomez")
                .setAge(30)
                .setAddress("Calle 123")
                .setPhoneNumber("1234567")
                .setProfession("Ingeniero de Sistemas")
                .setTags("Java")
                .setTags("Spring")
                .setYearsOfService(5);
    }

}
