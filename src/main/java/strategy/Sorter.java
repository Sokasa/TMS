package strategy;

/**
 * 排序处理。支持各种对象的排序。参考 java.comparable
 */
public class Sorter {



    /**
     * 排序方法 1.0
     * 选择排序，依次找到每次循环的最小值并固定下来
     */
    void sort(int[] arr) {


        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i+1; j < arr.length; j++) {
                minIndex = arr[minIndex] > arr[j] ? j : minIndex;
            }
            swap(arr, i, minIndex);
        }
    }

    private static void swap(int[] arr, int present, int minIndex) {
        int temp = arr[present];
        arr[present] = arr[minIndex];
        arr[minIndex] = temp;
    }


}
