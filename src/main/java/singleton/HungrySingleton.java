package singleton;


//单例模式的核心在于让一个类仅有一个实例，并且提供一个访问它的全局访问点

//饿汉模式的单例,及对象一直存在，而非等到需要时才创建
public class HungrySingleton {

    //已经初始好的唯一对象，一直存在
    private static HungrySingleton instance = new HungrySingleton();

    //构造函数必要私有
    private HungrySingleton() {
    }

    //统一获取点
    public static HungrySingleton getInstance() {
        return instance;
    }
}
