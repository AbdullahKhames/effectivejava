package examples.effectivejava;

import examples.effectivejava.chapter2.item2.PizzaTest;

public class App 
{
    public static void main( String[] args )
    {
        testItem2();
    }

    static void testItem2() {
        new PizzaTest().test(null);
    }
}
