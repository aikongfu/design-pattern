package com.mingshashan.learn.design.pattern.basic_principle.o;

public class AccountSignIn2 {
    INotice notice;

    AccountSignIn2(INotice notice) {
        this.notice = notice;
    }

    public void signIn() {
        // 注册的逻辑
        // 通知的逻辑
        notice.notice();
    }
}

interface INotice {
    void notice();
}

class EmailNotice implements INotice {
    public void notice() {

    }
}

class SMSNotice implements INotice {
    public void notice() {

    }
}