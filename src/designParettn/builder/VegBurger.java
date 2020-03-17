package designParettn.builder;

public class VegBurger extends Burger {
    @Override
    public Double getPrice() {
        return 3.0;
    }

    @Override
    public String name() {
        return "蔬菜汉堡";
    }

}
