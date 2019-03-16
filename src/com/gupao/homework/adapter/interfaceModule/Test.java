package com.gupao.homework.adapter.interfaceModule;

public class Test {
    public static void main(String[] args) {
        LoginService service = new PhoneLoginWrapper ();
        service.loginFromPhone();

        LoginService service2 = new QQLoginWrapper();
        service2.loginFromQQ();
    }
}
