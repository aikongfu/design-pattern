package com.mingshashan.learn.design.pattern.basic_principle.o;

public class AccountSignIn {
    public void signIn() {
        // 注册的逻辑
        // 通知的逻辑
        String type = "手机号";
        // or String type = "邮箱";
        notice(type);
    }

    void notice(String type) {
        if (type.equals("手机号")) {

        }
        if (type.equals("邮箱")) {

        }
        if (type.equals("other")) {

        }
    }
}