package com.cardona.maturana.gofpatterns.pizza.nodirector.guided;

import java.util.List;

public interface PizzaBuilderInterface {

    public interface Base {
        Diameter setBase(String base);
    }

    public interface Topping {

        PizzaDetails setToppings(List<String> toppings);
    }

    public interface Diameter {

        Topping setDiameter(int diameter);
    }


    public interface PizzaDetails{

        PizzaDetails setDoughColor(String doughColor);

        PizzaDetails setCheeseColor(String cheeseColor);

        PizzaDetails setNumberOfSlices(int numberOfSlices);

        Pizza build();
    }

}
