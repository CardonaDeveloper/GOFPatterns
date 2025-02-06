package com.cardona.maturana.gofpatterns.pizza.withdirector.separated;


import java.util.List;

public class PizzaSpecialBuilder implements PizzaBuilderInterface {

    private String base;
    private List<String> toppings;
    private int diameter;
    private String doughColor;
    private String cheeseColor;
    private int numberOfSlices;

    public PizzaBuilderInterface makeBase(int diameter) {
        this.base = "delgada";
        this.diameter = diameter;
        this.doughColor = "rojo";
        this.cheeseColor = "blanco";
        return this;
    }

    public PizzaBuilderInterface addToppings(List<String> toppings) {
        this.toppings = toppings;
        return this;
    }

    public PizzaBuilderInterface slice(int numberOfSlices) {
        this.numberOfSlices = numberOfSlices;
        return this;
    }

    public Pizza build() {
        return new Pizza(base, toppings, diameter, doughColor, cheeseColor, numberOfSlices);
    }

    @Override
    public String toString() {
        return "PizzaSpecialBuilder{" +
                "base='" + base + '\'' +
                ", toppings=" + toppings +
                ", diameter=" + diameter +
                ", doughColor='" + doughColor + '\'' +
                ", cheeseColor='" + cheeseColor + '\'' +
                ", numberOfSlices=" + numberOfSlices +
                '}';
    }

}
