package SimpleFactoryPattern;

/**
 * Created by Snake on 2017/6/24.
 */
public class SendFactory {
    public Sender producer(String type){
        if("mail".equals(type)){
            return new MailSender();
        }else if ("sms".equals(type)){
            return new SmsSender();
        }else {
            System.out.println("输入正确的类型");
            return null;
        }
    }
}
