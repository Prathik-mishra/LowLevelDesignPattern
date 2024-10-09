package AbstractFactoryDesignPattern;

public class EconomicFactory implements CarFactory{

    public Car getCarInstance(String input){
        if(input.equals("Maruti")){
            return new Maruti();
        }else if(input.equals("Mahindra")){
            return new Mahindra();
        }else{
            return null;
        }
    }
}
