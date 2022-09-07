package strategy.model;

public class Dog {

    /**
     * 狗狗开销
     */
    private int cost;

    public Dog(int cost) {
        this.cost = cost;
    }

    /**
     * 对狗狗进行排序
     *
     * @return 排序结果 当前比dog小，返回-1；当前与dog相等，返回0；当前比dog大，则返回1
     */
    public int compareTo(Dog dog) {
        if (dog.cost > this.cost) {
            return -1;
        } else if (dog.cost == this.cost) {
            return 0;
        }
        return 1;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "cost=" + cost +
                '}';
    }
}
