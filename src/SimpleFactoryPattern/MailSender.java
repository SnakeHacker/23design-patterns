package SimpleFactoryPattern;

/**
 * Created by Snake on 2017/6/24.
 */
public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("This is implements");
    }
}
