package com.cardona.maturana.gofpatterns.pizza.withlombok;

import java.util.List;

public class main {
  public static void main(String[] args) {

    // Crear la pizza

    Pizza classicalPizza = Pizza.builder()
        .base("clasica")
      .toppings(List.of("salsa de tomate", "queso", "peperoni"))
        .diameter(12)
        .doughColor("blanco")
        .cheeseColor("blanco")
        .numberOfSlices(8)
        .build();

    // creamos una pizza especial
    Pizza specialPizza = Pizza.builder()
        .base("delgada")
        .toppings(List.of("salsa de tomate", "queso", "peperoni", "champiñones", "aceitunas", "pimenton"))
        .diameter(30)
        .doughColor("rojo")
        .cheeseColor("amarillo")
        .numberOfSlices(12)
        .build();



    // mostramos la pizza clasica
    System.out.println("Mostrando pizza clasica");
    System.out.println(classicalPizza.toString());


    // mostramos la pizza especial
    System.out.println("Mostrando pizza especial");
    System.out.println(specialPizza.toString());
  }
}
