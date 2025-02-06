package com.cardona.maturana.gofpatterns.pizza.withdirector.separated;


import java.util.List;

public class Pizza {

    private final String base;
    private final List<String> toppings;
    private final int diameter;
    private final String doughColor;
    private final String cheeseColor;
    private final int numberOfSlices;

    public Pizza(String base, List<String> toppings, int diameter, String doughColor, String cheeseColor, int numberOfSlices) {
        this.base = base;
        this.toppings = toppings;
        this.diameter = diameter;
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
        return "Pizza{" +
                "base='" + base + '\'' +
                ", toppings=" + toppings +
                ", diameter=" + diameter +
                ", doughColor='" + doughColor + '\'' +
                ", cheeseColor='" + cheeseColor + '\'' +
                ", numberOfSlices=" + numberOfSlices +
                '}';
    }
}
