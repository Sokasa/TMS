package strategy.model;

import strategy.SortCompareTor;

/**
 * Mosquito 排序策略，使用速度进行排序
 */
public class MosquitoSpeedSortCompareTor implements SortCompareTor<Mosquito> {


    @Override
    public int compare(Mosquito t1, Mosquito t2) {
        if (t1.getSpeed() > t2.getSpeed()) {
            return -1;
        } else if (t1.getSpeed() < t2.getSpeed()) {
            return 1;
        }
        return 0;
    }
}
