package SimpleFactoryPattern;

/**
 * Created by Snake on 2017/6/24.
 * 工厂模式适合：凡是出现了大量的产品需要创建，并且具有共同的接口时
 * 可以通过工厂方法模式进行创建。大多数情况下，我们会选用——静态工厂方法模式。
 */
public class FactoryTest {
    public static void main(String args[]){
        SendFactory factory = new SendFactory();
        Sender sender = factory.producer("123");
        if (sender != null){
            sender.Send();
        }

        Sender sendermail = SendFactory.produceMail();
        sendermail.Send();
        Sender sendersms = SendFactory.produceSMS();
        sendersms.Send();
    }
}
