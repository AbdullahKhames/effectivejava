package examples.effectivejava.chapter2.item2;

import examples.effectivejava.utils.Tester;
import static examples.effectivejava.chapter2.item2.Pizza.Topping.*;
import static examples.effectivejava.chapter2.item2.NyPizza.Size.*;


public class PizzaTest implements Tester<Pizza> {
    @Override
    public Pizza test(Object o) {
        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE).addTopping(ONION).build();
        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM).sauceInside().build();
        
        System.out.println(pizza);
        System.out.println(calzone);

        return pizza;
    }
    
}
