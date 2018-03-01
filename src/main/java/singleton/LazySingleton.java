package singleton;

//懒汉式单例  与饿汉模式的区别就是 等到需要用的时候才创建对象
public class LazySingleton {
    private static LazySingleton instance = null;

    //构造函数必须私有
    private LazySingleton() {
    }

    //懒汉模式，在多线程环境下有可能出问题，所以得加上同步块
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
