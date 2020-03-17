package designParettn.builder;

public class MealBuilder {
    public Meal mealOne(){
        Meal meal = new Meal();
        meal.add(new ChickenBurger());
        meal.add(new Pesi());
        return meal;
    }
    public Meal mealTwo(){
        Meal meal = new Meal();
        meal.add(new ChickenBurger());
        meal.add(new Coke());
        return meal;
    }
    public Meal mealThree(){
        Meal meal = new Meal();
        meal.add(new VegBurger());
        meal.add(new Pesi());
        return meal;
    }
    public Meal mealFour(){
        Meal meal = new Meal();
        meal.add(new VegBurger());
        meal.add(new Coke());
        return meal;
    }
}
