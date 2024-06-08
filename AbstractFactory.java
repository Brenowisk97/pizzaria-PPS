package pattern.factories;

import pattern.domain.Pizza;

public interface AbstractFactory {

          public Pizza pedirPizza(Sabor sabor);

}
