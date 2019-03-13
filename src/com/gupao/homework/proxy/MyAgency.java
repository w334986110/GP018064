package com.gupao.homework.proxy;

import java.lang.reflect.Method;

public class MyAgency implements MyInvocationHandler{
    private Object target;
    public Object getInstance(Object target) throws Exception{
        this.target = target;
        Class<?> clazz = target.getClass();
        return MyGenerateProxyUtil.newProxyInstance(new MyClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        doBefore();
        Object object = method.invoke(this.target,args);
        doAfter();
        return object;
    }

    private void doBefore(){
        System.out.println("中介接受简历，寻找对口单位");
    }

    private void doAfter(){
        System.out.println("准备面试入职");
    }
}
