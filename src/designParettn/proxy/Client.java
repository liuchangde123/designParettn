package designParettn.proxy;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        Target target = new Target();
        HelloWorld proxy = new HelloProxy(target);
        proxy.sayHi();
        HelloWorld o = (HelloWorld)Proxy.newProxyInstance(Client.class.getClassLoader(), new Class[]{HelloWorld.class}, new dynamicProxy(target));
        o.sayHi();
    }
}
