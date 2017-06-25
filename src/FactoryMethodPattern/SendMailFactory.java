package FactoryMethodPattern;

/**
 * Created by Snake on 2017/6/25.
 */
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
