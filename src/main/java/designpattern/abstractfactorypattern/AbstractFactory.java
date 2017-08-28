package designpattern.abstractfactorypattern;

import designpattern.factroypattern.Shape;

/**
 * Created by zangyaoyi on 2017/1/17.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);

    abstract Shape getShape(String shape);
}
