package FactoryDesignPattern;

public class ShapeFactory {
    Shape shape;

    public Shape getShape(String input){
        if(input.equals("Circle")){
            return new Circle();
        }else if(input.equals("Rectangle")){
            return new Rectangle();
        }else if(input.equals("Square")){
            return new Square();
        }else{
            return null;
        }
    }
}
