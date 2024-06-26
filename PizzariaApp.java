package pattern;

import pattern.domain.Pizza;
import pattern.domain.Pizza.Sabor;
import pattern.factories.AbstractFactory;
import pattern.factories.PizzariaBarra;

public class Pizzaria App{
  public static void main (String[] args){
    //Classes Concretas.
  //PizzaDePepperoni pizzaPepperoni = new PizzaDePepperoni();
  //PizzariaCentro pizzariaCentro = new PizzariaCentro();

  //Interfaces
  //AbstractFactory factory = PizzariaFactory.getFactory(Localidade.Centro);
  //AbstractFactory factory = NewPizzariaCentroFactory();

    
  AbstractFactory factory = NewPizzariaBarraFactory();
  Pizza pizza = factory.pedirPizza(Sabor.Calabresa);

  System.out.println(pizza);
  }
}
