package singleton;

/**
 * 饿汉模式
 * 类加载到内存就，就实例化一个单例，JVM保证线程安全
 * 1.简单实用
 * 2.不管用到与否，类加载就实例化了
 *
 */
public class HungryPatterns {

    private static final HungryPatterns INSTANCE = new HungryPatterns();

    //私有化构造方法，禁止外部直接调用
    private HungryPatterns() {};

    // 提供一个静态方法，返回实例
    public static HungryPatterns getInstance() {
        return INSTANCE;
    }

    // 测试方法，确认单例
    public void testMsg() {
        System.out.println("我是单例");
    }

    public static void main(String[] args) {
        HungryPatterns hungryPatterns1 = HungryPatterns.getInstance();
        HungryPatterns hungryPatterns2 = HungryPatterns.getInstance();

        System.out.println(hungryPatterns1 == hungryPatterns2);

    }
}
