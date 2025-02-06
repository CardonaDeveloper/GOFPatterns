package com.cardona.maturana.gofpatterns.pizza.withlombok;

import java.util.List;
import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Pizza {

  private final String base;
  private final List<String> toppings;
  private final int diameter;
  private final String doughColor;
  private final String cheeseColor;
  private final int numberOfSlices;


}
