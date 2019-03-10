package com.gupao.homework.single.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {

    private ContainerSingleton(){}

    private static Map<String,Object> map = new ConcurrentHashMap<>();

    public static Object getInstance (String className) throws ClassNotFoundException {
        synchronized (map) {
            if (!map.containsKey(className)) {
                Object object = Class.forName(className);
                map.put(className,object);
                return object;
            }else{
                return map.get(className);
            }
        }
    }

}
