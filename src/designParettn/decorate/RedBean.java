package designParettn.decorate;

public class RedBean implements Decorator {
    private Drink drink;

    public RedBean(Drink drink) {
        this.drink = drink;
    }

    @Override
    public void showAll() {
        System.out.println("这是杯"+this.getName());
    }

    @Override
    public String getName() {
        return "红豆"+drink.getName();
    }
}
