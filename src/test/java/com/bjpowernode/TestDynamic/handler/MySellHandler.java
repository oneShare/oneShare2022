package com.bjpowernode.TestDynamic.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MySellHandler implements InvocationHandler {

    private Object target;

    public MySellHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object res = null;
        res = method.invoke(target,args);

        if(res != null){
            float price = (float)res;
            price += 25;
            res = price;
        }
        return res;

    }

    public Object getProxy(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }

}
