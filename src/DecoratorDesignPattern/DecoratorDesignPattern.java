package DecoratorDesignPattern;

public class DecoratorDesignPattern {
    public static void main(String[] args) {

        BasePizza pizza = new ExtraCheese(new FarmHouse());
        System.out.println(pizza.cost());
    }
}
