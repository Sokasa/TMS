package strategy.model;

import strategy.SortCompareTor;

/**
 * Cat4 排序策略，使用重量进行排序
 */
public class Cat4SortCompareTor  implements SortCompareTor<Cat4> {


    @Override
    public int compare(Cat4 t1, Cat4 t2) {
        if (t1.getWeight() < t2.getWeight()) {
            return -1;
        } else if (t1.getWeight() > t2.getWeight()) {
            return 1;
        }
        return 0;
    }
}
