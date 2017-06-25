package SingletonPattern;

/**
 * Created by Snake on 2017/6/25.
 */



public class Singleton {
    /* 此处使用一个内部类来维护单例 */
    private static class SingletonFactory{
        private static Singleton instance = new Singleton();
    }

    private static Singleton instance = null;

    /* 私有构造方法，防止被实例化 */
    private Singleton(){

    }

    /* 获取实例 */
    public static Singleton getInstance(){
        return SingletonFactory.instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve(){
        return instance;
    }
}
