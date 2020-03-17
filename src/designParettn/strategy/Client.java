package designParettn.strategy;

public class Client {
    public static void main(String[] args) {
        SubtOperator subtOperator = new SubtOperator();
        System.out.println(subtOperator.doSomeThing(1,2));
        Client client = new Client();
        Operator operator = client::doIt;
        System.out.println(operator.doSomeThing(2,3));

    }

    public Integer doIt(Integer num1,Integer num2){
        return num1*num2;
    }
}
