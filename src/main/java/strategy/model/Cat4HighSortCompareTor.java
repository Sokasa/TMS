package strategy.model;

import strategy.SortCompareTor;

/**
 * Cat4 排序策略，使用高度进行排序
 */
public class Cat4HighSortCompareTor implements SortCompareTor<Cat4> {


    @Override
    public int compare(Cat4 t1, Cat4 t2) {
        if (t1.getHigh() < t2.getHigh()) {
            return -1;
        } else if (t1.getHigh() > t2.getHigh()) {
            return 1;
        }
        return 0;
    }
}
