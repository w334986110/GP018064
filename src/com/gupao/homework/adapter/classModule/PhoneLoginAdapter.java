package com.gupao.homework.adapter.classModule;

/**
 * 这样新的登录方式也拥有了原来的登录方式
 */
public class PhoneLoginAdapter extends OldLogin implements LoginService {
    @Override
    public void loginFromPhone() {
        System.out.println("通过手机号登录");
    }
}
