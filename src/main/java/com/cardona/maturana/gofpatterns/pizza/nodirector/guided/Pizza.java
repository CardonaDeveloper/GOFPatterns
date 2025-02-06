package com.cardona.maturana.gofpatterns.pizza.nodirector.guided;

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

  public String getCheeseColor() {
    return cheeseColor;
  }

  public int getNumberOfSlices() {
    return numberOfSlices;
  }

  @Override
  public String toString() {
    return "Pizza{"
        + "base='"
        + base
        + '\''
        + ", toppings="
        + toppings
        + ", diameter="
        + diameter
        + ", doughColor='"
        + doughColor
        + '\''
        + ", cheeseColor='"
        + cheeseColor
        + '\''
        + ", numberOfSlices="
        + numberOfSlices
        + '}';
  }
}
