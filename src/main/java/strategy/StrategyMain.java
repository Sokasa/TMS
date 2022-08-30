package strategy;

import java.util.Arrays;

public class StrategyMain {


    public static void main(String[] args) {

        //定义需要排序的数组
        int[] arr = {1,5,2,3,6,4};
        // 调用排序方法
        Sorter sorter = new Sorter();
        Sorter.sort(arr);
        // 输出结果
        System.out.println(Arrays.toString(arr));
    }
}
