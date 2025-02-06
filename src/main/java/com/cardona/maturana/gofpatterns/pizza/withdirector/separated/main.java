package com.cardona.maturana.gofpatterns.pizza.withdirector.separated;

import java.util.List;

public class main {
  public static void main(String[] args) {

    //Creamos los builders
    PizzaBuilderInterface classicalBuilder = new PizzaClassicalBuilder();
    PizzaBuilderInterface specialBuilder = new PizzaSpecialBuilder();

    //Creamos el director

    Director director = new Director();

    Pizza pizza1 = director.makePizza(classicalBuilder, 12, List.of("Pepperoni", "Mushrooms"), 8);
    Pizza pizza2 = director.makePizza(specialBuilder, 20, List.of("Pepperoni", "Mushrooms", "Pineapple"), 12);


    //Mostrando las pizzas creadas con el mismo director

    System.out.println("********** Mostrando Pizzas ********** ");
    System.out.println("Pizza Clasica");
    System.out.println(pizza1);
    System.out.println("Pizza Especial");
    System.out.println(pizza2);

  }
}
