package designParettn.factory;

public class Client {
    public static void main(String[] args) {
        ColorFactory colorFactory = new ColorFactory();
        Color red = colorFactory.getColor("Red");
        System.out.println(red.showColor());
        System.out.println(ColorFactory.getGreenColor().showColor());
    }
}
