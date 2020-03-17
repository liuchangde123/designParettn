package designParettn.flyweight;

import designParettn.factory.Color;

public class Client {
    public static void main(String[] args) {
        ColorFactory colorFactory = new ColorFactory();
        Color red = colorFactory.getColor("red");
        System.out.println(red.showColor());

    }
}
