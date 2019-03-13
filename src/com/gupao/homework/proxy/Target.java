package com.gupao.homework.proxy;

public class Target implements ITrustee {
    @Override
    public void goodJob() {
        System.out.println("薪水高，福利好，美女多");
    }
}
