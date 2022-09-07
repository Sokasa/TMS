package strategy;

import strategy.model.Dog;

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

    }
}
