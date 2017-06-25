package SingletonPattern;

/**
 * Created by Snake on 2017/6/25.
 */
public class SingletonTest {
    private static SingletonTest instance = null;

    private SingletonTest(){}

    private static synchronized void synclnit(){
        if(instance == null){
            instance = new SingletonTest();
        }
    }

    public static SingletonTest getInstance(){
        if(instance == null){
            synclnit();
        }
        return instance;
    }
}
