package designpattern.abstractfactorypattern;

/**
 * Created by zangyaoyi on 2017/1/17.
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
