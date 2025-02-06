package com.cardona.maturana.gofpatterns.pizza.withdirector.separated;

import java.util.List;

public interface PizzaBuilderInterface {


  public PizzaBuilderInterface makeBase(int diameter);

  public PizzaBuilderInterface addToppings(List<String> toppings);

  public PizzaBuilderInterface slice(int numberOfSlices);

  public Pizza build();

}
