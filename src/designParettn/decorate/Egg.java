package designParettn.decorate;

public class Egg implements Decorator {
    private Drink drink;

    public Egg(Drink drink) {
        this.drink = drink;
    }

    @Override
    public void showAll() {
        System.out.println("这是杯"+this.getName());
    }

    @Override
    public String getName() {
        return "鸡蛋"+drink.getName();
    }
}
