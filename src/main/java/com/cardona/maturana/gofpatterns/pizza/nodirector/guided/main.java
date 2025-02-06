package com.cardona.maturana.gofpatterns.pizza.nodirector.guided;

import java.util.List;

public class main {
  public static void main(String[] args) {

    Pizza classicalPizza = PizzaBuilder.builder()
            .setBase("clasica")
            .setDiameter(12)
            .setToppings(List.of("salsa de tomate", "queso", "peperoni"))
            .setDoughColor("blanco")
            .setCheeseColor("blanco")
            .setNumberOfSlices(8)
            .build();


    // mostramos la pizza clasica
    System.out.println("Mostrando pizza clasica");
    System.out.println(classicalPizza.toString());

  }
}
