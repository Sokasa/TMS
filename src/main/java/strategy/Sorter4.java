package strategy;


/**
 * 排序第四版。同时支持狗，猫等多种实体类排序，并且支持自定义排序方式
 * 由此，我们需要：
 * 1. 入参为泛型实体类的数组
 * 2. 实体类的排序方式(比较策略)。 作为策略模式核心，每个排序策略都是一个单独的类（开闭原则，就排序方式而言。策略模式隔离了变化点）
 */
public class Sorter4<T> {

    /**
     * 排序方法 4.0
     * 选择排序，依次找到每次循环的最小值并固定下来
     * @param arr 需要排序的数组
     * @param compareTor 排序方式
     */
    void sort(T[] arr, SortCompareTor<T> compareTor) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i+1; j < arr.length; j++) {
                // 使用dog的排序方法进行排序
                minIndex = compareTor.compare(arr[minIndex],arr[j]) == -1 ? minIndex : j;

            }
            swap(arr, i, minIndex);
        }
    }

    private void swap(T[] t, int present, int minIndex) {
        T temp = t[present];
        t[present] = t[minIndex];
        t[minIndex] = temp;
    }
}
