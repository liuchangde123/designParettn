package designParettn.builder;

public class Coke extends Drink {
    @Override
    public Double getPrice() {
        return 2.0;
    }

    @Override
    public String name() {
        return "可口可乐";
    }
}
