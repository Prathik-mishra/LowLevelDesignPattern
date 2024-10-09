package FactoryDesignPattern;

public class FactoryDesign {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("Circle");
        Shape Square = shapeFactory.getShape("Square");
        Shape Rectangle = shapeFactory.getShape("Rectangle");

    }
}
