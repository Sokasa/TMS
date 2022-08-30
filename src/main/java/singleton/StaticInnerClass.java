package singleton;

/**
 * 静态内部类的方式，实现懒加载的同时，保持单例
 *
 * 1. 父类在加载的时候， 内部类不会被加载
 * 2. 当调用方使用父类的实例方法时，才会加载内部类，并且返回一个单例的父类
 * 3. JVM保证每一个类只加载一次
 */
public class StaticInnerClass {

    private StaticInnerClass(){}

    /**
     * 静态内部类
     */
    private static class StaticInnerHolder {
        //有且仅有一个属性
        private static final StaticInnerClass INSTANCE = new StaticInnerClass();
    }

    /**
     * 实例化方法
     * 调用该方法时才会加载 StaticInnerHolder这个内部类
     */
    public static StaticInnerClass getInstance() {
        return StaticInnerHolder.INSTANCE;
    }

    public static void main(String[] args) {
        // 进行多线程并发获取实例
        for (int i = 0; i < 10; i++) {
            new Thread(()-> System.out.println(StaticInnerClass.getInstance())).start();
        }

    }
}
