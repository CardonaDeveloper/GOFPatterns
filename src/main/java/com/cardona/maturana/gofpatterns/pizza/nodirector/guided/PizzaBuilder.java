package com.cardona.maturana.gofpatterns.pizza.nodirector.guided;

import java.util.List;

public class PizzaBuilder implements  PizzaBuilderInterface.Base, PizzaBuilderInterface.Diameter, PizzaBuilderInterface.Topping, PizzaBuilderInterface.PizzaDetails {

  private String base;
  private List<String> toppings;
  private int diameter;
  private String doughColor;
  private String cheeseColor;
  private int numberOfSlices;

  private PizzaBuilder (){

  }

  public PizzaBuilderInterface.Diameter setBase(String base) {
    this.base = base;
    return this;
  }

  public PizzaBuilderInterface.PizzaDetails setToppings(List<String> toppings) {
    this.toppings = toppings;
    return this;
  }

  public PizzaBuilderInterface.Topping setDiameter(int diameter) {
    this.diameter = diameter;
    return this;
  }

  public PizzaBuilder setDoughColor(String doughColor) {
    this.doughColor = doughColor;
    return this;
  }

  public PizzaBuilder setCheeseColor(String cheeseColor) {
    this.cheeseColor = cheeseColor;
    return this;
  }

  public PizzaBuilder setNumberOfSlices(int numberOfSlices) {
    this.numberOfSlices = numberOfSlices;
    return this;
  }

  public static PizzaBuilderInterface.Base builder() {
    return new PizzaBuilder();
  }

  public Pizza build() {
    return new Pizza(diameter, base, toppings, doughColor, cheeseColor, numberOfSlices);
  }
}
