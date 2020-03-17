package designParettn.builder;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.ToDoubleBiFunction;
import java.util.stream.Collectors;

public class Meal {
    private List<Item>list = new ArrayList<>(16);

    public void add(Item item){
        list.add(item);
    }

    public Double getAllPrice(){
        OptionalDouble reduce = list.stream().mapToDouble(x -> x.getPrice()).reduce((x, y) -> x + y);
        return reduce.getAsDouble();
    }

    public String getAllName(){
        return list.stream().map(x->x.name()).collect(Collectors.joining(",","[","]"));
    }
}
