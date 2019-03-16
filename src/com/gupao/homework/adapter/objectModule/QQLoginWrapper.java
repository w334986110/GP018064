package com.gupao.homework.adapter.objectModule;

public class QQLoginWrapper implements LoginService {

    private OldLogin oldLogin;

    public QQLoginWrapper(OldLogin oldLogin) {
        super();
        this.oldLogin = oldLogin;
    }

    @Override
    public void original() {
        oldLogin.original();
    }

    @Override
    public void loginFromQQ() {
        System.out.println("选择QQ账户登录");
    }
}
