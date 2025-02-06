package com.cardona.maturana.gofpatterns.withdirector.separated;

public class main {
  public static void main(String[] args) {

    //Creamos los builders
    UserBuilderInferface userDeveloper = new UserDeveloperBuilder();
    UserBuilderInferface userArchitect = new UserArchitectBuilder();

    //Creamos los directores
    Director director = new Director();

    //Construyendo ambos objetos, El director es quien orquesta tal construcción.

    //Construyendo developer
    director.makeUser(userDeveloper);
    //Construyendo architect
    director.makeUser(userArchitect);

    //Mostrando con el mismo director
    System.out.println("Mostrando con el mismo director");
    System.out.println(userDeveloper.build().toString());
    // mostrando los datos de userArchitect
    System.out.println(userArchitect.build().toString());

  }
}
