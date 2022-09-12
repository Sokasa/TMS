package strategy;


/**
 * 排序第三版。同时支持狗，猫等多种实体类排序
 * 由此，我们需要：
 * 1. 入参为泛型实体类的数组
 * 2. 需要实体类存在同一个排序行为(接口)
 * 3. 实体类自行实现这个排序行为
 * 4. 排序行为要作为入参
 */
public class Sorter3 {

    /**
     * 排序方法 3.0
     * 选择排序，依次找到每次循环的最小值并固定下来
     */
    void sort(SortComparable[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i+1; j < arr.length; j++) {
                // 使用dog的排序方法进行排序
                minIndex = arr[i].compareTo(arr[minIndex]) == -1 ? minIndex : j;

            }
            swap(arr, i, minIndex);
        }
    }

    private void swap(SortComparable[] t, int present, int minIndex) {
        SortComparable temp = t[present];
        t[present] = t[minIndex];
        t[minIndex] = temp;
    }
}
