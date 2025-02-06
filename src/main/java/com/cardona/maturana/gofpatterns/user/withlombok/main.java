package com.cardona.maturana.gofpatterns.user.withlombok;

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

    User usuario1 = User.builder()
            .id(1)
            .firstName("Julio")
            .firstSurname("lombok")
            .age(28)
            .address("Cra 53 # 21-15")
            .tags(firstTags)
            .build();

    User usuario2 =  User.builder().address("Cra 53 # 21-15")
            .tags(firstTags)
            .firstName("Andrés")
            .firstSurname("Patiño")
            .age(28)
            .build();

    System.out.println("Mostrando usuario1");
    System.out.println(usuario1.toString());
    System.out.println("Mostrando usuario2");
    System.out.println(usuario2.toString());

  }
}
