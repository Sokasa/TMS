package strategy;

public interface SortComparable<T> {

    /**
     * 排序行为, T 为需要指定类型的泛型
     */
    int compareTo(T t);

}
