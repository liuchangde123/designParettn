package designParettn.strategy;

public class SumOperator implements Operator {
    @Override
    public Integer doSomeThing(Integer num1, Integer num2) {
        return num1+num2;
    }
}
