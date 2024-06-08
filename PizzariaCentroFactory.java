package pattern.factories;

import pattern.domain.Pizza;

public class PizzariaCentroFactory extends PizzariaFactory {

 private Pizzaria pizzaria;

public PizzariaCentroFactory(){
  pizzaria = new PizzariaCentro();
}

@Override
public Pizza pedirPizza(Sabor sabor){
  return pizzaria.pedirPizza(Sabor);
  }
}
  
