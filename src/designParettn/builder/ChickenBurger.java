package designParettn.builder;

public class ChickenBurger extends Burger {
    @Override
    public Double getPrice() {
        return 5.0;
    }

    @Override
    public String name() {
        return "鸡肉汉堡";
    }

}
