package myownannotation;

import java.lang.reflect.Proxy;

import static java.lang.reflect.Proxy.newProxyInstance;

public class Decorator {

    public static Object decorate(Object toDecorate){
        Class<? extends Object> aClass = toDecorate.getClass();
        return Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(), new LoggingAspect(toDecorate));
    }
}
