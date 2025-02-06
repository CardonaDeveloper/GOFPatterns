package com.cardona.maturana.gofpatterns.pizza.nodirector.separated;


import java.util.List;

public class PizzaBuilder {

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
