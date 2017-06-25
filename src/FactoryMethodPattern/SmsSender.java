package FactoryMethodPattern;

/**
 * Created by Snake on 2017/6/24.
 */
public class SmsSender implements Sender {
    @Override
    public void Send() {
        System.out.println("This is Sms Sender");
    }
}
