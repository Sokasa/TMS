package singleton;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 懒汉模式，按需加载
 * 线程不安全
 */
public class LazyLoading {

    private static LazyLoading INSTANCE;

    private LazyLoading() {}

    /**
     * 最开始不会初始化，仅有调用该方法时进行初始化
     * @return LazyLoading
     */
    public static LazyLoading getInstance() {
        //调用时进行判断，为空时才需要new()，但是这里的if 非线程安全的
        if (INSTANCE == null) {

            INSTANCE = new LazyLoading();
        }
        return INSTANCE;
    }


    public static void main(String[] args) {
        // 进行多线程并发获取实例
        for (int i = 0; i < 5; i++) {
            // 同一个类的不同对象，哈希码是不同的
            // 地址相同才是同一个对象
//            new Thread(()-> System.out.println(LazyLoading.getInstance().hashCode())).start();
            new Thread(()-> System.out.println(LazyLoading.getInstance())).start();
        }

    }

}
