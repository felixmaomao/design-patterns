package singleton;


import com.felix.core.utils.JsonUtil;

public class SingletonTest {

    public static void main(String[] args) {
        //testLazy();
        testEnum();
    }

    public static void testHungry() {
        HungrySingleton h1 = HungrySingleton.getInstance();
        HungrySingleton h2 = HungrySingleton.getInstance();

        //正常使用下成立
        System.out.println(h1 == h2);

        //在面对序列化  反序列化攻击时失效
        String h1Json = JsonUtil.toJSONString(h1);
        String h2Json = JsonUtil.toJSONString(h2);
        HungrySingleton h3 = JsonUtil.parseObject(h1Json, HungrySingleton.class);
        HungrySingleton h4 = JsonUtil.parseObject(h2Json, HungrySingleton.class);
        System.out.println(h3 == h4);
    }

    public static void testLazy() {
        LazySingleton l1 = LazySingleton.getInstance();
        LazySingleton l2 = LazySingleton.getInstance();
        System.out.println(l1 == l2);

        //同样在序列化反序列化攻击时 失效
        String l1Json = JsonUtil.toJSONString(l1);
        String l2Json = JsonUtil.toJSONString(l2);
        LazySingleton l3 = JsonUtil.parseObject(l1Json, LazySingleton.class);
        LazySingleton l4 = JsonUtil.parseObject(l2Json, LazySingleton.class);

        System.out.println(l3 == l4);
    }

    public static void testEnum() {
        EnumSingleton e1 = EnumSingleton.INSTANCE;
        EnumSingleton e2 = EnumSingleton.INSTANCE;

        System.out.println(e1 == e2);

        //面对序列化攻击,依然有效
        String e1Json = JsonUtil.toJSONString(e1);
        String e2Json = JsonUtil.toJSONString(e2);
        EnumSingleton e3 = JsonUtil.parseObject(e1Json, EnumSingleton.class);
        EnumSingleton e4 = JsonUtil.parseObject(e2Json, EnumSingleton.class);

        System.out.println(e3 == e4);
    }
}
