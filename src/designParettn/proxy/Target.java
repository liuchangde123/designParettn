package designParettn.proxy;

public class Target implements HelloWorld {
    @Override
    public void sayHi() {
        System.out.println("i am zhangsan");
    }
}
