package designParettn.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class dynamicProxy implements InvocationHandler {
    private Target target;

    public dynamicProxy(Target target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(target,args);
    }
}
