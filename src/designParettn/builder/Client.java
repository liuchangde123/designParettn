package designParettn.builder;

public class Client {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.mealOne();
        System.out.println("该套餐为:"+meal.getAllName()+"  总价格:"+meal.getAllPrice());
    }
}
