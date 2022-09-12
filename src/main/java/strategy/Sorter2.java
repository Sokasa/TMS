package strategy;

import strategy.model.Dog;

/**
 * 排序第二版。支持狗，或者某种特定实体类的排序
 * 由此，我们需要：
 * 1. 入参为特定实体类的数组
 * 2. 实体类自行定义个排序方法
 */
public class Sorter2 {

    /**
     * 排序方法 2.0
     * 选择排序，依次找到每次循环的最小值并固定下来
     */
    void sort(Dog[] dogs) {
        for (int i = 0; i < dogs.length - 1; i++) {
            int minIndex = i;

            for (int j = i+1; j < dogs.length; j++) {
                // 使用dog的排序方法进行排序
                minIndex = dogs[minIndex].compareTo(dogs[j]) < 0 ? minIndex : j;
            }
            swap(dogs, i, minIndex);
        }
    }

    private static void swap(Dog[] dogs, int present, int minIndex) {
        Dog temp = dogs[present];
        dogs[present] = dogs[minIndex];
        dogs[minIndex] = temp;
    }
}
