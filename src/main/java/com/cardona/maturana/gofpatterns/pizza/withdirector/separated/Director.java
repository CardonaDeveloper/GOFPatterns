package com.cardona.maturana.gofpatterns.pizza.withdirector.separated;

import java.util.List;

public class Director {

  public Pizza makePizza(
          PizzaBuilderInterface builder, int diameter, List<String> toppings, int numberOfSlices) {
    return builder.makeBase(diameter).addToppings(toppings).slice(numberOfSlices).build();
  }
}
