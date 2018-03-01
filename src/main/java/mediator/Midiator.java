package mediator;


//中介者模式 也是为了去除类之间的相互引用，转而通过一个中介对象来达到 通知效果。是的耦合松散。
//中介者需要能通知这些注册进来的对象
//一定要避免出现 A->B->A->B->..的死循环，及一直相互通知。解决方式就是，重载两套业务的方法，一套带通知，一套不带。
public class Midiator {

    //如果需要中介者通知的对象很多，则需要用list来存放，但要小心重复通报！
    PersistantDB persistantDB;
    PersistentCloud persistentCloud;

    public Midiator setPersistantDB(PersistantDB persistantDB) {
        this.persistantDB = persistantDB;
        return this;
    }

    public Midiator setPersistantCloud(PersistentCloud persistantCloud) {
        this.persistentCloud = persistantCloud;
        return this;
    }

    public void notifyOthers(Persistent current, String data) {
        //此处尤须注意 ，是通知 其他的，而不是通知自己！！！
        if (current instanceof PersistantDB) {
            persistentCloud.save(data);    //此处不能再调用带通知的方法了
        }

        if (current instanceof PersistentCloud) {
            persistantDB.save(data);
        }
    }
}
