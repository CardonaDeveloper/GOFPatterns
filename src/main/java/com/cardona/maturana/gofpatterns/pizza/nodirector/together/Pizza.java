package com.cardona.maturana.gofpatterns.pizza.nodirector.together;

import java.util.List;

public class Pizza {

  private final String base;
  private final List<String> toppings;
  private final int diameter;
  private final String doughColor;
  private final String cheeseColor;
  private final int numberOfSlices;

    public Pizza(
        int diameter,
        String base,
        List<String> toppings,
        String doughColor,
        String cheeseColor,
        int numberOfSlices) {
        this.diameter = diameter;
        this.base = base;
        this.toppings = toppings;
        this.doughColor = doughColor;
        this.cheeseColor = cheeseColor;
        this.numberOfSlices = numberOfSlices;
    }

  public String getCheeseColor() {
    return cheeseColor;
  }

  public String getBase() {
    return base;
  }

  public List<String> getToppings() {
    return toppings;
  }

  public int getDiameter() {
    return diameter;
  }

  public String getDoughColor() {
    return doughColor;
  }

  public int getNumberOfSlices() {
    return numberOfSlices;
  }

  @Override
  public String toString() {
    return "Pizza{" +
            "base='" + base + '\'' +
            ", toppings=" + toppings +
            ", diameter=" + diameter +
            ", doughColor='" + doughColor + '\'' +
            ", cheeseColor='" + cheeseColor + '\'' +
            ", numberOfSlices=" + numberOfSlices +
            '}';
  }


  public static class PizzaBuilder {

    private  String base;
    private  List<String> toppings;
    private  int diameter;
    private  String doughColor;
    private  String cheeseColor;
    private  int numberOfSlices;

    public PizzaBuilder setBase(String base) {
      this.base = base;
      return this;
    }

    public PizzaBuilder setToppings(List<String> toppings) {
      this.toppings = toppings;
      return this;
    }

    public PizzaBuilder setDiameter(int diameter) {
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

    public Pizza build() {
      return new Pizza(diameter, base, toppings, doughColor, cheeseColor, numberOfSlices);
    }
  }
  public static PizzaBuilder builder() {
    return new PizzaBuilder();
  }
}
