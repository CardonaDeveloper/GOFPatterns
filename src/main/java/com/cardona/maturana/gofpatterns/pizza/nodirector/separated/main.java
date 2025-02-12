package com.cardona.maturana.gofpatterns.pizza.nodirector.separated;



import java.util.List;

public class main {
  public static void main(String[] args) {


    // Crear la pizza

 Pizza classicalPizza = new PizzaBuilder()
            .setBase("clasica")
            .setToppings(List.of("salsa de tomate", "queso", "peperoni"))
            .setDiameter(12)
            .setDoughColor("blanco")
            .setCheeseColor("blanco")
            .setNumberOfSlices(8)
            .build();

    // creamos una pizza especial
Pizza specialPizza = new PizzaBuilder()
            .setBase("delgada")
            .setToppings(List.of("salsa de tomate", "queso", "peperoni", "champiñones", "aceitunas", "pimenton"))
            .setDiameter(30)
            .setDoughColor("rojo")
            .setCheeseColor("amarillo")
            .setNumberOfSlices(12)
            .build();



    // mostramos la pizza clasica
    System.out.println("Mostrando pizza clasica");
    System.out.println(classicalPizza.toString());


    // mostramos la pizza especial
    System.out.println("Mostrando pizza especial");
    System.out.println(specialPizza.toString());

  }
}
