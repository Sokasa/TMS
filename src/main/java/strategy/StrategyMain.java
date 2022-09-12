package strategy;

import strategy.model.Cat3;
import strategy.model.Dog;
import strategy.model.Dog3;

import java.util.Arrays;

public class StrategyMain {


    public static void main(String[] args) {

        //定义需要排序的数组
        int[] arr = {1,5,2,3,6,4};
        // 调用排序方法，最初版本
        Sorter sorter = new Sorter();
        sorter.sort(arr);
        // 输出结果
        System.out.println("=======版本1结果======");
        System.out.println(Arrays.toString(arr));

        // 对自定义狗狗数组进行排序?
        Dog[] dogs = {new Dog(5), new Dog(2),new Dog(7),new Dog(3),new Dog(4)};
        // 使用第二版sorter
        Sorter2 sorter2 = new Sorter2();
        sorter2.sort(dogs);
        System.out.println("=======版本2排序结束======");
        System.out.println(Arrays.toString(dogs));

        // 对自定义狗狗数组排序的同时，能否支持对自定义猫猫数组的排序？
        Dog3[] dog3 = {new Dog3(5), new Dog3(2),new Dog3(7),new Dog3(3),new Dog3(4)};
        Cat3[] cat3 = {new Cat3(5), new Cat3(2),new Cat3(7),new Cat3(3),new Cat3(4)};
        Sorter3 sorter3 = new Sorter3();
        sorter3.sort(dog3);
        sorter3.sort(cat3);
        System.out.println("=======版本3排序结束======");
        System.out.println(Arrays.toString(dog3));
        System.out.println(Arrays.toString(cat3));

    }
}
