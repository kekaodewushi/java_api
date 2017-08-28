package designpattern.abstractfactorypattern;

import designpattern.factroypattern.Circle;
import designpattern.factroypattern.Rectangle;
import designpattern.factroypattern.Shape;
import designpattern.factroypattern.Square;

/**
 * Created by zangyaoyi on 2017/1/17.
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}
