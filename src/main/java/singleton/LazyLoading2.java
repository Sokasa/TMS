package singleton;

/**
 * 懒汉模式x.0，通过加锁的方式解决1.0的线程问题
 */
public class LazyLoading2 {

    //这里 如果不加 volatile，在JIT进行语句重排-->编译成本地C语言时，会在没有初始化的时候，直接返回INSTANCE 
    private static volatile LazyLoading2 INSTANCE2;

    private LazyLoading2() {}

    /**
     * 2.0 加锁，解决。但是开销大
     * @return LazyLoading
     */
//    public static synchronized LazyLoading2 getInstance() {
//        if (INSTANCE2 == null) {
//            INSTANCE2 = new LazyLoading2();
//        }
//        return INSTANCE2;
//    }

    /**
     * 2.0 发展--> 3.0 , 缩小同步锁代码块，减小开销
     * 但是3.0 与1.0一样，线程不安全。
     * @return LazyLoading
     */
//    public static LazyLoading2 getInstance() {
//        //调用时进行判断，为空时才需要new()，但是这里的if 非线程安全的
//        if (INSTANCE2 == null) {
//            synchronized (LazyLoading2.class) {
//                INSTANCE2 = new LazyLoading2();
//            }
//        }
//        return INSTANCE2;
//    }

    /**
     * 4.0模式，双重校验
     * @return LazyLoading
     */
    public static LazyLoading2 getInstance() {
        if (INSTANCE2 == null) {
            synchronized (LazyLoading2.class) {
                if (INSTANCE2 == null) {
                    INSTANCE2 = new LazyLoading2();
                }
            }
        }
        return INSTANCE2;
    }


    public static void main(String[] args) {
        // 进行多线程并发获取实例
        for (int i = 0; i < 10; i++) {
            // 同一个类的不同对象，哈希码是不同的
            // 地址相同才是同一个对象
//            new Thread(()-> System.out.println(LazyLoading.getInstance().hashCode())).start();
            new Thread(()-> System.out.println(LazyLoading2.getInstance())).start();
        }

    }
}
