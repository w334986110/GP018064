package com.gupao.homework.adapter.objectModule;

public class Test {
    public static void main(String[] args) {
        OldLogin oldLogin = new OldLogin();
        LoginService loginService = new QQLoginWrapper(oldLogin);
        loginService.original();
        loginService.loginFromQQ();

    }
}
