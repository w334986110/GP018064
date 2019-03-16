package com.gupao.homework.adapter.classModule;

import com.gupao.homework.adapter.classModule.LoginService;
import com.gupao.homework.adapter.classModule.PhoneLoginAdapter;

public class Test {
    public static void main(String[] args) {
        LoginService service = new PhoneLoginAdapter();
        service.original();
        service.loginFromPhone();


    }
}
