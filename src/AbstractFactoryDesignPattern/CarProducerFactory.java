package AbstractFactoryDesignPattern;

public class CarProducerFactory {

    public CarFactory getCarFactoryInstance(String input){

        if(input.equals("Economic")){
            return new EconomicFactory();
        }else if(input.equals("Premium")){
            return new PremiumFactory();
        }
        return null;
    }
}
