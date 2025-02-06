package com.cardona.maturana.gofpatterns.user.nodirector.together;

import java.util.ArrayList;
import java.util.List;

public class main {
  public static void main(String[] args) {

    // Crear User con builder.
    List firstTags = new ArrayList();
    firstTags.add("GOF");
    firstTags.add("Patterns");
    firstTags.add("Builder");
    firstTags.add("Java");

    User usuario1 = new User.UserBuilder()
                    .setAddress("Cra 53 # 21-15")
                    .setTags("Developer")
                    .setTags("python")
                    .build();

    User usuario2 =
            new User.UserBuilder()
                    .setAddress("Cra 53 # 21-15")
                    .setTags(firstTags)
                    .setFirstName("Julio")
                    .setFirstSurname("Cardona")
                    .setAge(28)
                    .build();

    // crear un usuario, pero llenando todos los campos esta vez

    User usuario3 =
            new User.UserBuilder()
                    .setId(1)
                    .setFirstName("Julio")
                    .setSecondName("Andres")
                    .setFirstSurname("Cardona")
                    .setSecondSurname("Maturana")
                    .setAge(28)
                    .setAddress("Cra 53 # 21-15")
                    .setPhoneNumber("123456789")
                    .setProfession("Developer")
                    .setTags(firstTags)
                    .setYearsOfService(5)
                    .build();

    System.out.println("Mostrando usuario01");
    System.out.println(usuario1.toString());
    System.out.println("Mostrando usuario02");
    System.out.println(usuario2.toString());
    System.out.print("Mostrando usuario03");
    System.out.println(usuario3.toString());

  }
}
