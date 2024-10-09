package AbstractFactoryDesignPattern;

public class AbstractFactory {
    public static void main(String[] args) {

        //Note it is a Factory of Factory
        CarProducerFactory carProducerFactory = new CarProducerFactory();
        CarFactory carFactory = carProducerFactory.getCarFactoryInstance("Premium");
        Car car = carFactory.getCarInstance("BMW");
        car.getSpeed();
    }
}
