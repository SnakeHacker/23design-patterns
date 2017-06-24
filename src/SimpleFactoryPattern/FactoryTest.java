package SimpleFactoryPattern;

/**
 * Created by Snake on 2017/6/24.
 */
public class FactoryTest {
    public static void main(String args[]){
        SendFactory factory = new SendFactory();
        Sender sender = factory.producer("123");
        if (sender != null){
            sender.Send();
        }
        
    }
}
