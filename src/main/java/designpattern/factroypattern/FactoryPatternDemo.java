package designpattern.factroypattern;

/**
 * Created by zangyaoyi on 2017/1/17.
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.getShape("rectangle");
        shape.draw();

        Shape shape1 = shapeFactory.getShape("square");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("circle");
        shape2.draw();
    }
}
