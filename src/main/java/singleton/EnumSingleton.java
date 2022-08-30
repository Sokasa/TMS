package singleton;

/**
 * 枚举单例，
 * 1. 解决线程同步问题，
 * 2. 因为没有构造方法(java规定)，因此无法被反序列化
 *
 */
public enum EnumSingleton {

    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()-> System.out.println(INSTANCE.hashCode())).start();
        }
    }
}
