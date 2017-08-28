package designpattern.factroypattern;

/**
 * Created by zangyaoyi on 2017/1/17.
 */
public class ShapeFactory {
    public Shape getShape(String type) {
        if ("rectangle".equals(type)) {
            return new Rectangle();
        }
        if ("square".equals(type)) {
            return new Square();
        }
        if ("circle".equals(type)) {
            return new Circle();
        }
        return null;
    }
}
