package com.mingshashan.learn.design.pattern;

public class SingleResponsibilityPrinciple {

    interface IEmail {
        public void setSender(String sender);

        public void setReceiver(String receiver);

        public void setContent(IContent content);
    }

    interface IContent {

    }

    class Email implements IEmail {
        // set sender;
        public void setSender(String sender) {
        }

        // set receiver;
        public void setReceiver(String receiver) {
        }

        // set content;
        public void setContent(IContent content) {
        }
    }

    class Content implements IContent {

    }
}
