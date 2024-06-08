package pattern.factories;

import pattern.domain.Pizza;

public class PizzariaBarraFactory extends PizzariaFactory {

 private Pizzaria pizzaria;

public PizzariaBarraFactory(){
  pizzaria = new PizzariaBarra();
}

@Override
public Pizza pedirPizza(Sabor sabor){
  return pizzaria.pedirPizza(Sabor);
  }
}
  
