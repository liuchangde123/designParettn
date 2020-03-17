package designParettn.proxy;

public class HelloProxy implements HelloWorld {
    private Target target;

    public HelloProxy(Target target) {
        this.target = target;
    }

    @Override
    public void sayHi() {
        this.target.sayHi();
    }
}
