package AbstractFactoryDesignPattern;

public class PremiumFactory implements CarFactory{

    public Car getCarInstance(String input){
        if(input.equals("BMW")){
            return new BMW();
        }else if(input.equals("Audi")){
            return new Audi();
        }else{
            return null;
        }
    }
}
