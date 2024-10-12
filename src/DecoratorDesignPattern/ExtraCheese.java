package DecoratorDesignPattern;

public class ExtraCheese extends Toppings{
    BasePizza basePizza;
    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    public int cost(){
        return this.basePizza.cost() + 100;
    }
}
